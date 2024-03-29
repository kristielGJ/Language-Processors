package lpl.ast;

public class ExpOp extends Exp {

    public final PrimaryExp e1, e2;
    public final Op op;

    public ExpOp(PrimaryExp e1, Op op, PrimaryExp e2) {
        this.e1 = e1;
        this.op = op;
        this.e2 = e2;
    }
    
    @Override
    public String toString() {
        return e1 + " " + op + " " + e2;
    }
}
