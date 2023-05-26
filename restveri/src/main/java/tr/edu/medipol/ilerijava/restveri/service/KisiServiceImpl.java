package tr.edu.medipol.ilerijava.restveri.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.edu.medipol.ilerijava.restveri.data.KisiDTO;
import tr.edu.medipol.ilerijava.restveri.entity.Kisi;
import tr.edu.medipol.ilerijava.restveri.repo.KisiRepository;

import java.util.List;

@Service
public class KisiServiceImpl implements KisiService {

    @Autowired
    KisiRepository kisiRepository;

    public Kisi kisiEkle(KisiDTO kisiDTO) {
        Kisi kisi = new Kisi();
        kisi.setAd(kisiDTO.getAd());
        kisi.setSoyad(kisiDTO.getSoyad());
        kisi.setYas(kisiDTO.getYas());
        kisi.setTelefon(kisiDTO.getTelefon());
        kisi = kisiRepository.save(kisi);
        return kisi;
    }

    public List<Kisi> kisiListele() {
        return kisiRepository.findAll();
    }

    public Kisi kisiGetir(Long id) {
        return kisiRepository.findById(id).get();
    }

    public String kisiSil(Long id) {
        kisiRepository.deleteById(id);
        return id + " nolu kisi silindi.";
    }

    public Kisi kisiGuncelle(Long id, KisiDTO kisiDTO) {
        Kisi kisi = kisiGetir(id);
        kisi.setAd(kisiDTO.getAd());
        kisi.setSoyad(kisiDTO.getSoyad());
        kisi.setYas(kisiDTO.getYas());
        kisi.setTelefon(kisiDTO.getTelefon());
        kisi = kisiRepository.save(kisi);
        return kisi;
    }

}
