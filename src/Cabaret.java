import java.util.ArrayList;
public class Cabaret {

    private String name;
    private ArrayList<Performer> performers;

    public Cabaret(String name) {
        this.name = name;
        performers = new ArrayList<Performer>();
    }

    private void Getname() {
        return name;
    }

    private void Getperformers() {
        return performers;
    }


    public void addperformer(Dancer potential) {
        if (performers.indexOf(potential) == -1) {
            return true;
            performers.add(potential);
        } else {
            return false;
        }
    }

    public void removeperformer(Dancer remove)
    {
        if (performers.indexOf(remove) == -1) {
            return true;
            performers.remove(remove);
        }
        else {
            return false;
        }
    }

    

}
