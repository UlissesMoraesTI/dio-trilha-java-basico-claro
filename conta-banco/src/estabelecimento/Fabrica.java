package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {

        // ok
        // Impressora impressora = new Deskjet();
        // impressora.imprimir();

        // ok
        // Impressora impressora = new Laserjet();
        // impressora.imprimir();

        // ok
        // Impressora impressora = new EquipamentoMultifuncional();
        // impressora.imprimir();

        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
