package entite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Chocolatine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idChoco;
    private String nom;
    private Float temperature;
    private Float poids;
    private Float prix;

    public Chocolatine(Integer idChoco, String nom, Float temperature, Float poids, Float prix) {
        this.idChoco = idChoco;
        this.nom = nom;
        this.temperature = temperature;
        this.poids = poids;
        this.prix = prix;
    }

    public Chocolatine(String nom, Float temperature, Float poids, Float prix) {
        this.nom = nom;
        this.temperature = temperature;
        this.poids = poids;
        this.prix = prix;
    }

    public Chocolatine() {
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public Integer getIdChoco() {
        return idChoco;
    }

    public void setIdChoco(Integer idChoco) {
        this.idChoco = idChoco;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public Float getPoids() {
        return poids;
    }

    public void setPoids(Float poids) {
        this.poids = poids;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Chocolatine (idChoco=");
        builder.append(idChoco);
        builder.append(") : \n\tNom = ");
        builder.append(nom);
        builder.append(", \n\tTemperature = ");
        builder.append(temperature);
        builder.append(", \n\tPoids = ");
        builder.append(poids);
        builder.append("\n");
        return builder.toString();
    }

}
