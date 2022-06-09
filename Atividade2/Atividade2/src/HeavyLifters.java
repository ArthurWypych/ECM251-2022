public class HeavyLifters extends Membros{

    public HeavyLifters(String username, String email) {
        super(username, email);
    }

    private Sistema sys = new Sistema();
    @Override
    public String postarMensagem() {
        if(sys.getTurno().equals("extra"))
            return "Podem contar conosco!";
        else    
            return "N00b_qu3_n_Se_r3pita.bat";
    }
}
