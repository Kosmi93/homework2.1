public class Hogwarts {
    private Integer magic;
    private Integer teleportation;

    public void printStudent() {
        System.out.println(toString());
    }

    public Hogwarts(Integer magic, Integer teleportation) {
        this.magic = magic;
        this.teleportation = teleportation;
    }

    public Integer getMagic() {
        return magic;
    }

    public void setMagic(Integer magic) {
        this.magic = magic;
    }

    public Integer getTeleportation() {
        return teleportation;
    }

    public void setTeleportation(Integer teleportation) {
        this.teleportation = teleportation;
    }

    @Override
    public String toString() {
        return "Студент факультета "
                + this.getClass().getName()
                + " обладает следующими характеристиками \n"
                + "Колдовство= " + magic + '\n' +
                "трансгрессирование= " + teleportation + '\n';
    }


    public void equals(Hogwarts student) {
        int powerS1 = magic + teleportation;
        int powerS2 = student.magic + student.teleportation;
        if (powerS1 > powerS2) {
            System.out.println("Первый студент обладает большей мощностью чем второй");
        } else {
            System.out.println("Второй студент обладает большей мощностью чем первый студент");
        }
    }
}
