package dominio;
import java.util.List;

public class Estudiante {
    private int id;
    private String nombre;
    private String correo;
    private int semestreInscrito;
    private List<Materia> materias;

    public Estudiante() {}

    public Estudiante(int id, String nombre, String correo, int semestreInscrito, List<Materia> materias) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
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
