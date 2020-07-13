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
@Table(name = "visitors", catalog = "gate_control", schema = "")
@NamedQueries({
    @NamedQuery(name = "Visitors.findAll", query = "SELECT v FROM Visitors v")
    , @NamedQuery(name = "Visitors.findByIdVisitors", query = "SELECT v FROM Visitors v WHERE v.idVisitors = :idVisitors")
    , @NamedQuery(name = "Visitors.findByDate", query = "SELECT v FROM Visitors v WHERE v.date = :date")
    , @NamedQuery(name = "Visitors.findByTimeIn", query = "SELECT v FROM Visitors v WHERE v.timeIn = :timeIn")
    , @NamedQuery(name = "Visitors.findByName", query = "SELECT v FROM Visitors v WHERE v.name = :name")
    , @NamedQuery(name = "Visitors.findByFromCompany", query = "SELECT v FROM Visitors v WHERE v.fromCompany = :fromCompany")
    , @NamedQuery(name = "Visitors.findByVehicleRegNo", query = "SELECT v FROM Visitors v WHERE v.vehicleRegNo = :vehicleRegNo")
    , @NamedQuery(name = "Visitors.findByTelNo", query = "SELECT v FROM Visitors v WHERE v.telNo = :telNo")
    , @NamedQuery(name = "Visitors.findByReasonforVisit", query = "SELECT v FROM Visitors v WHERE v.reasonforVisit = :reasonforVisit")
    , @NamedQuery(name = "Visitors.findByPersontosee", query = "SELECT v FROM Visitors v WHERE v.persontosee = :persontosee")})
public class Visitors implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idVisitors")
    private Integer idVisitors;
    @Column(name = "Date")
    private String date;
    @Column(name = "Time_In")
    private String timeIn;
    @Column(name = "Name")
    private String name;
    @Column(name = "From_Company")
    private String fromCompany;
    @Column(name = "Vehicle_Reg_No")
    private String vehicleRegNo;
    @Column(name = "Tel_No")
    private String telNo;
    @Column(name = "Reason_for_Visit")
    private String reasonforVisit;
    @Column(name = "Person_to_see")
    private String persontosee;

    public Visitors() {
    }

    public Visitors(Integer idVisitors) {
        this.idVisitors = idVisitors;
    }

    public Integer getIdVisitors() {
        return idVisitors;
    }

    public void setIdVisitors(Integer idVisitors) {
        Integer oldIdVisitors = this.idVisitors;
        this.idVisitors = idVisitors;
        changeSupport.firePropertyChange("idVisitors", oldIdVisitors, idVisitors);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        String oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    public String getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(String timeIn) {
        String oldTimeIn = this.timeIn;
        this.timeIn = timeIn;
        changeSupport.firePropertyChange("timeIn", oldTimeIn, timeIn);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getFromCompany() {
        return fromCompany;
    }

    public void setFromCompany(String fromCompany) {
        String oldFromCompany = this.fromCompany;
        this.fromCompany = fromCompany;
        changeSupport.firePropertyChange("fromCompany", oldFromCompany, fromCompany);
    }

    public String getVehicleRegNo() {
        return vehicleRegNo;
    }

    public void setVehicleRegNo(String vehicleRegNo) {
        String oldVehicleRegNo = this.vehicleRegNo;
        this.vehicleRegNo = vehicleRegNo;
        changeSupport.firePropertyChange("vehicleRegNo", oldVehicleRegNo, vehicleRegNo);
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        String oldTelNo = this.telNo;
        this.telNo = telNo;
        changeSupport.firePropertyChange("telNo", oldTelNo, telNo);
    }

    public String getReasonforVisit() {
        return reasonforVisit;
    }

    public void setReasonforVisit(String reasonforVisit) {
        String oldReasonforVisit = this.reasonforVisit;
        this.reasonforVisit = reasonforVisit;
        changeSupport.firePropertyChange("reasonforVisit", oldReasonforVisit, reasonforVisit);
    }

    public String getPersontosee() {
        return persontosee;
    }

    public void setPersontosee(String persontosee) {
        String oldPersontosee = this.persontosee;
        this.persontosee = persontosee;
        changeSupport.firePropertyChange("persontosee", oldPersontosee, persontosee);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVisitors != null ? idVisitors.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Visitors)) {
            return false;
        }
        Visitors other = (Visitors) object;
        if ((this.idVisitors == null && other.idVisitors != null) || (this.idVisitors != null && !this.idVisitors.equals(other.idVisitors))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "khuselekasecurities.Visitors[ idVisitors=" + idVisitors + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
