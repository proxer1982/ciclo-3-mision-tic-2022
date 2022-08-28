package developers3x2.ingresoegreso.service;

import developers3x2.ingresoegreso.entity.Rol;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RolService implements IRolService{
    @Override
    public Rol findById(int id) {
        Rol rol = new Rol();
        rol.setIdRol(id);
        rol.setDescripcion("Administrador");
        rol.setEstado(true);

        return rol;
    }

    @Override
    public List<Rol> findAll(){
        List<Rol> roles = new ArrayList<Rol>();
        Rol rol1 = new Rol();
        rol1.setIdRol(1);
        rol1.setDescripcion("Administrador");
        rol1.setEstado(true);

        Rol rol2 = new Rol();
        rol2.setIdRol(2);
        rol2.setDescripcion("User");
        rol2.setEstado(true);

        roles.add(rol1);
        roles.add(rol2);
        return roles;
    }

    @Override
    public Rol createRol(Rol rol){
        Rol newRol = new Rol();
        newRol.setIdRol(3);
        newRol.setDescripcion(rol.getDescripcion());
        newRol.setEstado(rol.isEstado());

        return newRol;
    }

    @Override
    public Rol updateRol(int id, Rol rol){
        Rol putRol = findById(id);
        putRol.setDescripcion(rol.getDescripcion());
        putRol.setEstado(rol.isEstado());

        return putRol;
    }

    @Override
    public void deleteRol(int id){
        Rol putRol = findById(id);
    }
}