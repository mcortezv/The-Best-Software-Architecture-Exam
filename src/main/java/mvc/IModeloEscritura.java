package mvc;
import dto.EstudianteDTO;

public interface IModeloEscritura {

    void setFiltroEstudiantes(int filtro);

    void setEstudianteSelecionado(EstudianteDTO dto);

    void generarConstancia();
}
