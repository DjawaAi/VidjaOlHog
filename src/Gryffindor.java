public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(int powerOfMagic, int transgressionDistance, int bravery, int honor, int nobility) {
        super(powerOfMagic, transgressionDistance);
        this.bravery = bravery;
        this.honor = honor;
        this.nobility = nobility;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }
}
