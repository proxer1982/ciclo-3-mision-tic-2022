package developers3x2.ingresoegreso.controller;

import developers3x2.ingresoegreso.entity.*;
import developers3x2.ingresoegreso.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioRestController {
    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/usuario/{id}")
    public Usuario findById(@PathVariable int id){
        return usuarioService.findById(id);
    }

    @GetMapping("/usuario")
    public List<Usuario> findAll(){
        return usuarioService.findAll();
    }

    @PostMapping("/usuario")
    public Usuario createUser(@RequestBody Usuario user){
        return usuarioService.createUser(user);
    }

    @PutMapping("/usuario/{id}")
    public Usuario updateUser(@PathVariable int id, @RequestBody Usuario user){
        return usuarioService.updateUser(id, user);
    }

    @DeleteMapping("/usuario/{id}")
    public void createUser(@PathVariable int id){
        usuarioService.deleteUser(id);
    }
}
