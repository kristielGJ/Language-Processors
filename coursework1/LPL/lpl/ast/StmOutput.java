package lpl.ast;

public class StmOutput extends Stm {

    public final Exp e;

    public StmOutput(Exp e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "output "+e+";";
    }
}
