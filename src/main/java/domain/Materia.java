package domain;

import java.util.List;

public class Materia {
    public String nombreMateria;
    public List<Materia> materiasCorrelativas;

    public  Materia(String nombreMateria, List<Materia> materiasCorrelativas) {
        this.nombreMateria = nombreMateria;
        this.materiasCorrelativas = materiasCorrelativas;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public List<Materia> getMateriasCorrelativas() {
        return materiasCorrelativas;
    }

}
