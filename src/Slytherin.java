public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int authorities;

    public Slytherin(String name, int powerMagic, int transgress, int cunning, int determination, int ambition, int resourcefulness, int authorities) {

        super(name, powerMagic, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.authorities = authorities;
    }

    public int calculateTraitsSum() {
        return cunning + determination + ambition + resourcefulness + authorities;
    }


    @Override
    public String toString() {
        return "Slytherin{" +
                "Name=" + getName() +
                ", powermagic" + getPowerMagic() +
                ", transgress" + getTransgress() +
                ", ambition=" + ambition +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", resourcefulness=" + resourcefulness +
                ", authorities=" + authorities +
                '}';
    }
}
