/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Enteties.Logglogg;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author elaine
 */
@Stateless
public class LoggBean implements LoggBeanRemote {
    @PersistenceContext
    EntityManager em;

    @Override
    public boolean addLogg(String done, String learnt, String problems) {
        Logglogg l = new Logglogg();
        l.setDone(done);
        l.setLearnt(learnt);
        l.setProblems(problems);
        em.persist(l);
        return true; 
        }
    
    /*@Override
    public boolean saveLogg(String gjort, String laert, String problemer) {
        @SuppressWarnings("JPQLValidation")
        List<Logglogg> loggListe;
        loggListe = em.createQuery(
                "SELECT l FROM Logglogg l WHERE l.Gjort LIKE :harGjort AND l.Laert LIKE :harLaert AND l.Problemer LIKE :harProblemer" )
                .setParameter("harGjort", gjort)
                .setParameter("harLaert", laert)
                .setParameter("harProblemer", problemer)
                .setMaxResults(1)
                .getResultList();
        System.out.println("" + gjort);
        if(loggListe.isEmpty()){
            return false;
        }
        return true;
    }*/

} 
