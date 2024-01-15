import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor((int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100));
        Gryffindor hermioneGranger = new Gryffindor((int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100));
        Gryffindor ronWeasley = new Gryffindor((int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100));
        Slytherin dracoMalfoy = new Slytherin((int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100));
        Slytherin grahamMontague = new Slytherin((int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100));
        Slytherin gregoryGoyle = new Slytherin((int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100));
        Hufflepuff zachariahSmith = new Hufflepuff((int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100));
        Hufflepuff cedricDiggory = new Hufflepuff((int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100));
        Hufflepuff justinFinchFletchley = new Hufflepuff((int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100));
        Ravenclaw zhouChang = new Ravenclaw((int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100));
        Ravenclaw padmaPatil = new Ravenclaw((int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100));
        Ravenclaw marcusBelby = new Ravenclaw((int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100));

        harryPotter.printStudent();
        hermioneGranger.printStudent();
        harryPotter.equals(hermioneGranger);
        harryPotter.printStudent();
        dracoMalfoy.printStudent();
        harryPotter.equals(dracoMalfoy);

    }
}