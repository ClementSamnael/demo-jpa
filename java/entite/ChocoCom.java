package entite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ChocoCom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idChoCom;
    @ManyToOne
    @JoinColumn(name = "idChoco")
    private Chocolatine choco;
    @ManyToOne
    @JoinColumn(name = "idCom")
    private Commande comm;
    private Integer quantite;
    private Integer prixCom;

    public ChocoCom(Chocolatine choco, Commande comm, Integer quantite, Integer prixCom) {
        this.choco = choco;
        this.comm = comm;
        this.quantite = quantite;
        this.prixCom = prixCom;
    }

    public ChocoCom(Integer idChoCom, Chocolatine choco, Commande comm, Integer quantite, Integer prixCom) {
        this.idChoCom = idChoCom;
        this.choco = choco;
        this.comm = comm;
        this.quantite = quantite;
        this.prixCom = prixCom;
    }

    public ChocoCom() {
    }

    public Integer getIdChoCom() {
        return idChoCom;
    }

    public void setIdChoCom(Integer idChoCom) {
        this.idChoCom = idChoCom;
    }

    public Chocolatine getChoco() {
        return choco;
    }

    public void setChoco(Chocolatine choco) {
        this.choco = choco;
    }

    public Commande getComm() {
        return comm;
    }

    public void setComm(Commande comm) {
        this.comm = comm;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Integer getPrixCom() {
        return prixCom;
    }

    public void setPrixCom(Integer prixCom) {
        this.prixCom = prixCom;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ChcoCom [idChoCom=");
        builder.append(idChoCom);
        builder.append(", choco=");
        builder.append(choco);
        builder.append(", comm=");
        builder.append(comm);
        builder.append(", quantite=");
        builder.append(quantite);
        builder.append("]");
        return builder.toString();
    }

}
