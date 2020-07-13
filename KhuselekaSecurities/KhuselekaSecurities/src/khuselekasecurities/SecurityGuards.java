/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khuselekasecurities;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author matiw
 */
@Entity
@Table(name = "security_guards", catalog = "gate_control", schema = "")
@NamedQueries({
    @NamedQuery(name = "SecurityGuards.findAll", query = "SELECT s FROM SecurityGuards s")
    , @NamedQuery(name = "SecurityGuards.findByIdsecurityGuards", query = "SELECT s FROM SecurityGuards s WHERE s.idsecurityGuards = :idsecurityGuards")
    , @NamedQuery(name = "SecurityGuards.findByName", query = "SELECT s FROM SecurityGuards s WHERE s.name = :name")
    , @NamedQuery(name = "SecurityGuards.findByLastName", query = "SELECT s FROM SecurityGuards s WHERE s.lastName = :lastName")
    , @NamedQuery(name = "SecurityGuards.findByShift", query = "SELECT s FROM SecurityGuards s WHERE s.shift = :shift")
    , @NamedQuery(name = "SecurityGuards.findByContactNumber", query = "SELECT s FROM SecurityGuards s WHERE s.contactNumber = :contactNumber")
    , @NamedQuery(name = "SecurityGuards.findByAppPassword", query = "SELECT s FROM SecurityGuards s WHERE s.appPassword = :appPassword")})
public class SecurityGuards implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsecurity_guards")
    private Integer idsecurityGuards;
    @Column(name = "Name")
    private String name;
    @Column(name = "Last_Name")
    private String lastName;
    @Column(name = "Shift")
    private String shift;
    @Column(name = "Contact_Number")
    private String contactNumber;
    @Column(name = "App_Password")
    private String appPassword;

    public SecurityGuards() {
    }

    public SecurityGuards(Integer idsecurityGuards) {
        this.idsecurityGuards = idsecurityGuards;
    }

    public Integer getIdsecurityGuards() {
        return idsecurityGuards;
    }

    public void setIdsecurityGuards(Integer idsecurityGuards) {
        Integer oldIdsecurityGuards = this.idsecurityGuards;
        this.idsecurityGuards = idsecurityGuards;
        changeSupport.firePropertyChange("idsecurityGuards", oldIdsecurityGuards, idsecurityGuards);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        String oldLastName = this.lastName;
        this.lastName = lastName;
        changeSupport.firePropertyChange("lastName", oldLastName, lastName);
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        String oldShift = this.shift;
        this.shift = shift;
        changeSupport.firePropertyChange("shift", oldShift, shift);
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        String oldContactNumber = this.contactNumber;
        this.contactNumber = contactNumber;
        changeSupport.firePropertyChange("contactNumber", oldContactNumber, contactNumber);
    }

    public String getAppPassword() {
        return appPassword;
    }

    public void setAppPassword(String appPassword) {
        String oldAppPassword = this.appPassword;
        this.appPassword = appPassword;
        changeSupport.firePropertyChange("appPassword", oldAppPassword, appPassword);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsecurityGuards != null ? idsecurityGuards.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SecurityGuards)) {
            return false;
        }
        SecurityGuards other = (SecurityGuards) object;
        if ((this.idsecurityGuards == null && other.idsecurityGuards != null) || (this.idsecurityGuards != null && !this.idsecurityGuards.equals(other.idsecurityGuards))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "khuselekasecurities.SecurityGuards[ idsecurityGuards=" + idsecurityGuards + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
