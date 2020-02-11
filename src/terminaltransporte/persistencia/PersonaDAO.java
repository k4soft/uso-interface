package terminaltransporte.persistencia;

import terminaltransporte.entities.Persona;

public interface PersonaDAO {

     Persona findById(String id);

     void insert(Persona persona);
}
