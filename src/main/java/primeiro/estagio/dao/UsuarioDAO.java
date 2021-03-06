package primeiro.estagio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import primeiro.estagio.entities.Usuario;

@Repository
public interface UsuarioDAO extends JpaRepository<Usuario, Long> {
}
