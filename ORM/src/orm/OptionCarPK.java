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
public class OptionCarPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "car_serialNo")
    private int carserialNo;

    public OptionCarPK() {
    }

    public OptionCarPK(String name, int carserialNo) {
        this.name = name;
        this.carserialNo = carserialNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        hash += (name != null ? name.hashCode() : 0);
        hash += (int) carserialNo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OptionCarPK)) {
            return false;
        }
        OptionCarPK other = (OptionCarPK) object;
        if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name))) {
            return false;
        }
        if (this.carserialNo != other.carserialNo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "orm.OptionCarPK[ name=" + name + ", carserialNo=" + carserialNo + " ]";
    }
    
}
