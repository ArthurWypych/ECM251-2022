public class MobileMembers extends Membros{

    public MobileMembers(String username, String email) {
        super(username, email);
    }
    
    private Sistema sys;
    @Override
    public String postarMensagem(String mensagem) {
        if (sys.getTurno().equals("extra")){
            return "Happy Coding!";
        }
        else
            return "“Happy_C0d1ng. Maskers";
    }
    
}