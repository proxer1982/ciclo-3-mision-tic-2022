package developers3x2.ingresoegreso.service;

import developers3x2.ingresoegreso.entity.Usuario;

import java.util.List;

public interface IUsuarioService {
    public Usuario findById(int id);

    public List<Usuario> findAll();

    public Usuario createUser(Usuario user);

    public Usuario updateUser(int id, Usuario user);

    public void deleteUser(int id);
}
