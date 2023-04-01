package domain;

import java.util.List;

public class Alumno {

    private String nombreAlumno;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombreAlumno, List<Materia> materiasAprobadas) {
        this.nombreAlumno = nombreAlumno;
        this.materiasAprobadas = materiasAprobadas;
    }

    private boolean tieneAprobada(Materia materia){
        return materiasAprobadas.contains(materia);
    }

    public boolean tieneTodasAprobadas(List<Materia> materias){
        return materias.stream().allMatch(materia -> tieneAprobada(materia));
    }
}
