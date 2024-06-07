import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServiceMensagemInstantanea;
import apps.Telegram;

// Simulação do uso da classe apps.MSNMessenger
public class ComputadorPedrinho {
    public static void main(String[] args) {
      ServiceMensagemInstantanea smi = null;

      String appEscolhido = "msn";

      if (appEscolhido.equals("msn")) {
          smi = new MSNMessenger();
      } else if (appEscolhido.equals("fbk")) {
          smi = new FacebookMessenger();
      } else if (appEscolhido.equals("tlg")) {
          smi = new Telegram();
      }

      smi.enviarMensagem();
      smi.receberMensagem();
    }
}