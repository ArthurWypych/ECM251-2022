// 19.00565-2 Arthur Wypych de Almeida

public class Sistema {
    public void run(){
        Carro carro = new Carro(99.99);
        Bicicleta bicicleta = new Bicicleta(19.99);
        Patinete patinete = new Patinete(18.99);
        Moto moto = new Moto(59.99);
        Usuario u1 = new Usuario("Narutinho", carro);
        System.out.println(u1.getNome());
        u1.trocar(bicicleta);
        u1.setNome("Saaaaaaaasuke");
        u1.trocar(patinete);
        System.out.println(u1.getNome());
        u1.trocar(moto);
    }
}
