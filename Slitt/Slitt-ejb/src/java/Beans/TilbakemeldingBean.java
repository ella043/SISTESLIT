/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Enteties.Tilbakemelding;
import java.util.ArrayList;
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
    public long Tilbakemelding(String Kommentar, String ModulTilbakemelding, String SvarPaaSpm, String Godkjenning) {
       Tilbakemelding u = new Tilbakemelding();
       u.setKommentar(Kommentar);
       u.setModulTilbakemelding(ModulTilbakemelding);
       u.setSvarPaaSpm(SvarPaaSpm);
       u.setGodkjenning(Godkjenning);
       em.persist(u);
       return u.getId();
    }
    
    public boolean GodkjenningT(long id) {
       // ArrayList<Tilbakemelding> liste = new ArrayList<Tilbakemelding>();
        System.out.println("Skjekker ID" + id);
        List<Tilbakemelding> tilbakemeldingListe = em.createQuery(
        "SELECT t FROM Tilbakemelding t WHERE t.TilbakemeldingId LIKE :id" )
        .setParameter("id", id )   
        .setMaxResults(1)
        .getResultList();
        if(tilbakemeldingListe.isEmpty()){
            return false;
        }
        else {
            String godkjent = tilbakemeldingListe.get(0).getGodkjenning();
            System.out.println("godkjent: "+godkjent);
            return (godkjent.equals("Godkjent"));
    }
}
}
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

