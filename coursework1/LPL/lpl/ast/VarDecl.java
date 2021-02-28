package lpl.ast;

public class VarDecl {

    public final Type t;
    public final String id;

    public VarDecl(Type t, String id) {
        this.t = t;
        this.id = id;
    }

    @Override
    public String toString() {
        return t + " " + id + ";";
    }
}
