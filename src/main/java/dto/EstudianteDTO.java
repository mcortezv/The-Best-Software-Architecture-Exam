package dto;
import dominio.Materia;
import java.util.List;

public class EstudianteDTO {
    private int id;
    private String nombre;
    private String correo;
    private String carrera;
    private int semestreInscrito;
    private List<Materia> materias;

    public EstudianteDTO() {}

    public EstudianteDTO(int id, String nombre, String correo, String carrera, int semestreInscrito, List<Materia> materias) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.carrera = carrera;
        this.semestreInscrito = semestreInscrito;
        this.materias = materias;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemestreInscrito() {
        return semestreInscrito;
    }

    public void setSemestreInscrito(int semestreInscrito) {
        this.semestreInscrito = semestreInscrito;
    }

    public int getCantidadMaterias() {
        return materias.size();
    }
}
