public class Gryffindor extends Hogwarts{
    private Pupil pupil;
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(int powerOfMagic,
                      int transgressionDistance,
                      Pupil pupil,
                      int nobility,
                      int honor,
                      int bravery) {
        super(powerOfMagic, transgressionDistance);
        this.pupil = pupil;
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public Pupil getPupil() {
        return pupil;
    }

    public void setPupil(Pupil pupil) {
        this.pupil = pupil;
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

    public String toString() {
        return "Gryffindor { " +
                super.toString() +
                ", " + pupil +
                ", благородство = " + nobility +
                ", честь = " + honor +
                ", храбрость = " + bravery +
                '}';
    }
}
