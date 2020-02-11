import terminaltransporte.TipoDocumentoIdentidad;
import terminaltransporte.entities.Persona;
import terminaltransporte.persistencia.PersonaDAO;
import terminaltransporte.persistencia.impl.PersonaDAOMySQL;
import terminaltransporte.persistencia.impl.PersonaDAOPostgres;

public class Main {


    public static void main(String[] args) {


        PersonaDAO personaDAO = new PersonaDAOPostgres();
        String idPersona = "1";
        Persona persona = personaDAO.findById(idPersona);
        if(persona == null){
            persona = new Persona();
            persona.setNombre("Fulanito");
            personaDAO.insert(persona);
        }
        personaDAO.findByDocumentoIdentidad(TipoDocumentoIdentidad.CEDULA_CIUDADANIA.getId());





    }





}
