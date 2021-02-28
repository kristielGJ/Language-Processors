package lpl.ast;

public abstract class Type {
    
    @Override
    public String toString() {
        // non need to change this - add appropriate overrides in subclasses
        throw new Error("toString not overridden in class " + this.getClass().getName());
    }
}
