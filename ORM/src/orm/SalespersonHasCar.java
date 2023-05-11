/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orm;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Islam
 */
@Entity
@Table(name = "salesperson_has_car")
@NamedQueries({
    @NamedQuery(name = "SalespersonHasCar.findAll", query = "SELECT s FROM SalespersonHasCar s"),
    @NamedQuery(name = "SalespersonHasCar.findBySalespersonId", query = "SELECT s FROM SalespersonHasCar s WHERE s.salespersonHasCarPK.salespersonId = :salespersonId"),
    @NamedQuery(name = "SalespersonHasCar.findByCarserialNo", query = "SELECT s FROM SalespersonHasCar s WHERE s.salespersonHasCarPK.carserialNo = :carserialNo"),
    @NamedQuery(name = "SalespersonHasCar.findByDate", query = "SELECT s FROM SalespersonHasCar s WHERE s.date = :date"),
    @NamedQuery(name = "SalespersonHasCar.findBySaleprice", query = "SELECT s FROM SalespersonHasCar s WHERE s.saleprice = :saleprice")})
public class SalespersonHasCar implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SalespersonHasCarPK salespersonHasCarPK;
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "saleprice")
    private Float saleprice;

    public SalespersonHasCar() {
    }

    public SalespersonHasCar(SalespersonHasCarPK salespersonHasCarPK) {
        this.salespersonHasCarPK = salespersonHasCarPK;
    }

    public SalespersonHasCar(String salespersonId, int carserialNo) {
        this.salespersonHasCarPK = new SalespersonHasCarPK(salespersonId, carserialNo);
    }

    public SalespersonHasCarPK getSalespersonHasCarPK() {
        return salespersonHasCarPK;
    }

    public void setSalespersonHasCarPK(SalespersonHasCarPK salespersonHasCarPK) {
        this.salespersonHasCarPK = salespersonHasCarPK;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getSaleprice() {
        return saleprice;
    }

    public SalespersonHasCarPK getsalespersonHasCarPK() {
        return this.salespersonHasCarPK;
    }
    
    public void setSaleprice(Float saleprice) {
        this.saleprice = saleprice;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salespersonHasCarPK != null ? salespersonHasCarPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalespersonHasCar)) {
            return false;
        }
        SalespersonHasCar other = (SalespersonHasCar) object;
        if ((this.salespersonHasCarPK == null && other.salespersonHasCarPK != null) || (this.salespersonHasCarPK != null && !this.salespersonHasCarPK.equals(other.salespersonHasCarPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "orm.SalespersonHasCar[ salespersonHasCarPK=" + salespersonHasCarPK + " ]";
    }
    
}
