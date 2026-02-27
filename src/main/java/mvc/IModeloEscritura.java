package mvc;
import dto.EstudianteDTO;

public interface IModeloEscritura {

    void setFiltroEstudiantes(String filtro);

    void setEstudianteSelecionado(EstudianteDTO dto);

    void generarConstancia();
}
