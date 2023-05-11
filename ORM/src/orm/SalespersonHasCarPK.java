/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orm;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Islam
 */
@Embeddable
public class SalespersonHasCarPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "salesperson_id")
    private String salespersonId;
    @Basic(optional = false)
    @Column(name = "car_serialNo")
    private int carserialNo;

    public SalespersonHasCarPK() {
    }

    public SalespersonHasCarPK(String salespersonId, int carserialNo) {
        this.salespersonId = salespersonId;
        this.carserialNo = carserialNo;
    }

    public String getSalespersonId() {
        return salespersonId;
    }

    public void setSalespersonId(String salespersonId) {
        this.salespersonId = salespersonId;
    }

    public int getCarserialNo() {
        return carserialNo;
    }

    public void setCarserialNo(int carserialNo) {
        this.carserialNo = carserialNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salespersonId != null ? salespersonId.hashCode() : 0);
        hash += (int) carserialNo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalespersonHasCarPK)) {
            return false;
        }
        SalespersonHasCarPK other = (SalespersonHasCarPK) object;
        if ((this.salespersonId == null && other.salespersonId != null) || (this.salespersonId != null && !this.salespersonId.equals(other.salespersonId))) {
            return false;
        }
        if (this.carserialNo != other.carserialNo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "orm.SalespersonHasCarPK[ salespersonId=" + salespersonId + ", carserialNo=" + carserialNo + " ]";
    }
    
}
