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
    
    public String addLogg(String gjort, String laert, String problemer);
    public boolean saveLogg(String gjort, String laert, String problemer);
    
}
