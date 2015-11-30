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

    /**
     *
     * @param gjort
     * @param laert
     * @param problemer
     * @return
     */
    public String addLogg(String gjort, String laert, String problemer);

    /**
     *
     * @param gjort
     * @param laert
     * @param problemer
     */
    public boolean saveLogg(String gjort, String laert, String problemer);
    
}
