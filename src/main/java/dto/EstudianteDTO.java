package dto;
import java.util.List;

public class EstudianteDTO {
    private int id;
    private String nombre;
    private String correo;
    private String carrera;
    private int semestreInscrito;
    private List<MateriaDTO> materias;

    public EstudianteDTO() {}

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

    public List<MateriaDTO> getMaterias() {
        return materias;
    }

    public void setMaterias(List<MateriaDTO> materias) {
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

    @Override
    public String toString() {
        return nombre + "\n" +
                id + "\n" +
                correo + "\n" +
                "Programa: " + carrera + "\n" +
                "Semestre: " + semestreInscrito + "\n" +
                "Numero Materias: " + getCantidadMaterias() + "\n";
    }
}
