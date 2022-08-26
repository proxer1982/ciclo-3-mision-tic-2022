package developers3x2.ingresoegreso.controller;

import developers3x2.ingresoegreso.entity.Rol;
import developers3x2.ingresoegreso.entity.TipoDocumento;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TipoDocumentoRestController {

    @GetMapping("/tipoDocumento/{id}")
    public TipoDocumento findById(@PathVariable int id){
        TipoDocumento tipoDocumento = new TipoDocumento();
        tipoDocumento.setIdTipoDocumento(1);
        tipoDocumento.setDescripcion("cedula");
        tipoDocumento.setSiglas("CC");
        tipoDocumento.setEstado(true);
        return tipoDocumento;
    }

    @GetMapping("/tipoDocumento")
    public List<TipoDocumento> findAll(){
        List<TipoDocumento> documentos = new ArrayList<TipoDocumento>();
        TipoDocumento doc1 = new TipoDocumento();
        doc1.setIdTipoDocumento(1);
        doc1.setDescripcion("Administrador");
        doc1.setSiglas("CC");
        doc1.setEstado(true);

        TipoDocumento doc2 = new TipoDocumento();
        doc2.setIdTipoDocumento(2);
        doc2.setDescripcion("User");
        doc2.setSiglas("CC");
        doc2.setEstado(true);

        documentos.add(doc1);
        documentos.add(doc2);
        return documentos;
    }

    @PostMapping("/tipoDocumento")
    public TipoDocumento createRol(@RequestBody Rol rol){
        TipoDocumento tipoDocumento = new TipoDocumento();
        tipoDocumento.setIdTipoDocumento(3);
        tipoDocumento.setDescripcion(rol.getDescripcion());
        tipoDocumento.setEstado(rol.isEstado());
        tipoDocumento.setSiglas("CC");

        return tipoDocumento;
    }

    @PutMapping("/tipoDocumento/{id}")
    public TipoDocumento updateRol(@PathVariable int id,@RequestBody TipoDocumento rol){
        TipoDocumento putRol = findById(id);
        putRol.setDescripcion(rol.getDescripcion());
        putRol.setEstado(rol.isEstado());

        return putRol;
    }
}
