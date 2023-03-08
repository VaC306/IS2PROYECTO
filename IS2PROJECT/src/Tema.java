import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("619df225-21c8-4625-ae52-69fc18104805")
public class Tema {
    @objid ("c73df4d4-5096-4e3b-8ab3-931ad935f015")
    private String Nombre;

    @objid ("722ec7ea-042c-4f89-814c-86a888f678ab")
    private int id;

    @objid ("d4ac65a3-99df-45e4-926d-ae56f917edf2")
    public List<Tarea> tarea = new ArrayList<Tarea> ();

    @objid ("e2f9a3c0-7c4a-4ce0-8928-9729b9152498")
    public String getNombre() {
        return Nombre;
    }

}
