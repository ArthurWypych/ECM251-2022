import java.util.concurrent.ThreadLocalRandom;

// 19.00565-2 Arthur Wypych de Almeida

public class Veiculos {
    private int id;
    private double custo;
    
    public Veiculos(double custo) {
        this.custo = custo;
        this.id = ThreadLocalRandom.current().nextInt(10000, 99999);
    }

    public void testar(){
        System.out.println("id: " + id);
        System.out.println("custo: " + custo);
    }
}
