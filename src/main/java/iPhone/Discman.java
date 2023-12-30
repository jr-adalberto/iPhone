package iPhone;

public class Discman implements ReprodutorMusical{
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
