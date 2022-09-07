package developers3x2.ingresoegreso.controller;

import developers3x2.ingresoegreso.entities.Rol;
import developers3x2.ingresoegreso.service.IRolService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RolRestController {
    @Autowired
    private IRolService rolService;

    @GetMapping("/rol/{id}")
    public Rol findById(@PathVariable int id){
        return rolService.findById(id);
    }

    @GetMapping("/rol")
    public List<Rol> findAll(){
        return rolService.findAll();
    }

    @PostMapping("/rol")
    public Rol createRol(@RequestBody Rol rol){
        return rolService.createRol(rol);
    }

    @PutMapping("/rol/{id}")
    public Rol updateRol(@PathVariable int id,@RequestBody Rol rol){
        return rolService.updateRol(id, rol);
    }

    @DeleteMapping("/rol/{id}")
    public void deleteRol(@PathVariable int id){
        rolService.deleteRol(id);
    }
}
