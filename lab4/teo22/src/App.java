public class App {
    public static void main(String[] args) throws Exception {
        // Declara um objeto caneta e instancia ele
        Caneta c1 = new Caneta();

        c1.iniciarCaneta("BIC", "ZAUL" , 1.0);
        Caneta c2 = new Caneta();
        c2.iniciarCaneta("Stabillo", "reee", 0.4);
        System.out.println("Minha caneta C1: " + c1.pegarDados());
        System.out.println("Minha caneta C2: " + c2.pegarDados());
}
}
