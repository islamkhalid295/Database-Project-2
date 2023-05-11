/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orm;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Islam
 */
@Entity
@Table(name = "salesperson")
@NamedQueries({
    @NamedQuery(name = "Salesperson.findAll", query = "SELECT s FROM Salesperson s"),
    @NamedQuery(name = "Salesperson.findById", query = "SELECT s FROM Salesperson s WHERE s.id = :id"),
    @NamedQuery(name = "Salesperson.findByName", query = "SELECT s FROM Salesperson s WHERE s.name = :name"),
    @NamedQuery(name = "Salesperson.findByPhone", query = "SELECT s FROM Salesperson s WHERE s.phone = :phone")})
public class Salesperson implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "phone")
    private String phone;

    public Salesperson() {
    }

    public Salesperson(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
        if (!(object instanceof Salesperson)) {
            return false;
        }
        Salesperson other = (Salesperson) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "orm.Salesperson[ id=" + id + " ]";
    }
    
}
