package lpl.ast;

public class PrimaryExpIsnull extends PrimaryExp {

    public final PrimaryExp e;

    public PrimaryExpIsnull(PrimaryExp e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "isnull "+ e.toString();
    }

}
