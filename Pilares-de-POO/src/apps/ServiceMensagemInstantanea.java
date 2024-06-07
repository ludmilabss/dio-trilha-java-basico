package apps;

public abstract class ServiceMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    // somente os filhos e classes do mesmo pacote reconhecem esse método
    protected void validarConectadoInternet() {
        System.out.println("Conectado com o Internet");
    }
}
