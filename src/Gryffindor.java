public class Gryffindor extends Hogwarts {
    private Integer nobility;
    private Integer honor;
    private Integer bravery;

    public Gryffindor(Integer magic, Integer teleportation, Integer nobility, Integer honor, Integer bravery) {
        super(magic, teleportation);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public Integer getNobility() {
        return nobility;
    }

    public void setNobility(Integer nobility) {
        this.nobility = nobility;
    }

    public Integer getHonor() {
        return honor;
    }

    public void setHonor(Integer honor) {
        this.honor = honor;
    }

    public Integer getBravery() {
        return bravery;
    }

    public void setBravery(Integer bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() + "благородство= " + nobility + '\n' +
                "честь= " + honor + '\n' +
                "храбрость= " + bravery + '\n';
    }

    public void equals(Gryffindor student) {
        int powerS1 = nobility + honor + bravery;
        int powerS2 = student.nobility + student.honor + student.bravery;
        if (powerS1 > powerS2) {
            System.out.println("Первый студент обладает большей мощностью чем второй");
        } else {
            System.out.println("Второй студент обладает большей мощностью чем первый студент");
        }
    }
}
