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
@Table(name = "report1")
@NamedQueries({
    @NamedQuery(name = "Report1.findAll", query = "SELECT r FROM Report1 r"),
    @NamedQuery(name = "Report1.findByModel", query = "SELECT r FROM Report1 r WHERE r.model = :model"),
    @NamedQuery(name = "Report1.findByManufacture", query = "SELECT r FROM Report1 r WHERE r.manufacture = :manufacture"),
    @NamedQuery(name = "Report1.findByOptionName", query = "SELECT r FROM Report1 r WHERE r.optionName = :optionName"),
    @NamedQuery(name = "Report1.findByCarPrice", query = "SELECT r FROM Report1 r WHERE r.carPrice = :carPrice"),
    @NamedQuery(name = "Report1.findByOptionPrice", query = "SELECT r FROM Report1 r WHERE r.optionPrice = :optionPrice"),
    @NamedQuery(name = "Report1.findByTotalPrice", query = "SELECT r FROM Report1 r WHERE r.totalPrice = :totalPrice")})
public class Report1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "Model")
    @Id
    private String model;
    @Column(name = "Manufacture")
    private String manufacture;
    @Basic(optional = false)
    @Column(name = "option_name")
    @Id
    private String optionName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "car_price")
    private Float carPrice;
    @Column(name = "option_price")
    private Float optionPrice;
    @Column(name = "total_price")
    private Double totalPrice;

    public Report1() {
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

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public Float getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(Float carPrice) {
        this.carPrice = carPrice;
    }

    public Float getOptionPrice() {
        return optionPrice;
    }

    public void setOptionPrice(Float optionPrice) {
        this.optionPrice = optionPrice;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
}
