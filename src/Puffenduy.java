public class Puffenduy extends Hogwarts {
    private Pupil pupil;
    private int hardworking;
    private int loyal;
    private int honest;

    public Puffenduy(int powerOfMagic,
                     int transgressionDistance,
                     Pupil pupil,
                     int hardworking,
                     int loyal,
                     int honest) {
        super(powerOfMagic, transgressionDistance);
        this.pupil = pupil;
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public Pupil getPupil() {
        return pupil;
    }

    public void setPupil(Pupil pupil) {
        this.pupil = pupil;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public String toString() {
        return "Puffenduy { " +
                super.toString() +
                ", " + pupil +
                ", трудолюбие = " + hardworking +
                ", верность = " + loyal +
                ", честность = " + honest +
                '}';
    }
}
