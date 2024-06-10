package aparelho;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    public void ligar(String numero) {
        System.out.println("Realizando a chamada para: " + numero);
    }

    public void atender() {
        System.out.println("Chamada atendida!");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando novo aba...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }

    public void tocarMusica() {
        System.out.println("Tocando musica...");
    }

    public void pausarMusica() {
        System.out.println("Pausando musica...");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }
}
