public class Genin extends Ninja{
    public Genin(String name, String family, String[] jutsus, String misson) {
        super(name, family, jutsus);
        this.mission = mission;
    }
    private String mission;

    public String goToMission(){
        return String.format("%s está indo na missao %s", getName(), mission);
    }

    @Override
    public String train(){
        return String.format("%s está treinando o uuj %s", getName(), getJutsus()[0]);
    }
}