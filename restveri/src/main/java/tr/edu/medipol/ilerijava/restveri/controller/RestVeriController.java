package tr.edu.medipol.ilerijava.restveri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tr.edu.medipol.ilerijava.restveri.data.KisiDTO;
import tr.edu.medipol.ilerijava.restveri.entity.Kisi;
import tr.edu.medipol.ilerijava.restveri.repo.KisiRepository;

import java.util.List;

@RestController
public class RestVeriController {

    @Autowired
    KisiRepository kisiRepository;

    @GetMapping("/")
    public String selam() {
        return "Merhaba";
    }

    @PostMapping("/kisi-ekle")
    public Kisi kisiEkle(@RequestBody KisiDTO kisiDTO) {
        Kisi kisi = new Kisi();
        kisi.setAd(kisiDTO.getAd());
        kisi.setSoyad(kisiDTO.getSoyad());
        kisi.setYas(kisiDTO.getYas());
        kisi = kisiRepository.save(kisi);
        return kisi;
    }

    @GetMapping("/kisi-listele")
    public List<Kisi> kisileriListele() {
        return kisiRepository.findAll();
    }

    @GetMapping("/kisi/{id}")
    public Kisi kisiyiGetir(Long id) {
        return kisiRepository.findById(id).get();
    }

    @DeleteMapping("/kisi/{id}")
    public String kisiyiSil(Long id) {
        kisiRepository.deleteById(id);
        return id + " nolu kisi silindi.";
    }

    @PutMapping("/kisi/{id}")
    public Kisi kisiGuncelle(@PathVariable Long id, @RequestBody KisiDTO kisiDTO) {
        Kisi kisi = kisiyiGetir(id);
        kisi.setAd(kisiDTO.getAd());
        kisi.setSoyad(kisiDTO.getSoyad());
        kisi.setYas(kisiDTO.getYas());
        kisi = kisiRepository.save(kisi);
        return kisi;
    }

}
