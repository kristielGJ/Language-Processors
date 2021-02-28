package lpl.ast;

public class PrimaryExpInteger extends PrimaryExp {

    public final int i;

    public PrimaryExpInteger(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return ""+i;
    }
}
