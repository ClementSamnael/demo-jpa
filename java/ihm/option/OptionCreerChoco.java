package ihm.option;

import service.CreerChocoService;

public class OptionCreerChoco extends OptionIhm{
    
    private CreerChocoService creerChoco;
    
    public OptionCreerChoco() {
        super("Créer une chocolatine");
        creerChoco = new CreerChocoService();
        
    }

    @Override
    public void executer() {
        System.out.println("\nCréer une chocolatines : ");
        creerChoco.executer();
    }
}
