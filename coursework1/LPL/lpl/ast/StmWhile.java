package lpl.ast;

public class StmWhile extends Stm {

    public final Exp e;
    public final Stm body;

    public StmWhile(Exp e, Stm body) {
        this.e = e;
        this.body = body;
    }
    @Override
    public String toString() {
        return "while"+"("+e+")"+body;
    }


}
