package lpl.ast;

public class StmOutchar extends Stm {

    public final Exp e;

    public StmOutchar(Exp e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "outchar "+e+";";
    }
}
