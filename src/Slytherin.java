public class Slytherin extends Hogwarts {
    private Integer cunning;
    private Integer determination;
    private Integer ambition;
    private Integer resourcefulness;
    private Integer lustForPower;

    public Slytherin(Integer magic, Integer teleportation, Integer cunning, Integer determination, Integer ambition, Integer resourcefulness, Integer lustForPower) {
        super(magic, teleportation);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public Integer getCunning() {
        return cunning;
    }

    public void setCunning(Integer cunning) {
        this.cunning = cunning;
    }

    public Integer getDetermination() {
        return determination;
    }

    public void setDetermination(Integer determination) {
        this.determination = determination;
    }

    public Integer getAmbition() {
        return ambition;
    }

    public void setAmbition(Integer ambition) {
        this.ambition = ambition;
    }

    public Integer getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(Integer resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public Integer getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(Integer lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return super.toString() +
                "хитрость= " + cunning + '\n' +
                "решительность= " + determination + '\n' +
                "амбициозность=" + ambition + '\n' +
                "находчивость=" + resourcefulness + '\n' +
                "жажда власти=" + lustForPower + '\n';
    }

    public void equals(Slytherin student) {
        int powerS1 = cunning +
                determination +
                ambition +
                resourcefulness +
                lustForPower;
        int powerS2 = student.cunning +
                student.determination +
                student.ambition +
                student.resourcefulness +
                student.lustForPower;
        if (powerS1 > powerS2) {
            System.out.println("Первый студент обладает большей мощностью чем второй");
        } else {
            System.out.println("Второй студент обладает большей мощностью чем первый студент");
        }
    }
}
