package lpl.ast;

public class TypeArray extends Type {

    public final Type t;

    public TypeArray(Type t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return t +"[]";
    }

}
