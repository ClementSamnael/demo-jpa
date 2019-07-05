package ihm;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import ihm.option.OptionCreerChoco;
import ihm.option.OptionIhm;
import ihm.option.OptionListerChoco;
import ihm.option.OptionSortir;
import util.Constantes;

public class Menu {

    private Map<Integer, OptionIhm> listeOptionsIHM;
    private int choix;

    private ScannerService scannerService = Constantes.SCANNER_SERVICE;

    public Menu() {
        initMenu();
    }

    private void initMenu() {

        while (choix != 9) {
            listeOptionsIHM = new HashMap<Integer, OptionIhm>();
            listeOptionsIHM.put(1, new OptionListerChoco());
            listeOptionsIHM.put(2, new OptionCreerChoco());
//            listeOptionsIHM.put(3, new OptionCreerCommande());
//            listeOptionsIHM.put(4, new OptionTopChocolatine());
//            listeOptionsIHM.put(5, new OptionCreerLivreur());
//            listeOptionsIHM.put(6, new OptionAffecterLivreurACommande());
            listeOptionsIHM.put(9, new OptionSortir());

            System.out.println("*********** Bienvenue chez Glen ***********");
            System.out.println("\nVeuillez choisir parmi les options suivantes : \n");

            for (Entry<Integer, OptionIhm> element : listeOptionsIHM.entrySet()) {
                System.out.println(element.getKey() + ". " + element.getValue().getLibelle());
            }

            System.out.print("\nChoix = ");
            choix = scannerService.getScanner().nextInt();

            listeOptionsIHM.get(choix).executer();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}
