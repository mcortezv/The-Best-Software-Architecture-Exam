package mvc;
import dto.EstudianteDTO;
import java.util.List;

public interface IModeloLectura {

    List<EstudianteDTO> getEstudiantes();

    String getContenidoDetalle();
}
