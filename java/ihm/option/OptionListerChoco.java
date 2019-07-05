package ihm.option;

import service.ListeChocolatineService;

public class OptionListerChoco extends OptionIhm {

    private ListeChocolatineService listerChocolatines;

    public OptionListerChoco() {
        super("Lister les chocolatines");

        listerChocolatines = new ListeChocolatineService();
    }

    @Override
    public void executer() {
        System.out.println("\nListe de chocolatines : ");
        listerChocolatines.executer();
    }
}
