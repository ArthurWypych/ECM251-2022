public class ScriptGuys extends Membros{

    public ScriptGuys(String username, String email) {
        super(username, email);
    }

    private Sistema sys = new Sistema();
    @Override
    public String postarMensagem() {
        if(sys.getTurno().equals("extra"))
            return "Prazer em ajudar novos amigos de código!";
        else    
            return "QU3Ro_S3us_r3curs0s.py";
    }
}
