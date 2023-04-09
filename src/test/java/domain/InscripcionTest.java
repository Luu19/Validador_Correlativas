package domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class InscripcionTest {

    @Test
    public void inscripcionAprobada(){
        Materia discreta = new Materia("discreta", List.of());
        Materia ayed = new Materia("ayed", List.of());
        Materia am1 = new Materia("AM1", List.of());
        Materia pdp = new Materia("PdP", List.of(discreta, ayed));
        Materia am2 = new Materia("am2", List.of(am1));

        Alumno leo = new Alumno("Leo", List.of(am1, discreta, ayed));

        Inscripcion inscripcionDeLeo = new Inscripcion(leo, List.of(am2, pdp));

        Assert.assertTrue(inscripcionDeLeo.aprobado());
    }
    @Test
    public void inscripcionDesaprobada(){
        Materia discreta = new Materia("discreta", List.of());
        Materia syo = new Materia("syo", List.of());
        Materia ayed = new Materia("ayed", List.of());
        Materia am1 = new Materia("AM1", List.of());
        Materia pdp = new Materia("PdP", List.of(discreta, ayed));
        Materia am2 = new Materia("am2", List.of(am1));
        Materia ads = new Materia("ads", List.of(syo, ayed));
        Materia dds = new Materia("dds", List.of(syo, discreta, ayed, pdp, ads));

        Alumno leo = new Alumno("Leo", List.of(ads, discreta, ayed, syo));

        Inscripcion inscripcionDeLeo = new Inscripcion(leo, List.of(dds, am2));

        Assert.assertFalse(inscripcionDeLeo.aprobado());
    }

}
