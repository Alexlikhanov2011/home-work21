import java.util.Objects;

public class Hogwards {
    private String name;
    private String faculty;
    private int powerMagic;
    private int transgression;
    public Hogwards(String name, String faculty, int powerMagic, int transgression) {
        this.name = name;
        this.faculty = faculty;
        this.powerMagic = powerMagic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
    public void compare (Hogwards other) {
if (this.getPowerMagic()>other.powerMagic) {
    System.out.println(this.name + " обладает большей силой магией, чем " + other.name);
}else {
    System.out.println(other.name + " обладает большей силой магией, чем " + this.name);
}
if (this.getTransgression()>other.transgression) {
    System.out.println(this.name + " обладает большей дистанцией магии, чем " + other.name);
}else {
    System.out.println(other.name + " обладает большей дистанцией магии, чем " + this.name);
}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwards hogwards = (Hogwards) o;
        return powerMagic == hogwards.powerMagic && transgression == hogwards.transgression && Objects.equals(name, hogwards.name) && Objects.equals(faculty, hogwards.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, faculty, powerMagic, transgression);
    }

    @Override
    public String toString() {
        return  "Имя: " + name  +
                ", факультет: " + faculty +
                ", сила магии: " + powerMagic +
                ", расстояние трансгрессии: " + transgression + ", ";
    }
}
