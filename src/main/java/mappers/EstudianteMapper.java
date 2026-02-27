package mappers;
import dominio.Estudiante;
import dominio.Materia;
import dto.EstudianteDTO;
import dto.MateriaDTO;
import java.util.ArrayList;
import java.util.List;

public class EstudianteMapper {

    public static EstudianteDTO toDTO(Estudiante estudiante){
        EstudianteDTO dto = new EstudianteDTO();
        dto.setId(estudiante.getId());
        dto.setNombre(estudiante.getNombre());
        dto.setCorreo(estudiante.getCorreo());
        dto.setCarrera(estudiante.getCarrera());
        dto.setSemestreInscrito(estudiante.getSemestreInscrito());
        List<MateriaDTO> materiasDTO = new ArrayList<>();
        for(Materia materia : estudiante.getMaterias()){
            materiasDTO.add(MateriaMapper.toDTO(materia));
        }
        dto.setMaterias(materiasDTO);
        return  dto;
    }

    public static Estudiante toEntity(EstudianteDTO dto){
        Estudiante entity = new Estudiante();
        entity.setId(dto.getId());
        entity.setNombre(dto.getNombre());
        entity.setCorreo(dto.getCorreo());
        entity.setCarrera(dto.getCarrera());
        entity.setSemestreInscrito(dto.getSemestreInscrito());
        List<Materia> materias = new ArrayList<>();
        for(MateriaDTO materiaDTO : dto.getMaterias()){
            materias.add(MateriaMapper.toEntity(materiaDTO));
        }
        entity.setMaterias(materias);
        return  entity;
    }
}
