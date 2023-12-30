package iPhone;

public interface NavegadorInternet {

    boolean conexaoComInternet();

    public default void exibirPagina(String url) {

    }

    public default void adicionarNovaAba(String url) {

    }


    public default void atualizarPagina(String url) {

    }

}