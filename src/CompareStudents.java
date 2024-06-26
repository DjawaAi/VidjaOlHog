public class CompareStudents {
    public void cmpStudents(Gryffindor[] gryffindor, Puffenduy[] puffenduy, Slytherin[] slytherin, Ravenclaw[] ravenclaw, int studentA, int studentB) {

        int sumOfArraysLength = gryffindor.length + puffenduy.length + slytherin.length + ravenclaw.length;

        int i = 0;


        if (studentA > sumOfArraysLength || studentB > sumOfArraysLength || studentA < 0 || studentB < 0) {
            System.out.println("Порядковые номера учеников А и В должны быть отличны и в пределах от 0 до 11");
        } else {
            switch (studentA) {
                case 0:
                case 1:
                case 2:
                    i = sumOfArraysLength % 3;
                    if (gryffindor[i].getPowerOfMagic() > slytherin[i].getPowerOfMagic()) {
                        System.out.print("Магическая сила " + gryffindor[i].getPupil() + " могущественнее, чем у " + slytherin[i].getPupil()+ " ");
                    } else {
                        System.out.print("Магическая сила " + slytherin[i].getPupil() + " могущественнее, чем у " + gryffindor[i].getPupil()+ " ");
                    }
                    if (gryffindor[i].getTransgressionDistance() > slytherin[i].getTransgressionDistance()) {
                        System.out.print("расстояние трансгрессии " + gryffindor[i].getPupil() + " обширнее, чем у " + slytherin[i].getPupil());
                    } else {
                        System.out.print("расстояние трансгрессии " + slytherin[i].getPupil() + " обширнее, чем у " + gryffindor[i].getPupil());
                    }
                    break;
                case 3:
                case 4:
                case 5:
                    i = sumOfArraysLength % 3;
                    if (puffenduy[i].getPowerOfMagic() > slytherin[i].getPowerOfMagic()) {
                        System.out.print("Магическая сила " + puffenduy[i].getPupil() + " могущественнее, чем у " + slytherin[i].getPupil()+ " ");
                    } else {
                        System.out.print("Магическая сила " + slytherin[i].getPupil() + " могущественнее, чем у " + puffenduy[i].getPupil()+ " ");
                    }
                    if (puffenduy[i].getTransgressionDistance() > slytherin[i].getTransgressionDistance()) {
                        System.out.print("расстояние трансгрессии " + puffenduy[i].getPupil() + " обширнее, чем у " + slytherin[i].getPupil());
                    } else {
                        System.out.print("расстояние трансгрессии " + slytherin[i].getPupil() + " обширнее, чем у " + puffenduy[i].getPupil());
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    i = sumOfArraysLength % 3;
                    if (ravenclaw[i].getPowerOfMagic() > slytherin[i].getPowerOfMagic()) {
                        System.out.print("Магическая сила " + ravenclaw[i].getPupil() + " могущественнее, чем у " + slytherin[i].getPupil()+ " ");
                    } else {
                        System.out.print("Магическая сила " + slytherin[i].getPupil() + " могущественнее, чем у " + ravenclaw[i].getPupil()+ " ");
                    }
                    if (ravenclaw[i].getTransgressionDistance() > slytherin[i].getTransgressionDistance()) {
                        System.out.print("расстояние трансгрессии " + ravenclaw[i].getPupil() + " обширнее, чем у " + slytherin[i].getPupil());
                    } else {
                        System.out.print("расстояние трансгрессии " + slytherin[i].getPupil() + " обширнее, чем у " + ravenclaw[i].getPupil());
                    }
                    break;
                case 9:
                case 10:
                case 11:
                    i = sumOfArraysLength % 3;
                    if (gryffindor[i].getPowerOfMagic() > puffenduy[i].getPowerOfMagic()) {
                        System.out.print("Магическая сила " + gryffindor[i].getPupil() + " могущественнее, чем у " + puffenduy[i].getPupil()+ " ");
                    } else {
                        System.out.print("Магическая сила " + puffenduy[i].getPupil() + " могущественнее, чем у " + gryffindor[i].getPupil()+ " ");
                    }
                    if (gryffindor[i].getTransgressionDistance() > puffenduy[i].getTransgressionDistance()) {
                        System.out.print("расстояние трансгрессии " + gryffindor[i].getPupil() + " обширнее, чем у " + puffenduy[i].getPupil());
                    } else {
                        System.out.print("расстояние трансгрессии " + puffenduy[i].getPupil() + " обширнее, чем у " + gryffindor[i].getPupil());
                    }
                    break;
            }


        }
    }
}
