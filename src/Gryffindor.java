import java.util.Objects;

public class Gryffindor extends Hogwards {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name,
                      String faculty,
                      int powerMagic,
                      int transgression,
                      int nobility,
                      int honor,
                      int courage) {
        super(name, faculty, powerMagic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public void compare(Gryffindor other) {
        var sum = nobility + honor + courage;
        var othersum = other.nobility + other.honor + other.courage;
        if (sum > othersum) {
            System.out.println(getName() + " лучший Грифиндорец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Грифиндорец, чем " + getName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Gryffindor that = (Gryffindor) o;
        return nobility == that.nobility && honor == that.honor && courage == that.courage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nobility, honor, courage);
    }

    @Override
    public String toString() {
        return super.toString() +
                "благородство: " + nobility +
                ", честь: " + honor +
                ", храбрость: " + courage;
    }
}
