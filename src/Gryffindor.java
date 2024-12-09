public class Gryffindor extends Hogwarts {

    private final int nobility;
    private final int honor;
    private final int courage;


    public Gryffindor(String name, int nobility, int honor, int courage, int powerMagic, int transgress) {
        super(name, powerMagic, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int calculateTraitsSum() {
        return nobility + honor + courage;
    }


    @Override
    public String toString() {
        return "Gryffindor{" +
                "Name=" + getName() +
                ", powermagic " + getPowerMagic() +
                ", transgress " + getTransgress() +
                ", courage=" + courage +
                ", nobility=" + nobility +
                ", honor=" + honor +
                '}';
    }
}
