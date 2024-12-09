public class Puffendui extends Hogwarts {

    private final int hardWorker; //трудолюбие
    private final int faith;
    private final int honest;

    public Puffendui(String name, int powerMagic, int transgress, int hardWorker, int faith, int honest) {
        super(name, powerMagic, transgress);
        this.hardWorker = hardWorker;
        this.faith = faith;
        this.honest = honest;
    }

    public int calculateTraitsSum() {
        return hardWorker + faith + honest;
    }

    @Override
    public String toString() {
        return "Puffendui{" +
                "Name= " + getName() +
                ", powermagic " + getPowerMagic() +
                ", transgress " + getTransgress() +
                ", faith=" + faith +
                ", hardWorker=" + hardWorker +
                ", honest=" + honest +
                '}';
    }
}
