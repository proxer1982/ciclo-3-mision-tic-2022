package developers3x2.ingresoegreso.service;

import developers3x2.ingresoegreso.entity.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService implements IUsuarioService {
    @Override
    public Usuario findById(int id){
        Usuario user = new Usuario();
        user.setIdUsuario(id);
        user.setApellido("Zorro");
        user.setCedula("8018654");
        user.setCorreo("juank@dad.com");
        user.setEstado(true);
        user.setNombre("Juan");
        user.setPass("rwtw");

        Perfil perfil = Perfil.Financiero;
        user.setPerfil(perfil);

        Rol rol = new Rol();
        rol.setIdRol(1);
        rol.setDescripcion("admin");
        rol.setEstado(true);
        user.setRol(rol);

        TipoDocumento doc = new TipoDocumento();
        doc.setIdTipoDocumento(2);
        doc.setDescripcion("Cedula extrajeria");
        doc.setSiglas("CE");
        doc.setEstado(true);
        user.setTipoDocumento(doc);

        return user;
    }

    @Override
    public List<Usuario> findAll(){
        List<Usuario> usuarios = new ArrayList<Usuario>();

        Usuario user1 = new Usuario();
        user1.setIdUsuario(1);
        user1.setApellido("Zorro");
        user1.setCedula("8018654");
        user1.setCorreo("juank@dad.com");
        user1.setEstado(true);
        user1.setNombre("Juan");
        user1.setPass("rwtw");

        Perfil perfil = Perfil.Financiero;
        user1.setPerfil(perfil);

        Rol rol = new Rol();
        rol.setIdRol(1);
        rol.setDescripcion("admin");
        rol.setEstado(true);
        user1.setRol(rol);

        TipoDocumento doc = new TipoDocumento();
        doc.setIdTipoDocumento(2);
        doc.setDescripcion("Cedula extrajeria");
        doc.setSiglas("CE");
        doc.setEstado(true);
        user1.setTipoDocumento(doc);

        Usuario user2 = new Usuario();
        user2.setIdUsuario(2);
        user2.setApellido("Zorro");
        user2.setCedula("8018654");
        user2.setCorreo("juank@dad.com");
        user2.setEstado(true);
        user2.setNombre("Juan");
        user2.setPass("rwtw");

        Perfil perfil2 = Perfil.Financiero;
        user2.setPerfil(perfil2);

        Rol rol2 = new Rol();
        rol2.setIdRol(1);
        rol2.setDescripcion("admin");
        rol2.setEstado(true);
        user2.setRol(rol2);

        TipoDocumento doc2 = new TipoDocumento();
        doc2.setIdTipoDocumento(2);
        doc2.setDescripcion("Cedula extrajeria");
        doc2.setSiglas("CE");
        doc2.setEstado(true);
        user2.setTipoDocumento(doc2);

        usuarios.add(user1);
        usuarios.add(user2);

        return usuarios;
    }

    @Override
    public Usuario createUser(Usuario user){
        Usuario newUser = new Usuario();
        newUser.setIdUsuario(12);
        newUser.setApellido(user.getApellido());
        newUser.setCedula(user.getCedula());
        newUser.setCorreo(user.getCorreo());
        newUser.setEstado(user.isEstado());
        newUser.setNombre(user.getNombre());
        newUser.setPass(user.getPass());
        newUser.setPerfil(user.getPerfil());
        newUser.setRol(user.getRol());
        newUser.setTipoDocumento(user.getTipoDocumento());

        return newUser;
    }

    @Override
    public Usuario updateUser(int id, Usuario user){
        Usuario putUser = findById(id);
        putUser.setIdUsuario(id);
        putUser.setApellido(user.getApellido());
        putUser.setCedula(user.getCedula());
        putUser.setCorreo(user.getCorreo());
        putUser.setEstado(user.isEstado());
        putUser.setNombre(user.getNombre());
        putUser.setPass(user.getPass());
        putUser.setPerfil(user.getPerfil());
        putUser.setRol(user.getRol());
        putUser.setTipoDocumento(user.getTipoDocumento());

        return putUser;
    }

    @Override
    public void deleteUser(int id){
        Usuario deleteUser = findById(id);
    }
}
