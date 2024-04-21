
public class Tv implements Device {
    private boolean ligado = false;
    private int volume = 30;
    private int canal = 1;

    @Override
    public boolean estaLigado() {
        return ligado;
    }

    @Override
    public void ligar() {
        ligado = true;
    }

    @Override
    public void desligar() {
        ligado = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }

    @Override
    public int getCanal() {
        return canal;
    }

    @Override
    public void setCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public void imprimirStatus() {
        System.out.println("------------------------------------");
        System.out.println("| TV.");
        System.out.println("| Estou " + (ligado ? "ligada" : "desligada"));
        System.out.println("| Volume atual é " + volume + "%");
        System.out.println("| Canal atual é " + canal);
        System.out.println("------------------------------------\n");
    }
}