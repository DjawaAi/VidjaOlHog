public class Pupil {
    private String name;
    private String surName;

    public Pupil(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Ученик Хогвардс { Имя = '" + name + '\'' +
                ", Фамилия = '" + surName + '\'' +
                "}";
    }
}
