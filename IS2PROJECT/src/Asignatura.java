import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8ae8797e-9a85-4f4f-bb6d-ca24272e0aa7")
public class Asignatura {
    @objid ("0e12f7fc-6fd1-4381-b067-6ce69702c46e")
    private char Clase;

    @objid ("0c71c335-d79a-4a6a-b7b0-f9bf60264940")
    private int Curso;

    @objid ("0270a685-26ba-4af4-89bc-05225c7786bb")
    private String Nombre;

    @objid ("91a46654-c256-4617-aa3e-9075b4bb27ce")
    private int nAlumnos;

    @objid ("7df7ef94-b7ce-4e48-9ed7-32889a9eeddd")
    private String ID;

    @objid ("d65881ad-544e-4eea-8612-d071f517c8a3")
    private boolean Cuatrimestre;

    @objid ("6fae1958-85a4-4498-9db9-ca363fdeab81")
    public List<Tema> tema = new ArrayList<Tema> ();

}
