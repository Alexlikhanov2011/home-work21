import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Gryffindor harry = new Gryffindor("Гарри Поттер",
                "Гриффиндор",
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101));
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер",
                "Гриффиндор",
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101));
        Gryffindor ron = new Gryffindor("Рон Уизли",
                "Гриффиндор",
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101));

        Hufflepuff zachariah = new Hufflepuff("Захария Смит",
                "Пуффендуй",
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101));
        Hufflepuff cedric = new Hufflepuff("Седрик Диггори",
                "Пуффендуй",
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101));
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли",
                "Пуффендуй",
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101));
        Ravenclaw zhou = new Ravenclaw("Чжоу Чанг",
                "Когтевран",
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101));
        Ravenclaw padma = new Ravenclaw("Падма Патил",
                "Когтевран",
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101));
        Ravenclaw marcus = new Ravenclaw("Маркус Белби",
                "Когтевран",
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101));

        Slytherin draco = new Slytherin("Драко Малфой",
                "Слизерин",
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101));
        Slytherin graham = new Slytherin("Грэхэм Монтегю",
                "Слизерин",
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101));
        Slytherin gregory = new Slytherin("Грегори Гойл",
                "Слизерин",
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101),
                random.nextInt(101));
        System.out.println(harry);
        harry.compare(hermione);
        zachariah.compare(cedric);
        zhou.compare(padma);
        draco.compare(graham);
        harry.compare(marcus);

    }

}
