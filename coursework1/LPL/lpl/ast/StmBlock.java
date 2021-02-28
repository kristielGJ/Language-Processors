package lpl.ast;

import java.util.List;
import java.util.Collections;

public class StmBlock extends Stm {

    public final List<Stm> ss;

    public StmBlock(List<Stm> ss) {
        this.ss = Collections.unmodifiableList(ss);
    }

    @Override
    public String toString() {
        String statement = "";
        for(Stm state: ss){
            statement = statement + state.toString();
        }

        return "{"+statement+"}";
    }
}
