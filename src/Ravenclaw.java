public class Ravenclaw extends Hogwarts {
    private Pupil pupil;
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw(int powerOfMagic, int transgressionDistance, Pupil pupil, int smart, int wise, int witty, int creativity) {
        super(powerOfMagic, transgressionDistance);
        this.pupil = pupil;
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public Pupil getPupil() {
        return pupil;
    }

    public void setPupil(Pupil pupil) {
        this.pupil = pupil;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                " Магическая сила = " + getPowerOfMagic() +
                ", Расстояние трансгрессии = " + getPowerOfMagic() +
                ", " + pupil +
                ", ум = " + smart +
                ", мудрость = " + wise +
                ", остроумие = " + witty +
                ", творчество = " + creativity +
                '}';
    }
}
