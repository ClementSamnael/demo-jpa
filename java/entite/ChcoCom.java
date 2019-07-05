package entite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ChcoCom {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idChoCom;
    @ManyToOne
    @JoinColumn(name="")
    private Chocolatine choco;
    @ManyToOne
    private Commande comm;
    private Integer quantite;
    

}
