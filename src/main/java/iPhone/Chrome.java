package iPhone;

public class Chrome implements NavegadorInternet{
    @Override
    public void exibirPagina(String url) {
        NavegadorInternet.super.exibirPagina(url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        NavegadorInternet.super.adicionarNovaAba(url);
    }

    @Override
    public void atualizarPagina(String url) {
        NavegadorInternet.super.atualizarPagina(url);
    }
}
