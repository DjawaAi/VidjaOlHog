public class CompareStudentsOfFaculty {

    public void compare(Gryffindor[] pupil, int i) {
        int b = 0;
        if (i > pupil.length - 1 || i < 0) {
            System.out.println("Количество учеников должно быть от 0 до 2");
        } else {
            switch (i) {
                case 0:
                    b = 2;
                    break;
                case 1:
                    b = 0;
                    break;
                case 2:
                    b = 1;
                    break;
            }
            if (pupil[i].getNobility() + pupil[i].getNobility() + pupil[i].getBravery() > pupil[b].getNobility() + pupil[b].getNobility() + pupil[b].getBravery()) {
                System.out.println(pupil[i].getPupil() + " - лучший маг, чем " + pupil[b].getPupil());
            } else {System.out.println(pupil[b].getPupil() + " - лучший маг, чем " + pupil[i].getPupil());}
        }
    }

    public void compare(Puffenduy[] pupil, int i) {
        int b = 0;
        if (i > pupil.length - 1 || i < 0) {
            System.out.println("Количество учеников должно быть от 0 до 2");
        } else {
            switch (i) {
                case 0:
                    b = 2;
                    break;
                case 1:
                    b = 0;
                    break;
                case 2:
                    b = 1;
                    break;
            }
            if (pupil[i].getHardworking() + pupil[i].getLoyal() + pupil[i].getHonest() > pupil[b].getHardworking() + pupil[b].getLoyal() + pupil[b].getHonest()) {
                System.out.println(pupil[i].getPupil() + " - лучший маг, чем " + pupil[b].getPupil());
            } else {System.out.println(pupil[b].getPupil() + " - лучший маг, чем " + pupil[i].getPupil());}
        }
    }


    public void compare(Slytherin[] pupil, int i) {
        int b = 0;
        if (i > pupil.length - 1 || i < 0) {
            System.out.println("Количество учеников должно быть от 0 до 2");
        } else {
            switch (i) {
                case 0:
                    b = 2;
                    break;
                case 1:
                    b = 0;
                    break;
                case 2:
                    b = 1;
                    break;
            }
            if (pupil[i].getCunning() + pupil[i].getDetermination() + pupil[i].getAmbition() + pupil[i].getResourcefulness() + pupil[i].getThirstForPower() > pupil[b].getCunning() + pupil[b].getDetermination() + pupil[b].getAmbition() + pupil[b].getResourcefulness() + pupil[b].getThirstForPower()) {
                System.out.println(pupil[i].getPupil() + " - лучший маг, чем " + pupil[b].getPupil());
            } else {System.out.println(pupil[b].getPupil() + " - лучший маг, чем " + pupil[i].getPupil());}
        }
    }

    public void compare(Ravenclaw[] pupil, int i) {
        int b = 0;
        if (i > pupil.length - 1 || i < 0) {
            System.out.println("Количество учеников должно быть от 0 до 2");
        } else {
            switch (i) {
                case 0:
                    b = 2;
                    break;
                case 1:
                    b = 0;
                    break;
                case 2:
                    b = 1;
                    break;
            }
            if (pupil[i].getSmart() + pupil[i].getWise() + pupil[i].getWitty() + pupil[i].getCreativity() > pupil[b].getSmart() + pupil[b].getWise() + pupil[b].getWitty() + pupil[b].getCreativity()) {
                System.out.println(pupil[i].getPupil() + " - лучший маг, чем " + pupil[b].getPupil());
            } else {System.out.println(pupil[b].getPupil() + " - лучший маг, чем " + pupil[i].getPupil());}
        }
    }
}
