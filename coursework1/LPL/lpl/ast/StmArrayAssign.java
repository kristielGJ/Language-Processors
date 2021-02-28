package lpl.ast;

public class StmArrayAssign extends Stm {

    public final PrimaryExp e1;
    public final Exp e2, e3;

    public StmArrayAssign(PrimaryExp e1, Exp e2, Exp e3) {
        this.e1 = e1;
        this.e2 = e2;
        this.e3 = e3;
    }

    @Override
    public String toString() {
        return e1 + "["+e2+"]" + " = " + e3 + ";";
    }

}
