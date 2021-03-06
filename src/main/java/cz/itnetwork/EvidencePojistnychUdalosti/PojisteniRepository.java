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
public interface PojisteniRepository extends CrudRepository<Pojisteni, Long> {
    
    public ArrayList<Pojisteni> findByPojisteny (Pojistene pojisteny);
    
}
