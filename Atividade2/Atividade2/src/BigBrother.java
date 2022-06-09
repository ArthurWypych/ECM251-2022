public class BigBrother extends Membros{

    public BigBrother(String username, String email) {
        super(username, email);
    }
    
    Sistema  sys;
    @Override
    public String postarMensagem(String mensagem) {
        if(sys.getTurno().equals("extra"))
            return "Sempre ajudando as pessoas membros ou não S2!";
        else    
            return "...";
    }
}
