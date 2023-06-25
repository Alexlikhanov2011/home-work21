import java.util.Objects;

public class Hufflepuff extends Hogwards {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String faculty, int powerMagic, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, faculty, powerMagic, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public void compare (Hufflepuff other) {
        var sum = industriousness + loyalty + honesty;
        var othersum = other.industriousness + other.honesty + other.loyalty;
        if (sum>othersum) {
            System.out.println(getName()+ " лучший Пуффендуец, чем " + other.getName());
        }else {
            System.out.println(other.getName()+ " лучший Пуффендуец, чем " + getName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hufflepuff that = (Hufflepuff) o;
        return industriousness == that.industriousness && loyalty == that.loyalty && honesty == that.honesty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), industriousness, loyalty, honesty);
    }

    @Override
    public String toString() {
        return super.toString() +
                "трудолюбие: " + industriousness +
                ", верность: " + loyalty +
                ", честь: " + honesty;
    }
}