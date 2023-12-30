package iPhone;

public class Musica {
     String titulo;
     String caminho;

    public Musica(String titulo, String caminho) {
        this.titulo = titulo;
        this.caminho = caminho;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCaminho() {
        return caminho;
    }
}