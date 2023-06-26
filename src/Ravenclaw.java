import java.util.Objects;

public class Ravenclaw extends Hogwards {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name,
                     String faculty,
                     int powerMagic,
                     int transgression,
                     int intelligence,
                     int wisdom,
                     int wit,
                     int creativity) {
        super(name, faculty, powerMagic, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public void compare(Ravenclaw other) {
        var sum = intelligence + wisdom + wit + creativity;
        var othersum = other.intelligence + other.wisdom + other.wit + other.creativity;
        if (sum > othersum) {
            System.out.println(getName() + " лучший Когтевранец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Когтевранец, чем " + getName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ravenclaw ravenclaw = (Ravenclaw) o;
        return intelligence == ravenclaw.intelligence && wisdom ==
                ravenclaw.wisdom && wit ==
                ravenclaw.wit && creativity ==
                ravenclaw.creativity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),
                intelligence,
                wisdom,
                wit,
                creativity);
    }

    @Override
    public String toString() {
        return super.toString() +
                "ум: " + intelligence +
                ", мудрость: " + wisdom +
                ", честь: " + wit +
                ", творчество: " + creativity;
    }
}
