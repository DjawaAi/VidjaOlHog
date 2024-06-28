public class CompareStudents {

    public void cmpStudents(Slytherin slytherin,
                            Ravenclaw ravenclaw) {
        if (slytherin.getPowerOfMagic() > ravenclaw.getPowerOfMagic()) {
            System.out.println("Магическая сила " + slytherin.getPupil() + " могущественнее, чем " + ravenclaw.getPupil());
        } else {
            System.out.println("Магическая сила " + ravenclaw.getPupil() + " могущественнее, чем " + slytherin.getPupil());
        }
        if (slytherin.getTransgressionDistance() > ravenclaw.getTransgressionDistance()) {
            System.out.println("расстояние трансгрессии " + slytherin.getPupil() + " обширнее, чем " + ravenclaw.getPupil());
            System.out.println();
        } else {
            System.out.println("расстояние трансгрессии " + ravenclaw.getPupil() + " обширнее, чем " + slytherin.getPupil());
            System.out.println();
        }
    }

    public void cmpStudents(Puffenduy puffenduy,
                            Ravenclaw ravenclaw) {
        if (puffenduy.getPowerOfMagic() > ravenclaw.getPowerOfMagic()) {
            System.out.println("Магическая сила " + puffenduy.getPupil() + " могущественнее, чем " + ravenclaw.getPupil());
        } else {
            System.out.println("Магическая сила " + ravenclaw.getPupil() + " могущественнее, чем " + puffenduy.getPupil());
        }
        if (puffenduy.getTransgressionDistance() > ravenclaw.getTransgressionDistance()) {
            System.out.println("расстояние трансгрессии " + puffenduy.getPupil() + " обширнее, чем " + ravenclaw.getPupil());
            System.out.println();
        } else {
            System.out.println("расстояние трансгрессии " + ravenclaw.getPupil() + " обширнее, чем " + puffenduy.getPupil());
            System.out.println();
        }
    }

    public void cmpStudents(Puffenduy puffenduy,
                            Slytherin slytherin) {
        if (slytherin.getPowerOfMagic() > puffenduy.getPowerOfMagic()) {
            System.out.println("Магическая сила " + slytherin.getPupil() + " могущественнее, чем " + puffenduy.getPupil());
        } else {
            System.out.println("Магическая сила " + puffenduy.getPupil() + " могущественнее, чем " + slytherin.getPupil());
        }
        if (slytherin.getTransgressionDistance() > puffenduy.getTransgressionDistance()) {
            System.out.println("расстояние трансгрессии " + slytherin.getPupil() + " обширнее, чем " + puffenduy.getPupil());
            System.out.println();
        } else {
            System.out.println("расстояние трансгрессии " + puffenduy.getPupil() + " обширнее, чем " + slytherin.getPupil());
            System.out.println();
        }
    }

    public void cmpStudents(Gryffindor gryffindor,
                            Ravenclaw ravenclaw) {
        if (gryffindor.getPowerOfMagic() > ravenclaw.getPowerOfMagic()) {
            System.out.println("Магическая сила " + gryffindor.getPupil() + " могущественнее, чем " + ravenclaw.getPupil());
        } else {
            System.out.println("Магическая сила " + ravenclaw.getPupil() + " могущественнее, чем " + gryffindor.getPupil());
        }
        if (gryffindor.getTransgressionDistance() > ravenclaw.getTransgressionDistance()) {
            System.out.println("расстояние трансгрессии " + gryffindor.getPupil() + " обширнее, чем " + ravenclaw.getPupil());
            System.out.println();
        } else {
            System.out.println("расстояние трансгрессии " + ravenclaw.getPupil() + " обширнее, чем " + gryffindor.getPupil());
            System.out.println();
        }
    }

    public void cmpStudents(Gryffindor gryffindor,
                            Slytherin slytherin) {
        if (gryffindor.getPowerOfMagic() > slytherin.getPowerOfMagic()) {
            System.out.println("Магическая сила " + gryffindor.getPupil() + " могущественнее, чем " + slytherin.getPupil());
        } else {
            System.out.println("Магическая сила " + slytherin.getPupil() + " могущественнее, чем " + gryffindor.getPupil());
        }
        if (gryffindor.getTransgressionDistance() > slytherin.getTransgressionDistance()) {
            System.out.println("расстояние трансгрессии " + gryffindor.getPupil() + " обширнее, чем " + slytherin.getPupil());
            System.out.println();
        } else {
            System.out.println("расстояние трансгрессии " + slytherin.getPupil() + " обширнее, чем " + gryffindor.getPupil());
            System.out.println();
        }
    }

    public void cmpStudents(Gryffindor gryffindor,
                            Puffenduy puffenduy) {
        if (gryffindor.getPowerOfMagic() > puffenduy.getPowerOfMagic()) {
            System.out.println("Магическая сила " + gryffindor.getPupil() + " могущественнее, чем " + puffenduy.getPupil());
        } else {
            System.out.println("Магическая сила " + puffenduy.getPupil() + " могущественнее, чем " + gryffindor.getPupil());
        }
        if (gryffindor.getTransgressionDistance() > puffenduy.getTransgressionDistance()) {
            System.out.println("расстояние трансгрессии " + gryffindor.getPupil() + " обширнее, чем " + puffenduy.getPupil());
            System.out.println();
        } else {
            System.out.println("расстояние трансгрессии " + puffenduy.getPupil() + " обширнее, чем " + gryffindor.getPupil());
            System.out.println();
        }
    }
}