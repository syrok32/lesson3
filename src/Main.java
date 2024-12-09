

public class Main {
    public static void main(String[] args) {

        Slytherin slytherinStudent1 = new Slytherin("Draco Malfoy", 90, 85, 95, 90, 88, 92, 89);
        Slytherin slytherinStudent2 = new Slytherin("Pansy Parkinson", 85, 80, 88, 85, 90, 87, 88);
        Service.compareSlytherin(slytherinStudent1, slytherinStudent2);

        Gryffindor gryffindorStudent1 = new Gryffindor("Harry Potter", 95, 90, 92, 93, 91);
        Gryffindor gryffindorStudent2 = new Gryffindor("Hermione Granger", 98, 95, 95, 96, 92);
        Service.compareGryffindor(gryffindorStudent1, gryffindorStudent2);

        Puffendui puffenduiStudent1 = new Puffendui("Cedric Diggory", 90, 85, 88, 87, 89);
        Puffendui puffenduiStudent2 = new Puffendui("Ernie Macmillan", 85, 80, 85, 86, 88);
        Service.comparePuffendui(puffenduiStudent1, puffenduiStudent2);

        Clawfoot clawfootStudent1 = new Clawfoot("Luna Lovegood", 88, 85, 89, 92, 90, 3);
        Clawfoot clawfootStudent2 = new Clawfoot("Cho Chang", 92, 88, 90, 91, 89, 5);
        Service.compareClawfoot(clawfootStudent1, clawfootStudent2);

        System.out.println("\nСравнение между факультетами:");
        Service.compareStudents(slytherinStudent1, gryffindorStudent1);
        Service.compareStudents(puffenduiStudent1, clawfootStudent1);

    }
}
