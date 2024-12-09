public class Service {
    private static void compareStudentsByTraits(Hogwarts student1, Hogwarts student2, String facultyName) {
        int sumQualityFirst = student1.calculateTraitsSum();
        int sumQualitySecond = student2.calculateTraitsSum();

        System.out.println("Сравнение студентов факультета " + facultyName + ":");
        if (sumQualityFirst > sumQualitySecond) {
            System.out.println(student1.getName() + " лучше, набрав " + sumQualityFirst + " очков.");
        } else if (sumQualityFirst < sumQualitySecond) {
            System.out.println(student2.getName() + " лучше, набрав " + sumQualitySecond + " очков.");
        } else {
            System.out.println("У обоих одинаковый результат: " + sumQualityFirst + " очков.");
        }
    }

    public static void compareSlytherin(Slytherin student1, Slytherin student2) {
        compareStudentsByTraits(student1, student2, "Слизерин");
    }

    public static void compareGryffindor(Gryffindor student1, Gryffindor student2) {
        compareStudentsByTraits(student1, student2, "Гриффиндор");
    }

    public static void comparePuffendui(Puffendui student1, Puffendui student2) {
        compareStudentsByTraits(student1, student2, "Пуффендуй");
    }

    public static void compareClawfoot(Clawfoot student1, Clawfoot student2) {
        compareStudentsByTraits(student1, student2, "Когтевран");
    }

    public static void compareStudents(Hogwarts student1, Hogwarts student2) {
        System.out.println("Сравнение учеников Хогвартса:");
        if (student1.getPowerMagic() > student2.getPowerMagic()) {
            System.out.println(student1.getName() + " обладает большей мощностью магии, чем " + student2.getName() + ".");
        } else if (student1.getPowerMagic() < student2.getPowerMagic()) {
            System.out.println(student2.getName() + " обладает большей мощностью магии, чем " + student1.getName() + ".");
        } else {
            System.out.println("Оба ученика, " + student1.getName() + " и " + student2.getName() + ", обладают одинаковой мощностью магии.");
        }

        if (student1.getTransgress() > student2.getTransgress()) {
            System.out.println(student1.getName() + " может трансгрессировать на большее расстояние, чем " + student2.getName() + ".");
        } else if (student1.getTransgress() < student2.getTransgress()) {
            System.out.println(student2.getName() + " может трансгрессировать на большее расстояние, чем " + student1.getName() + ".");
        } else {
            System.out.println("Оба ученика, " + student1.getName() + " и " + student2.getName() + ", могут трансгрессировать на одинаковое расстояние.");
        }
    }
}
