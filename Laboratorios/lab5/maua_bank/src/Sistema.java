import java.time.LocalDate;
import java.time.Period;

public class Sistema {

    public void run(){
        Cliente cliente = new Cliente("Picudo", "1111111", "gaymail@gemas.porra");

        Conta conta = new Conta(321321, cliente);
        System.out.println(conta);

        Titulo titulo = new Titulo(686.97, LocalDate.of(2022, 3, 30), 5);
        
    }

    boolean pagarTitulo(Titulo titulo, Conta conta){
        LocalDate prazo = titulo.getData();
        LocalDate hoje = LocalDate.now();
        double valor;
        if(prazo.compareTo(hoje) <= 0){
            valor = titulo.getValor();
        }
        else{
            int diasAtrazo = Period.between(prazo, hoje).getDays();
            valor = titulo.getValor() + (titulo.getValor() * ((titulo.getMultaDiaria()/100)*diasAtrazo));
        }

        
        return true;
    }
}
