package developers3x2.ingresoegreso.controller;

import developers3x2.ingresoegreso.entities.*;
import developers3x2.ingresoegreso.service.ITipoDocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TipoDocumentoRestController {

    @Autowired
    private ITipoDocumentoService tipoDocumentoService;
    @GetMapping("/tipoDocumento/{id}")
    public TipoDocumento findById(@PathVariable int id){
        return tipoDocumentoService.findById(id);
    }

    @GetMapping("/tipoDocumento")
    public List<TipoDocumento> findAll(){
        return tipoDocumentoService.findAll();
    }

    @PostMapping("/tipoDocumento")
    public TipoDocumento createRol(@RequestBody TipoDocumento doc){
        return tipoDocumentoService.createRol(doc);
    }

    @PutMapping("/tipoDocumento/{id}")
    public TipoDocumento updateRol(@PathVariable int id,@RequestBody TipoDocumento doc){
        return tipoDocumentoService.updateRol(id, doc);
    }

    @DeleteMapping("/tipoDocumento/{id}")
    public void deleteTipoDocumento(int id){
        tipoDocumentoService.deleteTipoDocumento(id);
    }
}
