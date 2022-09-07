package developers3x2.ingresoegreso.service;

import developers3x2.ingresoegreso.entities.*;
import developers3x2.ingresoegreso.repositories.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService {
    @Autowired
    private IUsuarioRepository usuarioRepository;
    @Override
    public Usuario findById(int id){
        Optional<Usuario> usuarios = usuarioRepository.findById((long) id);

        return usuarios.get();
    }

    @Override
    public List<Usuario> findAll(){
        List<Usuario> usuarios = (List<Usuario>) usuarioRepository.findAll();

        return usuarios;
    }

    @Override
    public Usuario createUser(Usuario user){
        return usuarioRepository.save(user);
    }

    @Override
    public Usuario updateUser(int id, Usuario user){
        return usuarioRepository.save(user);
    }

    @Override
    public void deleteUser(int id){
        usuarioRepository.deleteById((long) id);
    }
}
