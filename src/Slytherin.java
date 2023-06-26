import java.util.Objects;

public class Slytherin extends Hogwards {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int imperiousness;

    public Slytherin(String name,
                     String faculty,
                     int powerMagic,
                     int transgression,
                     int cunning,
                     int determination,
                     int ambition,
                     int resourcefulness,
                     int imperiousness) {
        super(name, faculty, powerMagic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.imperiousness = imperiousness;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getImperiousness() {
        return imperiousness;
    }

    public void setImperiousness(int imperiousness) {
        this.imperiousness = imperiousness;
    }

    public void compare(Slytherin other) {
        var sum = cunning + determination + ambition + resourcefulness + imperiousness;
        var othersum = other.cunning +
                other.determination +
                other.ambition +
                other.resourcefulness +
                other.imperiousness;
        if (sum > othersum) {
            System.out.println(getName() + " лучший Слизеренец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Слизеренец, чем " + getName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Slytherin slytherin = (Slytherin) o;
        return cunning == slytherin.cunning && determination ==
                slytherin.determination && ambition ==
                slytherin.ambition && resourcefulness ==
                slytherin.resourcefulness && imperiousness ==
                slytherin.imperiousness;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),
                cunning,
                determination,
                ambition,
                resourcefulness,
                imperiousness);
    }

    @Override
    public String toString() {
        return super.toString() +
                "хитрость: " + cunning +
                ", решительность: " + determination +
                ", амбициозность: " + ambition +
                ", находчивость: " + resourcefulness +
                ", жажда власти: " + imperiousness;
    }
}
