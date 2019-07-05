package ihm.option;

public class OptionSortir extends OptionIhm{
   
    public OptionSortir() {
        super("Quitter la boulangerie");
    }

    @Override
    public void executer() {
        System.out.println("\nMerci d'avoir visité notre boulangerie et à la prochaine fois !");

    }
}
