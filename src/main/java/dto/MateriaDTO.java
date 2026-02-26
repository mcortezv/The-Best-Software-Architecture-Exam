package dto;
import java.time.LocalTime;

public class MateriaDTO {
    private int codigo;
    private String nombre;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private String dias;

    public MateriaDTO() {}

    public MateriaDTO(int codigo, String nombre, LocalTime horaInicio, LocalTime horaFin, String dias) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.dias = dias;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
