/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.EvidencePojistnychUdalosti;
import javax.persistence.*;
/**
 *
 * @author savel
 */
@Entity
public class Adresy {
    
    @Id
    @GeneratedValue
    private Long id;
    private String ulice, psc, mestska_cast, mesto;
    private int cislo_popisne, cislo_orientacni;
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="pojisteny_id", referencedColumnName="id", nullable=false, unique=true)
    private Pojistene pojisteny;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @return the ulice
     */
    public String getUlice() {
        return ulice;
    }

    /**
     * @param ulice the ulice to set
     */
    public void setUlice(String ulice) {
        this.ulice = ulice;
    }

    /**
     * @return the psc
     */
    public String getPsc() {
        return psc;
    }

    /**
     * @param psc the psc to set
     */
    public void setPsc(String psc) {
        this.psc = psc;
    }

    /**
     * @return the mestska_cast
     */
    public String getMestska_cast() {
        return mestska_cast;
    }

    /**
     * @param mestska_cast the mestska_cast to set
     */
    public void setMestska_cast(String mestska_cast) {
        this.mestska_cast = mestska_cast;
    }

    /**
     * @return the mesto
     */
    public String getMesto() {
        return mesto;
    }

    /**
     * @param mesto the mesto to set
     */
    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    /**
     * @return the cislo_popisne
     */
    public int getCislo_popisne() {
        return cislo_popisne;
    }

    /**
     * @param cislo_popisne the cislo_popisne to set
     */
    public void setCislo_popisne(int cislo_popisne) {
        this.cislo_popisne = cislo_popisne;
    }

    /**
     * @return the cislo_orientacni
     */
    public int getCislo_orientacni() {
        return cislo_orientacni;
    }

    /**
     * @param cislo_orientacni the cislo_orientacni to set
     */
    public void setCislo_orientacni(int cislo_orientacni) {
        this.cislo_orientacni = cislo_orientacni;
    }

    /**
     * @return the pojisteny
     */
    public Pojistene getPojisteny() {
        return pojisteny;
    }
    
    /**
     * @param pojisteny the pojisteny to set
     */
    public void setPojisteny(Pojistene pojisteny) {
        this.pojisteny = pojisteny;
    }
    
    
    public Adresy(){
        
    }
    
    public Adresy(String ulice, int cislo_popisne, int cislo_orientacni, String psc, String mestska_cast, String mesto, Pojistene pojisteny){
        this.ulice = ulice;
        this.cislo_popisne = cislo_popisne;
        this.cislo_orientacni = cislo_orientacni;
        this.psc = psc;
        this.mestska_cast = mestska_cast;
        this.mesto = mesto;
        this.pojisteny = pojisteny;
    }

    
}
