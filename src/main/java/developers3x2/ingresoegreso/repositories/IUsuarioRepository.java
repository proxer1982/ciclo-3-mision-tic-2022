package developers3x2.ingresoegreso.repositories;

import developers3x2.ingresoegreso.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioRepository extends CrudRepository<Usuario, Long> {
}
