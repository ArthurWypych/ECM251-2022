public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Valor do Contador: " + Exemplo.getContador());
        // Exemplo e1 = new Exemplo("Julio na gaita", 6666);
        // Exemplo e2 = new Exemplo("bixarada no vocal", 7029372);
        // System.out.println(e1);
        // System.out.println(e2);
        // System.out.println("Valor do Contador: " + Exemplo.getContador());
        
        System.out.println("" + ValidadorCpf.validar("11111111111"));
        System.out.println("" + ValidadorCpf.validar("11111111112"));
        System.out.println("" + ValidadorCpf.validar("409.712.098-04"));
        System.out.println("" + ValidadorCpf.validar("40971209824"));
        System.out.println("" + ValidadorCpf.validar("40971209805"));
        System.out.println("" + ValidadorCpf.validar("4097120980"));
    }
}
