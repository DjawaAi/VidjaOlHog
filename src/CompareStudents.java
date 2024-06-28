public class CompareStudents {
    public void cmpStudents(Gryffindor[] gryffindor,
                            Puffenduy[] puffenduy,
                            Slytherin[] slytherin,
                            Ravenclaw[] ravenclaw) {

    }
    public void cmpStudents(Slytherin[] slytherin,
                             Ravenclaw[] ravenclaw) {
        for (int i = 0; i <= 2; i++) {
            if (slytherin[i].getPowerOfMagic() > ravenclaw[i].getPowerOfMagic()) {
                System.out.println("Магическая сила " + slytherin[i].getPupil() + " могущественнее, чем " + ravenclaw[i].getPupil());
            } else { System.out.println("Магическая сила " + ravenclaw[i].getPupil() + " могущественнее, чем " + slytherin[i].getPupil());
            }
            if (slytherin[i].getTransgressionDistance() > ravenclaw[i].getTransgressionDistance()) {
                System.out.println("расстояние трансгрессии " + slytherin[i].getPupil() + " обширнее, чем " + ravenclaw[i].getPupil());
                System.out.println();
            } else { System.out.println("расстояние трансгрессии " + ravenclaw[i].getPupil() + " обширнее, чем " + slytherin[i].getPupil());
                System.out.println();
            }
        }
    }

    public void cmpStudents(Puffenduy[] puffenduy,
                            Ravenclaw[] ravenclaw) {
    }

    public void cmpStudents(Puffenduy[] puffenduy,
                            Slytherin[] slytherin) {
    }

    public void cmpStudents(Gryffindor[] gryffindor,
                            Ravenclaw[] ravenclaw) {
    }

    public void cmpStudents(Gryffindor[] gryffindor,
                            Slytherin[] slytherin) {
    }

    public void cmpStudents(Gryffindor[] gryffindor,
                            Puffenduy[] puffenduy) {
    }

}