/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slittclient;

import Beans.FremgangBeanRemote;
import Beans.InnleveringBeanRemote;
import Beans.KalenderBeanRemote;
import Beans.ModulBeanRemote;
import Beans.TilbakemeldingBeanRemote;
import Beans.UserBeanRemote;
import javax.ejb.EJB;
import phunk.Innlogging;
import phunk.Tilbakemelding2;

/**
 *
 * @author Kenneth
 */
public class Main {
    @EJB (name = "TilbakemeldingBean")
    private static TilbakemeldingBeanRemote TilbakemeldingRemote;
    @EJB (name = "InnleveringBean")
    private static InnleveringBeanRemote InnleveringRemote;
    @EJB (name = "KalenderBean")
    private static KalenderBeanRemote KalenderRemote;
    @EJB (name = "ModulBean")
    private static ModulBeanRemote ModulRemote;
    @EJB(name = "FremgangBean")
    private static FremgangBeanRemote FremgangRemote;

    /**
     * @param args the command line arguments
     */
    @EJB(name = "UserBean")
    private static UserBeanRemote UserRemote;
    public static void main(String[] args) {
       // TestBeanHandler tHandler = new TestBeanHandler();
       // tHandler.printTest();
        
        /*String user = UserRemote.AddUser("Elaine", "Sajets", 40169322, "Elaine@hotamil.com");
        System.out.print(user);
        
        String fremgang = FremgangRemote.Fremgang("Ikke Godkjent", "Masse Dårlig", "Gjorde det og det");
        System.out.print(fremgang);
        
        String modul = ModulRemote.Modul("Ressurs", "Masse kriterier", 2);
        System.out.print(modul);
        
        String kalender = KalenderRemote.Kalender("15.November",Boolean.FALSE, "Frist : 20.November");
        System.out.print(kalender);
        
        String innlevering = InnleveringRemote.Innlevering("Lastet opp","Veldig dårlig", "Modul.jar");
        System.out.print(innlevering);
        
        String tilbakemelding = TilbakemeldingRemote.Tilbakemelding("Ikke så bra jobbet","Modul trengs ditt og datt","Nei det var en setter", Boolean.FALSE);
        System.out.print(tilbakemelding);
        
        UserRemote.delete("Oystein");
                */
        
        Innlogging i = new Innlogging();
        i.setVisible(true);
        
        Tilbakemelding2 t = new Tilbakemelding2();
        t.setVisible(true);
        
    
        
        
                
                
    }
    
    public String addUser(String firstname, String lastname, int telephone, String mail, String username, String password){
        return UserRemote.AddUser(firstname, lastname, telephone, mail, username, password);
        
      
    }
    
    
    public static boolean loginUser(String username, String password){
        System.out.println(username + ", "  + password);
        boolean result = UserRemote.loggInn(username, password);
        System.out.println("result " + result);
        return result;
        
    } 
    
    public static boolean Godkjenning(String godkjentIkkegodkjent){
        System.out.println(godkjentIkkegodkjent);
        boolean result = TilbakemeldingRemote.GodkjenningT(godkjentIkkegodkjent);
        System.out.println("Modulen er " + result);
        return result;
    }
 
}

