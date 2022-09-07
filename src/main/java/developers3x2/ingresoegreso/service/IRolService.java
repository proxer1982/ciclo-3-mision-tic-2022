package developers3x2.ingresoegreso.service;

import developers3x2.ingresoegreso.entities.Rol;

import java.util.List;

public interface IRolService {
    public Rol findById(int id);

    public List<Rol> findAll();

    public Rol createRol(Rol rol);

    public Rol updateRol(int id, Rol rol);

    public void deleteRol(int id);
}
