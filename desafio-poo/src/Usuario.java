import aparelho.IPhone;

public class Usuario {

    public static void main(String[] args) {

        IPhone iphone = new IPhone();

        System.out.println("------------------");
        System.out.println("Reprodutor musical");
        System.out.println("------------------");
        iphone.selecionarMusica("A Gente Junto - Anavitória");
        iphone.tocarMusica();
        iphone.pausarMusica();

        System.out.println("\n---------------------");
        System.out.println("Navegador de internet");
        System.out.println("---------------------");
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.println("\n-------------------");
        System.out.println("Aparelho telefônico");
        System.out.println("-------------------");
        iphone.ligar("435353434");
        iphone.atender();
        iphone.iniciarCorreioVoz();




    }
}
