/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.EvidencePojistnychUdalosti;

import javax.persistence.*;
import java.util.Set;

/**
 *
 * @author savel
 */
@Entity
public class Pojistene {
    
    @Id
    @GeneratedValue
    private Long id;
    private String jmeno, prijmeni;
    private String datum_narozeni;
    private String tel_cislo;
    private String email;
    
    @OneToMany(mappedBy = "pojisteny", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Pojisteni> pojisteni;
    

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the jmeno
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * @param jmeno the jmeno to set
     */
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    /**
     * @return the prijmeni
     */
    public String getPrijmeni() {
        return prijmeni;
    }

    /**
     * @param prijmeni the prijmeni to set
     */
    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    /**
     * @return the datum_narozeni
     */
    public String getDatum_narozeni() {
        return datum_narozeni;
    }

    /**
     * @param datum_narozeni the datum_narozeni to set
     */
    public void setDatum_narozeni(String datum_narozeni) {
        this.datum_narozeni = datum_narozeni;
    }

    /**
     * @return the tel_cislo
     */
    public String getTel_cislo() {
        return tel_cislo;
    }

    /**
     * @param tel_cislo the tel_cislo to set
     */
    public void setTel_cislo(String tel_cislo) {
        this.tel_cislo = tel_cislo;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    public Pojistene(){
        
    }
    
    public Pojistene(String jmeno, String prijmeni, String datum_narozeni, String tel_cislo, String email){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.datum_narozeni = datum_narozeni;
        this.tel_cislo = tel_cislo;
        this.email = email;
    }
    
}
