package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import entite.Chocolatine;
import util.Constantes;

public class ListeChocolatineService {

    private EntityManager em;
    private EntityTransaction tx;

    private EntityManagerFactoryService emfService = Constantes.EMF_SERVICE;

    public ListeChocolatineService() {
    }

    public void executer() {
        em = emfService.getEMF().createEntityManager();
        tx = em.getTransaction();
        tx.begin();

        TypedQuery<Chocolatine> query = em.createQuery("select c from Chocolatine c", Chocolatine.class);
        List<Chocolatine> liste = query.getResultList();

        liste.forEach(System.out::println);

        tx.commit();
        em.close();

    }

}
