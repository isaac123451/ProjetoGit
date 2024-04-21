public interface Device {
    boolean estaLigado();

    void ligar();

    void desligar();

    int getVolume();

    void setVolume(int percentual);

    int getCanal();

    void setCanal(int canal);

    void imprimirStatus();
}

