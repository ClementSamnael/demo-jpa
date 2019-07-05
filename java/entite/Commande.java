package entite;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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

    @OneToMany(mappedBy = "Commande", cascade = CascadeType.ALL)
    private List<ChocoCom> contenu;

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
        contenu = new ArrayList<>();
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

    public List<ChocoCom> getContenu() {
        return contenu;
    }

    public void setContenu(List<ChocoCom> contenu) {
        this.contenu = contenu;
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
        builder.append(", contenu=");
        builder.append(contenu);
        builder.append("]");
        return builder.toString();
    }

    public void ajoutChocoCom(Chocolatine choco, Integer nb) {
        ChocoCom chocoCom = new ChocoCom(choco, this, nb, choco.getPrix());
    }

}
