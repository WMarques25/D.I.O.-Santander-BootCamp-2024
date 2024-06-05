package dio.gof.dp.model.imovel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InquilinoRepository extends JpaRepository<Inquilino, Long>{

}
