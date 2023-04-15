package tr.edu.medipol.ilerijavaders;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class Ders5RestController {

    @RequestMapping("/")
    public String selamlama() {
        return "Merhaba!";
    }

    @GetMapping("/selam")
    public String selam() {
        return "Selam! " + LocalDateTime.now();
    }

}
