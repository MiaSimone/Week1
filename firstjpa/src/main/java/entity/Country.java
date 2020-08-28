
package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
// Hvis tabellen ikke skal hedde Country:
// @Table(name="Land")

public class Country implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    // Autogenereret id:
    // Standart:    @GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // Tom contructor
    public Country() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="name", nullable = false)
    private String countryName;
    private String borders;

    public Country(String countryName, String borders) {
        this.countryName = countryName;
        this.borders = borders;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getBorders() {
        return borders;
    }

    public void setBorders(String borders) {
        this.borders = borders;
    }
    
    
}
