package lpl.ast;

public class PrimaryExpNewArray extends PrimaryExp {

    public final Type t;
    public final Exp e;

    public PrimaryExpNewArray(Type t, Exp e) {
        this.t = t;
        this.e = e;
    }
    @Override
    public String toString() {
        return "new " + t.toString() +" ["+ e.toString() + "]";
    }
}
