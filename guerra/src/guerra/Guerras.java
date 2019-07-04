/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guerra;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Luis Alberto Mero
 */
@Entity
@Table(name = "guerras", catalog = "guerra", schema = "")
@NamedQueries({
    @NamedQuery(name = "Guerras.findAll", query = "SELECT g FROM Guerras g")
    , @NamedQuery(name = "Guerras.findByIdguerras", query = "SELECT g FROM Guerras g WHERE g.idguerras = :idguerras")
    , @NamedQuery(name = "Guerras.findByNombre", query = "SELECT g FROM Guerras g WHERE g.nombre = :nombre")
    , @NamedQuery(name = "Guerras.findByAnioInicio", query = "SELECT g FROM Guerras g WHERE g.anioInicio = :anioInicio")
    , @NamedQuery(name = "Guerras.findByAnioFin", query = "SELECT g FROM Guerras g WHERE g.anioFin = :anioFin")})
public class Guerras implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idguerras")
    private Integer idguerras;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "anio_inicio")
    @Temporal(TemporalType.DATE)
    private Date anioInicio;
    @Basic(optional = false)
    @Column(name = "anio_fin")
    @Temporal(TemporalType.DATE)
    private Date anioFin;

    public Guerras() {
    }

    public Guerras(Integer idguerras) {
        this.idguerras = idguerras;
    }

    public Guerras(Integer idguerras, String nombre, Date anioInicio, Date anioFin) {
        this.idguerras = idguerras;
        this.nombre = nombre;
        this.anioInicio = anioInicio;
        this.anioFin = anioFin;
    }

    public Integer getIdguerras() {
        return idguerras;
    }

    public void setIdguerras(Integer idguerras) {
        Integer oldIdguerras = this.idguerras;
        this.idguerras = idguerras;
        changeSupport.firePropertyChange("idguerras", oldIdguerras, idguerras);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public Date getAnioInicio() {
        return anioInicio;
    }

    public void setAnioInicio(Date anioInicio) {
        Date oldAnioInicio = this.anioInicio;
        this.anioInicio = anioInicio;
        changeSupport.firePropertyChange("anioInicio", oldAnioInicio, anioInicio);
    }

    public Date getAnioFin() {
        return anioFin;
    }

    public void setAnioFin(Date anioFin) {
        Date oldAnioFin = this.anioFin;
        this.anioFin = anioFin;
        changeSupport.firePropertyChange("anioFin", oldAnioFin, anioFin);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idguerras != null ? idguerras.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Guerras)) {
            return false;
        }
        Guerras other = (Guerras) object;
        if ((this.idguerras == null && other.idguerras != null) || (this.idguerras != null && !this.idguerras.equals(other.idguerras))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "guerra.Guerras[ idguerras=" + idguerras + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
