import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("226e175e-f9b9-4331-b438-aef8ec2cd1e1")
public class Alumno {
    @objid ("6235578b-b3cd-4733-8749-c1f6b55da584")
    private String Nombre;

    @objid ("ec9aa613-cea4-4c76-b41b-1a83b0e6b6fe")
    private String Apellidos;

    @objid ("536434a6-83b2-4961-9114-0f8a88e1e5cc")
    private String NIF;

    @objid ("158f0dac-aaa2-487e-998a-5f34ce361645")
    private String CorreoElectronico;

    @objid ("e99a3ec0-dce4-4afa-af1f-d9d7065dd0e7")
    private String Contrasena;

    @objid ("96d28ea4-571d-40fc-b7e0-80b625eeb0ca")
    public List<Asignatura> asignatura = new ArrayList<Asignatura> ();

}
