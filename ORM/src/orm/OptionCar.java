/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orm;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Islam
 */
@Entity
@Table(name = "option_car")
@NamedQueries({
    @NamedQuery(name = "OptionCar.findAll", query = "SELECT o FROM OptionCar o"),
    @NamedQuery(name = "OptionCar.findByName", query = "SELECT o FROM OptionCar o WHERE o.optionCarPK.name = :name"),
    @NamedQuery(name = "OptionCar.findByPrice", query = "SELECT o FROM OptionCar o WHERE o.price = :price"),
    @NamedQuery(name = "OptionCar.findByCarserialNo", query = "SELECT o FROM OptionCar o WHERE o.optionCarPK.carserialNo = :carserialNo")})
public class OptionCar implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OptionCarPK optionCarPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "price")
    private Float price;

    public OptionCar() {
    }

    public OptionCar(OptionCarPK optionCarPK) {
        this.optionCarPK = optionCarPK;
    }

    public OptionCar(String name, int carserialNo) {
        this.optionCarPK = new OptionCarPK(name, carserialNo);
    }

    public OptionCarPK getOptionCarPK() {
        return optionCarPK;
    }

    public void setOptionCarPK(OptionCarPK optionCarPK) {
        this.optionCarPK = optionCarPK;
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
        hash += (optionCarPK != null ? optionCarPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OptionCar)) {
            return false;
        }
        OptionCar other = (OptionCar) object;
        if ((this.optionCarPK == null && other.optionCarPK != null) || (this.optionCarPK != null && !this.optionCarPK.equals(other.optionCarPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "orm.OptionCar[ optionCarPK=" + optionCarPK + " ]";
    }
    
}
