/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cz.itnetwork.EvidencePojistnychUdalosti;

import org.springframework.data.repository.CrudRepository;
import java.util.ArrayList;

/**
 *
 * @author savel
 */
public interface AdresyRepository extends CrudRepository<Adresy, Long> {
    
    public ArrayList<Adresy> findByPojisteny (Pojistene pojisteny);
    
}