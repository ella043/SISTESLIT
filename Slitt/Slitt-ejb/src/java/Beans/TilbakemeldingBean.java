/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Enteties.Tilbakemelding;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Kenneth
 */
@Stateless (name = "TilbakemeldingBean")
public class TilbakemeldingBean implements TilbakemeldingBeanRemote {
    
    @PersistenceContext
    EntityManager em;

    @Override
    public String Tilbakemelding(String Kommentar, String ModulTilbakemelding, String SvarPaaSpm, String Godkjenning) {
       Tilbakemelding u = new Tilbakemelding();
       u.setKommentar(Kommentar);
       u.setModulTilbakemelding(ModulTilbakemelding);
       u.setSvarPaaSpm(SvarPaaSpm);
       em.persist(u);
       return u.getModulTilbakemelding();
    }
    
    public boolean GodkjenningT(String godkjentIkkegodkjent) {
        List<Tilbakemelding> tilbakemeldingListe = em.createQuery(
        "SELECT t FROM Tilbakemelding t WHERE t.Godkjenning LIKE :godkjenning" )
        .setParameter("godkjenning", godkjentIkkegodkjent )   
        .setMaxResults(1)
        .getResultList();
        System.out.println("godkjenning" + godkjentIkkegodkjent);
        if(tilbakemeldingListe.isEmpty()){
            return false;
        }
         return true;
    }
                
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

