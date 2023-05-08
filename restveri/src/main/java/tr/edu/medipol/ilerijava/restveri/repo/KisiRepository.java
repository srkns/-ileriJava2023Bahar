package tr.edu.medipol.ilerijava.restveri.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.edu.medipol.ilerijava.restveri.entity.Kisi;

@Repository
public interface KisiRepository extends JpaRepository<Kisi, Long> {

}
