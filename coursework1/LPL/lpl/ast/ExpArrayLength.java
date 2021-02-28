package lpl.ast;

public class ExpArrayLength extends Exp {

    public final PrimaryExp e;

    public ExpArrayLength(PrimaryExp e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return e+".length";
    }

}
