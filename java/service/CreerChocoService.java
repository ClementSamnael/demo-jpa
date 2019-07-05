package service;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entite.Chocolatine;
import util.Constantes;

public class CreerChocoService {

    private EntityManager em;
    private EntityTransaction tx;

    private EntityManagerFactoryService emfService = Constantes.EMF_SERVICE;
    private Scanner scan = new Scanner(System.in);
    
    
    public void executer() {
        em = emfService.getEMF().createEntityManager();
        tx = em.getTransaction();
        tx.begin();
        
        System.out.println("Nom de la chocolatine : ");
        String nom = scan.next();
        System.out.println("Température de la chocolatine : ");
        Float tmprtr = scan.nextFloat();
        System.out.println("Poids de la chocolatine : ");
        Float pds = scan.nextFloat();
        System.out.println("Prix de la chocolatine : ");
        Float prx = scan.nextFloat();
        
        Chocolatine choco = new Chocolatine(nom, tmprtr, pds, prx);
        em.persist(choco);
        tx.commit();
        em.close();
        
    }
    
}
