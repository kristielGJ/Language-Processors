package lpl.ast;

public class Formal {

    public final Type t;
    public final String id;

    public Formal(Type t, String id) {
        this.t = t;
        this.id = id;
    }
    
    @Override
    public String toString() {
        return t + " " + id;
    }
}
