package domain;

import java.util.List;

public class Materia {
    public String nombreMateria;
    public List<Materia> materiasCorrelativas;

    public String getNombreMateria() {
        return nombreMateria;
    }

    public List<Materia> getMateriasCorrelativas() {
        return materiasCorrelativas;
    }

}
