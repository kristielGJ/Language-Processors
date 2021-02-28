package lpl.ast;

public class PrimaryExpExp extends PrimaryExp {

    public final Exp e;

    public PrimaryExpExp(Exp e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "(" + e + ")";
    }
}
