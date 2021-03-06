/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "datospersonales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Datospersonales.findAll", query = "SELECT d FROM Datospersonales d"),
    @NamedQuery(name = "Datospersonales.findByDatid", query = "SELECT d FROM Datospersonales d WHERE d.datid = :datid"),
    @NamedQuery(name = "Datospersonales.findByDatnombre", query = "SELECT d FROM Datospersonales d WHERE d.datnombre = :datnombre"),
    @NamedQuery(name = "Datospersonales.findByDatapellido", query = "SELECT d FROM Datospersonales d WHERE d.datapellido = :datapellido"),
    @NamedQuery(name = "Datospersonales.findByDatipoid", query = "SELECT d FROM Datospersonales d WHERE d.datipoid = :datipoid"),
    @NamedQuery(name = "Datospersonales.findByDatnumeroid", query = "SELECT d FROM Datospersonales d WHERE d.datnumeroid = :datnumeroid"),
    @NamedQuery(name = "Datospersonales.findByDatelefono", query = "SELECT d FROM Datospersonales d WHERE d.datelefono = :datelefono"),
    @NamedQuery(name = "Datospersonales.findByDatcorreo", query = "SELECT d FROM Datospersonales d WHERE d.datcorreo = :datcorreo")})
public class Datospersonales implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "DATID", nullable = false)
    private Integer datid;
    @Size(max = 50)
    @Column(name = "DATNOMBRE", length = 50)
    private String datnombre;
    @Size(max = 50)
    @Column(name = "DATAPELLIDO", length = 50)
    private String datapellido;
    @Size(max = 20)
    @Column(name = "DATIPOID", length = 20)
    private String datipoid;
    @Size(max = 20)
    @Column(name = "DATNUMEROID", length = 20)
    private String datnumeroid;
    @Size(max = 20)
    @Column(name = "DATELEFONO", length = 20)
    private String datelefono;
    @Size(max = 50)
    @Column(name = "DATCORREO", length = 50)
    private String datcorreo;
    @JoinColumn(name = "USUID", referencedColumnName = "USUID")
    @ManyToOne
    private Usuario usuid;
    @OneToMany(mappedBy = "datid")
    private List<Vehiculo> vehiculoList;

    public Datospersonales() {
    }

    public Datospersonales(Integer datid) {
        this.datid = datid;
    }

    public Integer getDatid() {
        return datid;
    }

    public void setDatid(Integer datid) {
        this.datid = datid;
    }

    public String getDatnombre() {
        return datnombre;
    }

    public void setDatnombre(String datnombre) {
        this.datnombre = datnombre;
    }

    public String getDatapellido() {
        return datapellido;
    }

    public void setDatapellido(String datapellido) {
        this.datapellido = datapellido;
    }

    public String getDatipoid() {
        return datipoid;
    }

    public void setDatipoid(String datipoid) {
        this.datipoid = datipoid;
    }

    public String getDatnumeroid() {
        return datnumeroid;
    }

    public void setDatnumeroid(String datnumeroid) {
        this.datnumeroid = datnumeroid;
    }

    public String getDatelefono() {
        return datelefono;
    }

    public void setDatelefono(String datelefono) {
        this.datelefono = datelefono;
    }

    public String getDatcorreo() {
        return datcorreo;
    }

    public void setDatcorreo(String datcorreo) {
        this.datcorreo = datcorreo;
    }

    public Usuario getUsuid() {
        return usuid;
    }

    public void setUsuid(Usuario usuid) {
        this.usuid = usuid;
    }

    @XmlTransient
    public List<Vehiculo> getVehiculoList() {
        return vehiculoList;
    }

    public void setVehiculoList(List<Vehiculo> vehiculoList) {
        this.vehiculoList = vehiculoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (datid != null ? datid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Datospersonales)) {
            return false;
        }
        Datospersonales other = (Datospersonales) object;
        if ((this.datid == null && other.datid != null) || (this.datid != null && !this.datid.equals(other.datid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entities.Datospersonales[ datid=" + datid + " ]";
    }
    
}
