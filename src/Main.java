import components.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone meuIphone = new Iphone();

        System.out.println("Navegação");
        meuIphone.selecionarMusica();
        meuIphone.tocar();
        meuIphone.pausar();

        System.out.println("Chamada");
        meuIphone.ligar();
        meuIphone.atender();
        meuIphone.iniciarCorreioDeVoz();

        System.out.println("Reproduzir Música");
        meuIphone.adicionarNovaAba();
        meuIphone.exibirPagina();
        meuIphone.atualizarPagina();
    }
}