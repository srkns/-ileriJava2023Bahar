package tr.edu.medipol.ilerijava.restgiris;

import org.springframework.web.bind.annotation.*;

@RestController
public class RestGirisController {

    @GetMapping("/selam")
    public String selamlama() {
        return "Selam!";
    }

    @GetMapping("/selamlama")
    public String selamlama2(String isim) { // @PathVariable(name = "ad") String isim
        return "Selam " + isim + "!";
    }

    @PostMapping("/toplama")
    public Integer topla(@RequestBody ToplamaInput toplamaInput) {
        return toplamaInput.getSayi() + toplamaInput.getSayi2();
    }

}
