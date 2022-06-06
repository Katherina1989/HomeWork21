package HomeWork21;

public class RunClass {

    public static void main(String[] args) {

        Sportsman[] sportsman = new Sportsman[4];
        sportsman[0] = new Sportsman("Петр", 100);
        sportsman[1] = new Sportsman("Марина", 200);
        sportsman[2] = new Sportsman("Мария", 300);
        sportsman[3] = new Sportsman("Александр", 400);

        Course course = new Course(150, 250, 300); // Создаем полосу препятствий
        Team team = new Team("Команда1", sportsman); // Создаем команду
        course.doIt(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты


    }
}
