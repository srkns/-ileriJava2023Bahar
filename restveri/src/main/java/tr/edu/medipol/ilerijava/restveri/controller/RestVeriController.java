package tr.edu.medipol.ilerijava.restveri.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tr.edu.medipol.ilerijava.restveri.data.KisiDTO;
import tr.edu.medipol.ilerijava.restveri.entity.Kisi;
import tr.edu.medipol.ilerijava.restveri.service.KisiServiceImpl;

import java.util.List;

@RestController
public class RestVeriController {

    Logger logger = LoggerFactory.getLogger(RestVeriController.class);

    @Autowired
    KisiServiceImpl kisiServiceImpl;

    @PostMapping("/kisi-ekle")
    public Kisi kisiEkle(@RequestBody KisiDTO kisiDTO) {
        return kisiServiceImpl.kisiEkle(kisiDTO);
    }

    @GetMapping("/kisi-listele")
    public List<Kisi> kisileriListele() {
        logger.info("Kisi Listeleme Servisi Çağırıldı!");
        List<Kisi> kisiListesi = kisiServiceImpl.kisiListele();

        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");

        logger.info("Kisi Listeleme Servisi Çağırıldı ve " + kisiListesi.size() + " kisi listelendi.");
        return kisiListesi;
    }

    @GetMapping("/kisi/{id}")
    public Kisi kisiyiGetir(Long id) {
        return kisiServiceImpl.kisiGetir(id);
    }

    @DeleteMapping("/kisi/{id}")
    public String kisiyiSil(@PathVariable Long id) {
        return kisiServiceImpl.kisiSil(id);
    }

    @PutMapping("/kisi/{id}")
    public Kisi kisiGuncelle(@PathVariable Long id, @RequestBody KisiDTO kisiDTO) {
        return kisiServiceImpl.kisiGuncelle(id, kisiDTO);
    }

}
