package iPhone;

public interface AparelhoTelefonico {

    Contato[] contatos = new Contato[100];

    boolean redeMovelDisponivel();

    public void ligar(String numero);
    public void atender(String numero);
    public void iniciarCorreioVoz(String mensagem, String destinatario);
}