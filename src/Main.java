import terminaltransporte.entities.Persona;
import terminaltransporte.persistencia.PersonaDAO;
import terminaltransporte.persistencia.impl.PersonaDAOMySQL;
import terminaltransporte.persistencia.impl.PersonaDAOPostgres;

public class Main {


    public static void main(String[] args) {


        PersonaDAO personaDAOPostgres = new PersonaDAOPostgres();
        Persona persona = personaDAOPostgres.findById("1");
        if(persona == null){
            persona = new Persona();
            persona.setNombre("Fulanito");
            personaDAOPostgres.insert(persona);
        }




    }





}
