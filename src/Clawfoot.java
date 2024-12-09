public class Clawfoot extends Hogwarts {
    private int clever;
    private int wisdom;
    private int witty;
    private int creations;

    public Clawfoot(String name, int powerMagic, int transgress, int clever, int wisdom, int witty, int creations) {
        super(name, powerMagic, transgress);
        this.clever = clever;
        this.wisdom = wisdom;
        this.witty = witty;
        this.creations = creations;
    }

    public int calculateTraitsSum() {
        return wisdom + clever + witty + creations;
    }


    @Override
    public String toString() {
        return "Clawfoot{" +
                "Name= " + getName() +
                ", powermagic " + getPowerMagic() +
                ", transgress " + getTransgress() +
                ",  clever=" + clever +
                ", wisdom=" + wisdom +
                ", witty=" + witty +
                ", creations=" + creations +
                '}';
    }
}
