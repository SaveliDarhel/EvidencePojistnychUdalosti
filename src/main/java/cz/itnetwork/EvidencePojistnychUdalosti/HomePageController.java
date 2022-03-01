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
public class HomePageController {
    
    @Autowired
    private PojisteneRepository pojisteneRepository;
    
    @GetMapping("/home")
    public String pozdrav(Model model){
        Iterable<Pojistene> pojistene = pojisteneRepository.findAll();
        model.addAttribute("pojistene", pojistene);
        return "home";
    }
    
    @GetMapping("/home/add")
    public String pridat(Model model){
        return "add";
    }
    
    @PostMapping("/home/add")
    public String pridatUlozit(@RequestParam String jmeno, @RequestParam String prijmeni, @RequestParam String narozeni, @RequestParam String cislo, @RequestParam String email, Model model){
        Pojistene pojisteny = new Pojistene(jmeno, prijmeni, narozeni, cislo, email);
        pojisteneRepository.save(pojisteny);
        return "redirect:/home";
    }
    
    @GetMapping("/home/detail/{id}")
    public String pojistenecDetail(@PathVariable(value = "id") long id, Model model){
        Optional<Pojistene> result = pojisteneRepository.findById(id);
        ArrayList<Pojistene> pojisteny = new ArrayList<>();
        result.ifPresent(pojisteny::add);
        model.addAttribute("pojisteny", pojisteny);
        return "detail";
    }
    
    @GetMapping("/home/edit/{id}")
    public String pojistenecEdit(@PathVariable(value = "id") long id, Model model){
        Optional<Pojistene> result = pojisteneRepository.findById(id);
        ArrayList<Pojistene> pojisteny = new ArrayList<>();
        result.ifPresent(pojisteny::add);
        model.addAttribute("pojisteny", pojisteny);
        return "edit";
    }
    
    @PostMapping("/home/edit/{id}")
    public String pojistenecEditUlozit(@PathVariable(value = "id") long id, @RequestParam String jmeno, @RequestParam String prijmeni, @RequestParam String narozeni, @RequestParam String cislo, @RequestParam String email, Model model){
        Pojistene pojisteny = pojisteneRepository.findById(id).orElseThrow();
        pojisteny.setJmeno(jmeno);
        pojisteny.setPrijmeni(prijmeni);
        pojisteny.setDatum_narozeni(narozeni);
        pojisteny.setTel_cislo(cislo);
        pojisteny.setEmail(email);
        pojisteneRepository.save(pojisteny);
        
        return "redirect:/home";
    }
    
    @PostMapping("/home/remove/{id}")
    public String pojistenecSmazat(@PathVariable(value = "id") long id, Model model){
        Pojistene pojisteny = pojisteneRepository.findById(id).orElseThrow();
        pojisteneRepository.delete(pojisteny);
        
        return "redirect:/home";
    }
    
    
    
}
