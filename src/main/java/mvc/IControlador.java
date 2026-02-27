package mvc;
import dto.EstudianteDTO;

public interface IControlador {

    void setFiltroEstudiantes(int filtro);

    void setEstudianteSelecionado(EstudianteDTO dto);

    void generarConstancia();
}
