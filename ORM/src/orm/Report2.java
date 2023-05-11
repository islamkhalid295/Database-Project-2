/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orm;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "report2")
@NamedQueries({
    @NamedQuery(name = "Report2.findAll", query = "SELECT r FROM Report2 r"),
    @NamedQuery(name = "Report2.findByModel", query = "SELECT r FROM Report2 r WHERE r.model = :model"),
    @NamedQuery(name = "Report2.findByPrice", query = "SELECT r FROM Report2 r WHERE r.price = :price"),
    @NamedQuery(name = "Report2.findByName", query = "SELECT r FROM Report2 r WHERE r.name = :name"),
    @NamedQuery(name = "Report2.findByDate", query = "SELECT r FROM Report2 r WHERE r.date = :date"),
    @NamedQuery(name = "Report2.findBySaleprice", query = "SELECT r FROM Report2 r WHERE r.saleprice = :saleprice")})
public class Report2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "Model")
    private String model;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "price")
    private Float price;
    @Column(name = "name")
    @Id
    private String name;
    @Id
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(name = "saleprice")
    private Float saleprice;

    public Report2() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setSaleprice(Float saleprice) {
        this.saleprice = saleprice;
    }
    
}
