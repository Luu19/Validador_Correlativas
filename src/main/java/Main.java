import domain.Alumno;
import domain.Inscripcion;
import domain.Materia;

import java.util.List;

public class Main {
    public static void main(String[] args){
        Materia discreta = new Materia("discreta", List.of());
        Materia ayed = new Materia("ayed", List.of());
        Materia am1 = new Materia("AM1", List.of());
        Materia pdp = new Materia("PdP", List.of(discreta, ayed));
        Materia am2 = new Materia("am2", List.of(am1));

        Alumno lucia = new Alumno("Lucia", List.of(am1, discreta, ayed));

        Inscripcion inscripcionDelucia = new Inscripcion(lucia, List.of());

        System.out.println("El estado de inscripcion de " + lucia.getNombreAlumno() + " es " + inscripcionDelucia.aprobado());
    }
}
