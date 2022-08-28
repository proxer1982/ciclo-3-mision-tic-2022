package developers3x2.ingresoegreso.service;

import developers3x2.ingresoegreso.entity.*;

import java.util.List;

public interface ITipoDocumentoService {
    public TipoDocumento findById(int id);

    public List<TipoDocumento> findAll();

    public TipoDocumento createRol(Rol rol);

    public TipoDocumento updateRol(int id,TipoDocumento rol);

    public void deleteTipoDocumento(int id);
}
