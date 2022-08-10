public class Jogada {
    private final EnumJogadas venco;
    private final EnumJogadas venco2;
    public Jogada(EnumJogadas venco, EnumJogadas venco2) {
        this.venco = venco;
        this.venco2 = venco;
    }

    public boolean verificarVenceu(Jogada jogada){
        if(jogada.getTipo().equals(venco) || jogada.getTipo().equals(venco2))
            return true;
        return false;
    }

    public EnumJogadas getTipo(){
        return EnumJogadas.PAPEL;
    }
    public String toString(){
        return "";
    }
}
