package tr.edu.medipol.ilerijava.restveri.service;

import tr.edu.medipol.ilerijava.restveri.data.KisiDTO;
import tr.edu.medipol.ilerijava.restveri.entity.Kisi;

import java.util.List;

public interface KisiService {

    Kisi kisiEkle(KisiDTO kisiDTO);

    List<Kisi> kisiListele();

    Kisi kisiGetir(Long id);

    String kisiSil(Long id);

    Kisi kisiGuncelle(Long id, KisiDTO kisiDTO);

}
