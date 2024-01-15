public class Ravenclaw extends Hogwarts {
    private Integer mind;
    private Integer wisdom;
    private Integer wit;
    private Integer creation;

    public Ravenclaw(Integer magic, Integer teleportation, Integer mind, Integer wisdom, Integer wit, Integer creation) {
        super(magic, teleportation);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public Integer getMind() {
        return mind;
    }

    public void setMind(Integer mind) {
        this.mind = mind;
    }

    public Integer getWisdom() {
        return wisdom;
    }

    public void setWisdom(Integer wisdom) {
        this.wisdom = wisdom;
    }

    public Integer getWit() {
        return wit;
    }

    public void setWit(Integer wit) {
        this.wit = wit;
    }

    public Integer getCreation() {
        return creation;
    }

    public void setCreation(Integer creation) {
        this.creation = creation;
    }

    @Override
    public String toString() {
        return super.toString() +
                "ум= " + mind + '\n' +
                "мудрость= " + wisdom + '\n' +
                "остроумие= " + wit + '\n' +
                "творчество= " + creation + '\n';
    }

    public void equals(Ravenclaw student) {
        int powerS1 = mind + wisdom + wit + creation;
        int powerS2 = student.mind + student.wisdom + student.wit + student.creation;
        if (powerS1 > powerS2) {
            System.out.println("Первый студент обладает большей мощностью чем второй");
        } else {
            System.out.println("Второй студент обладает большей мощностью чем первый студент");
        }
    }
}
