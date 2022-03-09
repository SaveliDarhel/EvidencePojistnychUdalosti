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
public class Pojisteni {
    
    @Id
    @GeneratedValue
    private Long id;
    private String nazev_pojisteni, typ_pojisteni;
    private int pojistna_castka;
    
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
     * @return the nazev_pojisteni
     */
    public String getNazev_pojisteni() {
        return nazev_pojisteni;
    }

    /**
     * @param nazev_pojisteni the nazev_pojisteni to set
     */
    public void setNazev_pojisteni(String nazev_pojisteni) {
        this.nazev_pojisteni = nazev_pojisteni;
    }

    /**
     * @return the typ_pojisteni
     */
    public String getTyp_pojisteni() {
        return typ_pojisteni;
    }

    /**
     * @param typ_pojisteni the typ_pojisteni to set
     */
    public void setTyp_pojisteni(String typ_pojisteni) {
        this.typ_pojisteni = typ_pojisteni;
    }

    /**
     * @return the pojistna_castka
     */
    public int getPojistna_castka() {
        return pojistna_castka;
    }

    /**
     * @param pojistna_castka the pojistna_castka to set
     */
    public void setPojistna_castka(int pojistna_castka) {
        this.pojistna_castka = pojistna_castka;
    }

    /**
     * @return the pojistene
     */
    public Pojistene getPojistene() {
        return pojisteny;
    }

    /**
     * @param pojistene the pojistene to set
     */
    public void setPojistene(Pojistene pojistene) {
        this.pojisteny = pojisteny;
    }
    
    public Pojisteni (){
        
    }
    
    public Pojisteni (String nazev_pojisteni, String typ_pojisteni, int pojistna_castka, Pojistene pojisteny){
        this.nazev_pojisteni = nazev_pojisteni;
        this.typ_pojisteni = typ_pojisteni;
        this.pojistna_castka = pojistna_castka;
        this.pojisteny = pojisteny;
    }
    
    
}
