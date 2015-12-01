/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enteties;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author elaine
 */
@Entity
public class Logglogg implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String gjort;
    private String laert;
    private String problemer;

    public String getGjort() {
        return gjort;
    }

    public void setGjort(String gjort) {
        this.gjort = gjort;
    }

    public String getLaert() {
        return laert;
    }

    public void setLaert(String laert) {
        this.laert = laert;
    }

    public String getProblemer() {
        return problemer;
    }

    public void setProblemer(String problemer) {
        this.problemer = problemer;
    }
   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Logglogg)) {
            return false;
        }
        Logglogg other = (Logglogg) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Enteties.Logg[ id=" + id + " ]";
    }
    
}
