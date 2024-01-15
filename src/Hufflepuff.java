public class Hufflepuff extends Hogwarts {
    private Integer hardWork;
    private Integer loyalty;
    private Integer honesty;

    public Hufflepuff(Integer magic, Integer teleportation, Integer hardWork, Integer loyalty, Integer honesty) {
        super(magic, teleportation);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public Integer getHardWork() {
        return hardWork;
    }

    public void setHardWork(Integer hardWork) {
        this.hardWork = hardWork;
    }

    public Integer getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(Integer loyalty) {
        this.loyalty = loyalty;
    }

    public Integer getHonesty() {
        return honesty;
    }

    public void setHonesty(Integer honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                "трудолюбие= " + hardWork + '\n' +
                "верность= " + loyalty + '\n' +
                "честность=" + honesty + '\n';
    }

    public void equals(Hufflepuff student) {
        int powerS1 = hardWork + honesty + loyalty;
        int powerS2 = student.hardWork + student.honesty + student.loyalty;
        if (powerS1 > powerS2) {
            System.out.println("Первый студент обладает большей мощностью чем второй");
        } else {
            System.out.println("Второй студент обладает большей мощностью чем первый студент");
        }
    }
}
