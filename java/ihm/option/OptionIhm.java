package ihm.option;

public abstract class OptionIhm {

    private String libelle;

    public OptionIhm(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("OptionIHM [libelle=");
        builder.append(libelle);
        builder.append("]");
        return builder.toString();
    }

    public abstract void executer();

}
