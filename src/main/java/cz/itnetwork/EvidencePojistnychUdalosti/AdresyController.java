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
public class AdresyController {
    
    @Autowired
    PojisteneRepository pojisteneRepository;
    @Autowired
    AdresyRepository adresyRepository;
    
    @GetMapping("/home/detail/{id}/spravovatAdresy")
    public String zobrazitAdresy(@PathVariable(value = "id") long pojisteny_id, Model model){
        
        Optional<Pojistene> pojisteneResult = pojisteneRepository.findById(pojisteny_id);
        ArrayList<Pojistene> pojistene = new ArrayList<>();
        pojisteneResult.ifPresent(pojistene::add);
        model.addAttribute("pojistene", pojistene);
        
        ArrayList<Adresy> adresa = adresyRepository.findByPojisteny(pojistene.get(0));
        model.addAttribute("adresa", adresa);
        
        return "spravovatAdresy";
    }
    
    @GetMapping("/home/detail/{id}/pridatAdresu")
    public String addAdresa (@PathVariable(value = "id") long pojisteny_id, Model model){
        Optional<Pojistene> result = pojisteneRepository.findById(pojisteny_id);
        ArrayList<Pojistene> pojisteny = new ArrayList<>();
        result.ifPresent(pojisteny::add);
        model.addAttribute("pojisteny", pojisteny);
        return "pridatAdresu";
    }
    
    @PostMapping("/home/detail/{id}/pridatAdresu")
    public String addAdresuUlozit (@RequestParam long pojisteny_id, @RequestParam String ulice, @RequestParam int cislo_popisne, @RequestParam int cislo_orientacni, @RequestParam String psc, @RequestParam String mestska_cast, @RequestParam String mesto){
        
        Optional<Pojistene> result = pojisteneRepository.findById(pojisteny_id);
        ArrayList<Pojistene> pojistene = new ArrayList<>();
        result.ifPresent(pojistene::add);
        Pojistene pojisteny = pojistene.get(0); 
        Adresy adresa = new Adresy(ulice, cislo_popisne, cislo_orientacni, psc, mestska_cast, mesto, pojisteny);
        adresyRepository.save(adresa);
        return "redirect:/home/detail/" + pojisteny_id + "/spravovatAdresy";
    }
    
    @PostMapping("/home/adresa/remove/{id}")
    public String odstranitPojisteni (@PathVariable(value = "id") long adresa_id, Model model){
        Adresy adresa = adresyRepository.findById(adresa_id).orElseThrow();
        adresyRepository.delete(adresa);
        Pojistene pojisteny = adresa.getPojisteny();
        long pojisteny_id = pojisteny.getId();
        return "redirect:/home/detail/" + pojisteny_id + "/spravovatAdresy";
    }
    
    @GetMapping("/home/adresa/edit/{id}")
    public String editovatPojisteni (@PathVariable(value = "id") long adresa_id, Model model){
        Optional<Adresy> adresyResult = adresyRepository.findById(adresa_id);
        ArrayList<Adresy> adresa = new ArrayList<>();
        adresyResult.ifPresent(adresa::add);
        model.addAttribute("adresa", adresa);
        
        
        Pojistene pojisteny = adresa.get(0).getPojisteny();
        long pojisteny_id = pojisteny.getId();
        model.addAttribute("pojisteny", pojisteny);
        return "editovatAdresu";
    }
    
    @PostMapping("/home/adresa/edit/{id}")
    public String editovatPojisteniUlozit (@PathVariable(value = "id") long adresa_id, @RequestParam String ulice, @RequestParam int cislo_popisne, @RequestParam int cislo_orientacni, @RequestParam String psc, @RequestParam String mestska_cast, @RequestParam String mesto){
        Adresy adresa = adresyRepository.findById(adresa_id).orElseThrow();
        adresa.setUlice(ulice);
        adresa.setCislo_popisne(cislo_popisne);
        adresa.setCislo_orientacni(cislo_orientacni);
        adresa.setPsc(psc);
        adresa.setMestska_cast(mestska_cast);
        adresa.setMesto(mesto);
        adresyRepository.save(adresa);
        
        Pojistene pojisteny = adresa.getPojisteny();
        long pojisteny_id = pojisteny.getId();
        return "redirect:/home/detail/" + pojisteny_id + "/spravovatAdresy";
    }
    
    
}
