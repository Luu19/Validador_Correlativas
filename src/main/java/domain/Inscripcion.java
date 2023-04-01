package domain;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Inscripcion {
    public Alumno alumno;
    public List<Materia> materiasAInscribir;

    public boolean aprobado(){
        List<Materia> materiasNecesariasParaInscripcion = this.materiasAInscribir
                        .stream()
                        .flatMap(m -> m.getMateriasCorrelativas().stream())
                        .distinct() //Saco las materias que puedan aparecer +1 vez
                        .collect(Collectors.toList())
                        ;
        return alumno.tieneTodasAprobadas(materiasNecesariasParaInscripcion);
    }

}git 
