package entite;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCom;
    private String refCom;
    private LocalDateTime dateCom;
    @Enumerated(EnumType.STRING)
    @Column
    private Statut statut;

    public Commande(Integer idCom, String refCom, LocalDateTime dateCom, Statut statut) {
        this.idCom = idCom;
        this.refCom = refCom;
        this.dateCom = dateCom;
        this.statut = statut;
    }

    public Commande(String refCom, LocalDateTime dateCom, Statut statut) {
        this.refCom = refCom;
        this.dateCom = dateCom;
        this.statut = statut;
    }

    public Commande() {
    }

    public Integer getIdCom() {
        return idCom;
    }

    public void setIdCom(Integer idCom) {
        this.idCom = idCom;
    }

    public String getRefCom() {
        return refCom;
    }

    public void setRefCom(String refCom) {
        this.refCom = refCom;
    }

    public LocalDateTime getDateCom() {
        return dateCom;
    }

    public void setDateCom(LocalDateTime dateCom) {
        this.dateCom = dateCom;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Commande [idCom=");
        builder.append(idCom);
        builder.append(", refCom=");
        builder.append(refCom);
        builder.append(", dateCom=");
        builder.append(dateCom);
        builder.append(", statut=");
        builder.append(statut);
        builder.append("]");
        return builder.toString();
    }

}
