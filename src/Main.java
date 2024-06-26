import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Gryffindor[] gryffindor = {
                new Gryffindor(94, 91, new Pupil("Гарри", "Поттер"), 87, 79, 96),
                new Gryffindor(90, 87, new Pupil("Гермиона", "Грейнджер"), 84, 78, 92),
                new Gryffindor(75, 88, new Pupil("Рон", "Уизли"), 84, 59, 48)
        };

        Puffenduy[] puffenduy = {
                new Puffenduy(85, 67, new Pupil("Захария", "Смит"), 89, 78, 99),
                new Puffenduy(91, 96, new Pupil("Седрик", "Диггори"), 74, 82, 46),
                new Puffenduy(94, 64, new Pupil("Джастин", "Финч-Флетчли"), 47, 85, 89)
        };

        Slytherin[] slytherin = {
                new Slytherin(74, 91, new Pupil("Драко", "Малфой"), 54, 49, 76, 92, 55),
                new Slytherin(48, 58, new Pupil("Грэхэм", "Монтегю"), 88, 74, 62, 93, 48),
                new Slytherin(58, 38, new Pupil("Грегори", "Гойл"), 67, 59, 38, 79, 82)
        };

        Ravenclaw[] ravenclaw = {
                new Ravenclaw(86, 25, new Pupil("Чжоу", "Чанг"), 49, 87, 29, 79),
                new Ravenclaw(88, 98, new Pupil("Падма", "Патил"), 87, 37, 64, 79),
                new Ravenclaw(100, 89, new Pupil("Маркус", "Белби"), 100, 85, 58, 61)
        };

        PrintService printService = new PrintService();
        System.out.println();
        printService.print(gryffindor);
        System.out.println();
        printService.print(puffenduy);
        System.out.println();
        printService.print(slytherin);
        System.out.println();
        printService.print(ravenclaw);
        System.out.println();
        CompareStudentsOfFaculty cmpStdOfFcl = new CompareStudentsOfFaculty();
        System.out.println();
        cmpStdOfFcl.compare(gryffindor, 2);
        System.out.println();
        cmpStdOfFcl.compare(puffenduy, 1);
        System.out.println();
        cmpStdOfFcl.compare(slytherin, 0);
        System.out.println();
        cmpStdOfFcl.compare(ravenclaw, 2);
        System.out.println();
        CompareStudents compareStudents = new CompareStudents();
        compareStudents.cmpStudents(gryffindor, puffenduy, slytherin, ravenclaw, 5, 0);
    }
}