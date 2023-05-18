package tr.edu.medipol.ilerijava.restveri.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Kisi {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //@NotNull
    private String ad;
    private String soyad;
    private int yas;
    private String telefon;

}
