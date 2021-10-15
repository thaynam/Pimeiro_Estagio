package primeiro.estagio.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import primeiro.estagio.dao.UsuarioDAO;
import primeiro.estagio.entities.Usuario;

@Service
    public class UsuarioService {
        @Autowired
        private UsuarioDAO usuarioDAO;

        public void save(Usuario usuario){
            usuarioDAO.save(usuario);
        }
}


