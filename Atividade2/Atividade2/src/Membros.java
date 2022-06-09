public abstract class Membros implements IPostarMensagem {
    private String username;
    private String email;
    
    public Membros(String username, String email) {
        this.username = username;
        this.email = email;
    }
}
