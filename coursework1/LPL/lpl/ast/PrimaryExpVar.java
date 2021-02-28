package lpl.ast;

public class PrimaryExpVar extends PrimaryExp {

    public final String id;

    public PrimaryExpVar(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }
}
