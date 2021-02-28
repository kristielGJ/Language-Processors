package lpl.ast;

import java.util.List;
import java.util.Collections;

public class FunDef {

    public final Type t;
    public final String id;
    public final List<Formal> fs;
    public final List<VarDecl> lvs;
    public final List<Stm> ss;

    public FunDef(Type t, String id, List<Formal> fs, List<VarDecl> lvs, List<Stm> ss) {
        this.t = t;
        this.id = id;
        this.fs = Collections.unmodifiableList(fs);
        this.lvs = Collections.unmodifiableList(lvs);
        this.ss = Collections.unmodifiableList(ss);
    }

    @Override
    public String toString() {
        String formal = "";
        String vardec = "";
        String statement = "";

        for(Formal form: fs){
            formal = formal + form.toString() + ",";
        }
        if(fs.size() >= 1) {
            formal =  formal.substring(0, formal.length() - 1);
        }
        for(VarDecl var: lvs){
            vardec = vardec + var.toString();
        }
        for(Stm state: ss){
            statement = statement + state.toString();
        }


        return "def "+t + " "+id + "(" + formal + ")"+"{ " + vardec + statement + " }";


    }
}
