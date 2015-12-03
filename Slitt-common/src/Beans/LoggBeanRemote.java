/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import javax.ejb.Remote;

/**
 *
 * @author elaine
 */
@Remote
public interface LoggBeanRemote {
    
    public boolean addLogg(String done, String learnt, String problems);
    //public boolean saveLogg(String done, String laernt, String problems);
    
}
