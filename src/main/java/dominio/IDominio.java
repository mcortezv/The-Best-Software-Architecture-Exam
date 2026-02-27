package dominio;
import java.util.List;

public interface IDominio {

    List<Estudiante> getEstudiantes();

    List<Estudiante> getEstudiantesFiltro(String filtro);

    Constancia generarConstancia(Estudiante estudiante);
}
