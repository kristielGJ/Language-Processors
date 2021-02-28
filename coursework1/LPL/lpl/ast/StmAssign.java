package lpl.ast;

public class StmAssign extends Stm {

    public final String id;
    public final Exp e;

    public StmAssign(String id, Exp e) {
        this.id = id;
        this.e = e;
    }
    @Override
    public String toString() {
        return id+" = "+e+";";
    }

}
