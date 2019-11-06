import java.util.ArrayList;

/**
 * @author Shamil Gradov
 */
public class Familie {
    private ArrayList mitglieder;

    public Familie(String vater, String mutter) throws IllegalArgumentException{
        if(vater.trim().equals("")||mutter.trim().equals(""))
            throw new IllegalArgumentException("Name darf nicht leer sein");
    }
    public void addKind(String kind)throws IllegalArgumentException{

        if (kind.trim().equals(""))
            throw new IllegalArgumentException("Name darf nicht leer sein");
    }
    public enum Familienmitglied{
// Ihr Code hier
    }
// implementieren Sie hier die Methode "getMitglied(...)
}