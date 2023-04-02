package domain;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Inscripcion {
    public Alumno alumno;
    public List<Materia> materiasAInscribir;

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Materia> getMateriasAInscribir() {
        return materiasAInscribir;
    }

    public void setMateriasAInscribir(List<Materia> materiasAInscribir) {
        this.materiasAInscribir = materiasAInscribir;
    }

    public boolean aprobado(){
        List<Materia> materiasNecesariasParaInscripcion = this.getMateriasAInscribir()
                        .stream()
                        .flatMap(m -> m.getMateriasCorrelativas().stream())
                        .distinct() //Saco las materias que puedan aparecer +1 vez
                        .collect(Collectors.toList())
                        ;
        return alumno.tieneTodasAprobadas(materiasNecesariasParaInscripcion);
    }

}git
