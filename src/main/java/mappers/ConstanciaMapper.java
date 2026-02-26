package mappers;
import dominio.Constancia;
import dto.ConstanciaDTO;

public class ConstanciaMapper {

    private ConstanciaMapper(){}

    public static ConstanciaDTO toDTO(Constancia constancia){
        ConstanciaDTO dto = new ConstanciaDTO();
        dto.setEstudiante(EstudianteMapper.toDTO(constancia.getEstudiante()));
        dto.setCicloLectivo(constancia.getCicloLectivo());
        dto.setCicloFechaInicio(constancia.getCicloFechaInicio());
        dto.setCicloFechaInicio(constancia.getCicloFechaInicio());
        dto.setFechaConstancia(constancia.getFechaConstancia());
        return dto;
    }

    public static Constancia toEntity(ConstanciaDTO dto){
        Constancia entity = new Constancia();
        entity.setEstudiante(EstudianteMapper.toEntity(dto.getEstudiante()));
        entity.setCicloLectivo(dto.getCicloLectivo());
        entity.setCicloFechaInicio(dto.getCicloFechaInicio());
        entity.setCicloFechaInicio(dto.getCicloFechaInicio());
        entity.setFechaConstancia(dto.getFechaConstancia());
        return entity;
    }
}
