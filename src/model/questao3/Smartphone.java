package model.questao3;

public class Smartphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    private String marca;
    private String modelo;
    private boolean ligado;
    private int volume;

    public Smartphone (String marca, String modelo, boolean ligado, int volume) {

        this.marca = marca;
        this.modelo = modelo;
        this.ligado = ligado;
        this.volume = volume;

    }

    //Getter
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getVolume() { return volume; }

    //Setter
    public void setMarca(String marca) { this.marca = marca; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setLigado(boolean ligado) { this.ligado = ligado; }
    public void setVolume(int volume) { this.volume = volume; }

    @Override
    public boolean ligar() {
        System.out.println("Ligando aparelho...");
        ligado = true;
        return ligado;
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida!");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

}
