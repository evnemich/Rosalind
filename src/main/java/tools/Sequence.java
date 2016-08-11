package tools;

/**
 * Created by Evgenii_Nemich on 8/9/2016.
 */
public class Sequence {
    private String name;
    private String sequence;

    public String getName() {
        return name;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public Sequence(String name) {
        this.name = name;
    }

    public Sequence(String name, String sequence) {
        this.name = name;
        this.sequence = sequence;
    }
}
