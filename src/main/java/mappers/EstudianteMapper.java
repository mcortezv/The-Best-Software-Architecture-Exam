package mappers;
import dominio.Estudiante;
import dominio.Materia;
import dto.EstudianteDTO;
import dto.MateriaDTO;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Estudiante mapper.
 */
public class EstudianteMapper {

    /**
     * To dto estudiante dto.
     *
     * @param estudiante the estudiante
     * @return the estudiante dto
     */
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

    /**
     * To entity estudiante.
     *
     * @param dto the dto
     * @return the estudiante
     */
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
