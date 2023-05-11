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
@Table(name = "car")
@NamedQueries({
    @NamedQuery(name = "Car.findAll", query = "SELECT c FROM Car c"),
    @NamedQuery(name = "Car.findAllDesc", query = "SELECT c FROM Car c order by c.price desc"),
    @NamedQuery(name = "Car.findBySerialNo", query = "SELECT c FROM Car c WHERE c.serialNo = :serialNo"),
    @NamedQuery(name = "Car.findByModel", query = "SELECT c FROM Car c WHERE c.model = :model"),
    @NamedQuery(name = "Car.findByManufacture", query = "SELECT c FROM Car c WHERE c.manufacture = :manufacture"),
    @NamedQuery(name = "Car.findByPrice", query = "SELECT c FROM Car c WHERE c.price = :price")})
public class Car implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "serialNo")
    private Integer serialNo;
    @Column(name = "Model")
    private String model;
    @Column(name = "Manufacture")
    private String manufacture;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "price")
    private Float price;

    public Car() {
    }

    public Car(Integer serialNo) {
        this.serialNo = serialNo;
    }

    public Integer getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(Integer serialNo) {
        this.serialNo = serialNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (serialNo != null ? serialNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Car)) {
            return false;
        }
        Car other = (Car) object;
        if ((this.serialNo == null && other.serialNo != null) || (this.serialNo != null && !this.serialNo.equals(other.serialNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "orm.Car[ serialNo=" + serialNo +" , model: "+model+" , price: "+price+" , Manufacture: "+manufacture+" ]";
    }
    
}
