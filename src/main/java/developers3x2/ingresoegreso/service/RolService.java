package developers3x2.ingresoegreso.service;

import developers3x2.ingresoegreso.entities.Rol;
import developers3x2.ingresoegreso.repositories.IRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Clase para la la solicitud de llamados de rol
 */
@Service
public class RolService implements IRolService{
    @Autowired
    private IRolRepository rolRepository;
    @Override
    public Rol findById(int id) {
        Optional<Rol> roles = rolRepository.findById((long) id);

        return roles.get();
    }

    @Override
    public List<Rol> findAll(){
        List<Rol> roles = (List<Rol>) rolRepository.findAll();
        return roles;
    }

    @Override
    public Rol createRol(Rol rol){
        return rolRepository.save(rol);
    }

    @Override
    public Rol updateRol(int id, Rol rol){
        return rolRepository.save(rol);
    }

    @Override
    public void deleteRol(int id){
        rolRepository.deleteById((long) id);
    }
}
