import java.util.ArrayList;

public class Sistema{
    private String turno = "regular";
    private ArrayList memlist;
    private void registrarMembros(String nome, String email, String funcao){
        //String nmem[] = {nome,email,funcao};
        //membros registrarMembros.nome = new registrarmfuncao 

        memlist.add(new funcao(nome, email));

    }

    private void mudarTurno(){
        if(turno.equals("regular")){
            turno = "extra";
            System.out.println("Turno mudado para \"extra\"");
        }
        else {
            turno = "regular";
            System.out.println("Turno mudado para \"regular\"");
        }
    }

    public String getTurno(){
        return turno;
    }

    public void run(){

        // Membros a1 = new BigBrother("nome","email");
        // Membros a2 = new BigBrother("nome","email");
        // Membros a3 = new BigBrother("nome","email");
        // Membros a4 = new BigBrother("nome","email");
        // Membros a5 = new BigBrother("nome","email");
        // Membros a6 = new BigBrother("nome","email");

        registrarMembros("foda", "mais foda", "BigBrother");
        registrarMembros("actual_child", "kiddie.com", "ScriptGuys");
        registrarMembros("not_a_gamer", "shitake", "MobileMembers");
        registrarMembros("HEAVY_IS_DEAD", "I AM DEAD", "HeavyLifters");

        foda.postarMensagem();
        actual_child.postarMensagem();
        not_a_gamer.postarMensagem();
        HEAVY_IS_DEAD.postarMensagem();

        mudarTurno();

        foda.postarMensagem();
        actual_child.postarMensagem();
        not_a_gamer.postarMensagem();
        HEAVY_IS_DEAD.postarMensagem();

        mudarTurno();

        memlist.remove("");
        memlist.remove("");

        foda.postarMensagem();
        not_a_gamer.postarMensagem();
    }
}
