// 19.00565-2 Arthur Wypych de Almeida

public class Sistema {
    public void run(){
        Carro c = new Carro(99.99);
        Bicicleta b = new Bicicleta(19.99);
        Usuario u1 = new Usuario("Narutinho", c);
        System.out.println(u1.getNome());
        u1.trocar(b);
        u1.setNome("Saaaaaaaasuke");
        u1.trocar(c);
        System.out.println(u1.getNome());
    }
}
