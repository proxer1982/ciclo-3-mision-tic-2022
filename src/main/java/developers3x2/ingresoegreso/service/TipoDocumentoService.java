package developers3x2.ingresoegreso.service;

import developers3x2.ingresoegreso.entity.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TipoDocumentoService implements ITipoDocumentoService {

    @Override
    public TipoDocumento findById(int id) {
        TipoDocumento tipoDocumento = new TipoDocumento();
        tipoDocumento.setIdTipoDocumento(1);
        tipoDocumento.setDescripcion("cedula");
        tipoDocumento.setSiglas("CC");
        tipoDocumento.setEstado(true);
        return tipoDocumento;
    }

    @Override
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

    @Override
    public TipoDocumento createRol(Rol rol){
        TipoDocumento tipoDocumento = new TipoDocumento();
        tipoDocumento.setIdTipoDocumento(3);
        tipoDocumento.setDescripcion(rol.getDescripcion());
        tipoDocumento.setEstado(rol.isEstado());
        tipoDocumento.setSiglas("CC");

        return tipoDocumento;
    }

    @Override
    public TipoDocumento updateRol(int id, TipoDocumento rol){
        TipoDocumento putRol = findById(id);
        putRol.setDescripcion(rol.getDescripcion());
        putRol.setEstado(rol.isEstado());

        return putRol;
    }

    @Override
    public void deleteTipoDocumento(int id){
        TipoDocumento putDoc = findById(id);
    }
}
