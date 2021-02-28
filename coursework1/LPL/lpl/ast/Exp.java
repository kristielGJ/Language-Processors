package lpl.ast;

public abstract class Exp {
    
    @Override
    public String toString() {
        throw new Error("toString not overridden in class " + this.getClass().getName());
    }
}
