package iPhone;

public class Nokia3310 implements ReprodutorMusical, AparelhoTelefonico {

    @Override
    public void ligar(String numero) {

    }

    @Override
    public void atender(String numero) {

    }

    @Override
    public void iniciarCorreioVoz(String mensagem, String destinatario) {

    }

    @Override
    public void tocar(String musica) {
        ReprodutorMusical.super.tocar(musica);
    }

    @Override
    public void pausar(String musica) {
        ReprodutorMusical.super.pausar(musica);
    }

    @Override
    public void selecionarMusica(String music) {
        ReprodutorMusical.super.selecionarMusica(music);
    }
}
