import HomeWork.*;

public class Main {
    public static void main(String[] args) {


        Griffindor hogwarts1 = new Griffindor("Гарри Поттер", 56, 72, 88, 65, 76);
        Griffindor hogwarts2 = new Griffindor("Гермиона Грейнджер", 44, 35, 34, 28, 43);
        Griffindor hogwarts3 = new Griffindor("Рон Уилзи", 47, 35, 43, 28, 43);
        Puffendy hogwarts4 = new Puffendy("Захария Смит",22,33,54,48,32);
        Puffendy hogwarts5 = new Puffendy("Седрик Диггори", 27, 31, 59, 47, 52);
        Puffendy hogwarts6 = new Puffendy("Джастин Финч-Флетчли", 29, 40, 64, 35, 28);
        Kogtervan hogwarts7 = new Kogtervan("Чжоу Чанг", 54, 12, 47, 65, 54, 55);
        Kogtervan hogwarts8 = new Kogtervan("Падма Патил", 43, 28, 24, 55, 54, 66);
        Kogtervan hogwarts9 = new Kogtervan("Маркус Белби", 65, 21, 76, 39, 53, 43);
        Slizerin hogwarts10 = new Slizerin("Драко Малфой", 32, 37, 44, 36, 26, 53, 22);
        Slizerin hogwarts11 = new Slizerin("Грэхэм Монтегю", 27, 34, 45, 34, 44, 25, 41);
        Slizerin hogwarts12 = new Slizerin("Грегори Гойл", 22, 33, 33, 21, 25, 42, 66);


        hogwarts1.printCompare(hogwarts2);
        hogwarts5.printCompare(hogwarts7);
        System.out.println(hogwarts3.toString());
        System.out.println(hogwarts4.toString());
        System.out.println(hogwarts9.toString());
        System.out.println(hogwarts11.toString());
        hogwarts1.printCompareFacult(hogwarts2);
        hogwarts5.printCompareFacult(hogwarts6);
        hogwarts7.printCompareFacult(hogwarts8);
        hogwarts11.printCompareFacult(hogwarts12);
    }
}