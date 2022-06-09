public class HeavyLifters extends Membros{

    public HeavyLifters(String username, String email) {
        super(username, email);
    }

    Sistema  sys;
    @Override
    public String postarMensagem(String mensagem) {
        if(sys.getTurno().equals("extra"))
            return "";
        else    
            return "";
    }
}
