package lpl.ast;

public class StmIf extends Stm {

    public final Exp e;
    public final Stm st, sf;

    public StmIf(Exp e, Stm st, Stm sf) {
        this.e = e;
        this.st = st;
        this.sf = sf;
    }

    @Override
    public String toString() {
        return "if (" + e + ") " + st + " else " + sf;
    }
}
