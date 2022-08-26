package developers3x2.ingresoegreso.controller;

import developers3x2.ingresoegreso.entity.Rol;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RolRestController {

    @GetMapping("/rol/{id}")
    public Rol findById(@PathVariable int id){
        Rol rol = new Rol();
        rol.setIdRol(id);
        rol.setDescripcion("Administrador");
        rol.setEstado(true);
        return rol;
    }

    @GetMapping("/rol")
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

    @PostMapping("/rol")
    public Rol createRol(@RequestBody Rol rol){
        Rol newRol = new Rol();
        newRol.setIdRol(3);
        newRol.setDescripcion(rol.getDescripcion());
        newRol.setEstado(rol.isEstado());

        return newRol;
    }

    @PutMapping("/rol/{id}")
    public Rol updateRol(@PathVariable int id,@RequestBody Rol rol){
        Rol putRol = findById(id);
        putRol.setDescripcion(rol.getDescripcion());
        putRol.setEstado(rol.isEstado());

        return putRol;
    }

    @DeleteMapping("/rol/{id}")
    public void deleteRol(@PathVariable int id){
        Rol putRol = findById(id);
    }
}
