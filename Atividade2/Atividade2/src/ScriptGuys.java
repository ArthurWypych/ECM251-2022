public class ScriptGuys extends Membros{

    public ScriptGuys(String username, String email) {
        super(username, email);
    }

    Sistema  sys;
    @Override
    public String postarMensagem(String mensagem) {
        if(sys.getTurno().equals("extra"))
            return "Prazer em ajudar novos amigos de código!";
        else    
            return "QU3Ro_S3us_r3curs0s.py";
    }
}
