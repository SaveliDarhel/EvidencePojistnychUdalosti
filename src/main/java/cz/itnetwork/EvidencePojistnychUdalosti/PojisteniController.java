/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.EvidencePojistnychUdalosti;
import java.util.Optional;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author savel
 */
@Controller
public class PojisteniController {
    
    @Autowired
    PojisteneRepository pojisteneRepository;
    @Autowired
    PojisteniRepository pojisteniRepository;
    
    @GetMapping("/home/detail/{id}/pridatPojisteni")
    public String addPojisteni (@PathVariable(value = "id") long pojisteny_id, Model model){
        Optional<Pojistene> result = pojisteneRepository.findById(pojisteny_id);
        ArrayList<Pojistene> pojisteny = new ArrayList<>();
        result.ifPresent(pojisteny::add);
        model.addAttribute("pojisteny", pojisteny);
        return "pridatPojisteni";
    }
    
    @PostMapping("/home/detail/{id}/pridatPojisteni")
    public String addPojisteniUlozit (@RequestParam long pojisteny_id, @RequestParam String nazev_pojisteni, @RequestParam String typ_pojisteni, @RequestParam int pojistna_castka){
        
        Optional<Pojistene> result = pojisteneRepository.findById(pojisteny_id);
        ArrayList<Pojistene> pojistene = new ArrayList<>();
        result.ifPresent(pojistene::add);
        Pojistene pojisteny = pojistene.get(0); 
        Pojisteni pojisteni = new Pojisteni(nazev_pojisteni, typ_pojisteni, pojistna_castka, pojisteny);
        pojisteniRepository.save(pojisteni);
        return "redirect:/home/detail/" + pojisteny_id + "/spravovatPojisteni";
    }
    
    @GetMapping("/home/detail/{id}/spravovatPojisteni")
    public String zobrazitPojisteni(@PathVariable(value = "id") long pojisteny_id, Model model){
        
        Optional<Pojistene> pojisteneResult = pojisteneRepository.findById(pojisteny_id);
        ArrayList<Pojistene> pojistene = new ArrayList<>();
        pojisteneResult.ifPresent(pojistene::add);
        model.addAttribute("pojistene", pojistene);
        
        ArrayList<Pojisteni> pojisteni = pojisteniRepository.findByPojisteny(pojistene.get(0));
        model.addAttribute("pojisteni", pojisteni);
        
        return "spravovatPojisteni";
    }
    
    @PostMapping("/home/pojisteni/remove/{id}")
    public String odstranitPojisteni (@PathVariable(value = "id") long pojisteni_id, Model model){
        Pojisteni pojisteni = pojisteniRepository.findById(pojisteni_id).orElseThrow();
        pojisteniRepository.delete(pojisteni);
        Pojistene pojisteny = pojisteni.getPojistene();
        long pojisteny_id = pojisteny.getId();
        return "redirect:/home/detail/" + pojisteny_id + "/spravovatPojisteni";
    }
    
    @GetMapping("/home/pojisteni/edit/{id}")
    public String editovatPojisteni (@PathVariable(value = "id") long pojisteni_id, Model model){
        Optional<Pojisteni> pojisteniResult = pojisteniRepository.findById(pojisteni_id);
        ArrayList<Pojisteni> pojisteni = new ArrayList<>();
        pojisteniResult.ifPresent(pojisteni::add);
        model.addAttribute("pojisteni", pojisteni);
        
        
        Pojistene pojisteny = pojisteni.get(0).getPojistene();
        long pojisteny_id = pojisteny.getId();
        model.addAttribute("pojisteny", pojisteny);
        return "editovatPojisteni";
    }
    
    @PostMapping("home/pojisteni/edit/{id}")
    public String editovatPojisteniUlozit (@PathVariable(value = "id") long pojisteni_id, @RequestParam String nazev_pojisteni, @RequestParam String typ_pojisteni, @RequestParam int pojistna_castka){
        Pojisteni pojisteni = pojisteniRepository.findById(pojisteni_id).orElseThrow();
        pojisteni.setNazev_pojisteni(nazev_pojisteni);
        pojisteni.setTyp_pojisteni(typ_pojisteni);
        pojisteni.setPojistna_castka(pojistna_castka);
        pojisteniRepository.save(pojisteni);
        
        Pojistene pojisteny = pojisteni.getPojistene();
        long pojisteny_id = pojisteny.getId();
        return "redirect:/home/detail/" + pojisteny_id + "/spravovatPojisteni";
    }
    
}
