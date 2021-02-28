package lpl.ast;

import java.util.List;
import java.util.Collections;

public class ExpCall extends Exp {

    public final String id;
    public final List<Exp> es;

    public ExpCall(String id, List<Exp> es) {
        this.id = id;
        this.es = Collections.unmodifiableList(es);
    }

    @Override
    public String toString() {
        String result = "";
        for(Exp exp: es){
            result = result + exp.toString() + ",";
        }
        if(es.size() >= 1) {
            result = result.substring(0, result.length() - 1);
        }

        return id + "(" + result + ")" ;


    }
    
}
