package tester;

import entity.Country;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Tester {
    
    public static void main(String[] args) {
        
        /*
        Standart mønster:
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        
        try {
            
        } finally {
            em.close();
        }
        */
        
        // Kan give værdier med fx hvis brugernavn og password ikke skal stå i persistence.xml: 
        //          EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu", null);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        
        try {
            
            Country c1 = new Country("Denmark", "Germany");
            Country c2 = new Country("Iceland", "");
            Country c3 = new Country("Malta", "");
            
            em.getTransaction().begin();
                em.persist(c1);
                em.persist(c2);
                em.persist(c3);
            em.getTransaction().commit();
            
        } finally {
            // Lukker kun Entity Manageren, kunne lukke begge:
            em.close();
        }
        
    }
    
}
