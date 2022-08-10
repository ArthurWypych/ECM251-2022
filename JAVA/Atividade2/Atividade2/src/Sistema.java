import java.util.ArrayList;

public class Sistema{
    private String turno = "regular";

    // private void registrarMembros(String nome, String email, String funcao){
    //      //String nmem[] = {nome,email,funcao};
    //      Membros nome = new BigBrother(nome, email)

    //      memlist.add(new funcao(nome, email));

    //  }

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

        Membros a1 = new BigBrother("nome","email");
        Membros a2 = new ScriptGuys("nome","email");
        Membros a3 = new MobileMembers("nome","email");
        Membros a4 = new HeavyLifters("nome","email");

        ArrayList memlist = new ArrayList<>();
        memlist.add(a1);
        memlist.add(a2);
        memlist.add(a3);
        memlist.add(a4);


        // registrarMembros("foda", "mais foda", "BigBrother");
        // registrarMembros("actual_child", "kiddie.com", "ScriptGuys");
        // registrarMembros("not_a_gamer", "shitake", "MobileMembers");
        // registrarMembros("HEAVY_IS_DEAD", "I AM DEAD", "HeavyLifters");



        System.out.println(a1.postarMensagem()); 
        System.out.println(a2.postarMensagem());
        System.out.println(a3.postarMensagem());
        System.out.println(a4.postarMensagem());

        mudarTurno();

        a1.postarMensagem();
        a2.postarMensagem();
        a3.postarMensagem();
        a4.postarMensagem();

        mudarTurno();

        memlist.remove(a2);
        memlist.remove(a3);

        System.out.println(a1.postarMensagem());
        System.out.println(a4.postarMensagem());
    }
}
