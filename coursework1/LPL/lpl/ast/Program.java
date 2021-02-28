package lpl.ast;

import java.util.List;
import java.util.Collections;

public class Program {

    public final FunDef main;
    public final List<FunDef> fds;

    public Program(FunDef main, List<FunDef> fds) {
        this.main = main;
        this.fds = Collections.unmodifiableList(fds);
    }

    @Override
    public String toString() {
        String s = main + "\n";
        for (FunDef fd: fds) s = s + "\n" + fd + "\n";
        return s;
    }
}
