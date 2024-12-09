public class Hogwarts {

    private String name;
    private final int powerMagic; // сила магии
    private final int transgress; // трангрес


    public Hogwarts(String name, int powerMagic, int transgress) {
        this.name = name;
        this.powerMagic = powerMagic;
        this.transgress = transgress;
    }

    public int calculateTraitsSum() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public int getTransgress() {
        return transgress;
    }


}
