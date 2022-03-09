/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cz.itnetwork.EvidencePojistnychUdalosti;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.domain.Sort;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author savel
 */
public interface PojisteniRepository extends CrudRepository<Pojisteni, Long> {
    
    ArrayList<Pojisteni> findByPojisteny (Pojistene pojisteny);
    
}
