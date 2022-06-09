public class BigBrother extends Membros{

    public BigBrother(String username, String email) {
        super(username, email);
    }
    
    private Sistema sys = new Sistema();
    @Override
    public String postarMensagem() {
        if(sys.getTurno().equals("extra"))
            return "Sempre ajudando as pessoas membros ou não S2!";
        else    
            return "...";
    }
}
