package lpl.ast;

public class ExpPrimaryExp extends Exp {

    public final PrimaryExp e;

    public ExpPrimaryExp(PrimaryExp e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return e.toString();
    }
}
