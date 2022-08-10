public class MobileMembers extends Membros{

    public MobileMembers(String username, String email) {
        super(username, email);
    }
    
    private Sistema sys = new Sistema();
    @Override
    public String postarMensagem() {
        if (sys.getTurno().equals("extra")){
            return "Happy Coding!";
        }
        else
            return "“Happy_C0d1ng. Maskers";
    }
    
}