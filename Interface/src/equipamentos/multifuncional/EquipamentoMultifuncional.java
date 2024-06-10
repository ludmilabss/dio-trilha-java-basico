package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora {
    public void copiar() {
        System.out.println("copiando equipamento multifuncional");
    }

    public void imprimir() {
        System.out.println("imprimindo equipamento multifuncional");
    }

    public void digitalizar() {
        System.out.println("digitalizando equipamento multifuncional");
    }
}

