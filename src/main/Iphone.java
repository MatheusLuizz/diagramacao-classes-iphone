package main;

public class Iphone implements NavegadorDeInternet, ReprodutorMusical, AparelhoTelefonico {

    @Override
    public void ligar() {
        System.out.println("Fazendo chamada pelo Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada pelo IPhone");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz pelo IPhone");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página na internet");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página na internet");
    }

    @Override
    public void exibirNovaAba() {
        System.out.println("Exibindo nova aba");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }
}
