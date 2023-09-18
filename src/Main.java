import HomeWork.*;

public class Main {
    public static void main(String[] args) {


        Hogwarts[] hogwarts = {
                new Hogwarts("Гарри Поттер", 58, 80),
                new Hogwarts("Гермиона Грейнджер", 45, 40),
                new Hogwarts("Рон Уизли", 35, 44),
                new Hogwarts("Драко Малфой", 40, 40),
                new Hogwarts("Грэхэм Моньегю", 25, 35),
                new Hogwarts("Грегори Гойл", 20, 35),
                new Hogwarts("Захария Смит", 25, 35),
                new Hogwarts("Седрик Диггори", 30, 31),
                new Hogwarts("Джастин Финч-Флетчли", 24, 35),
                new Hogwarts("Чжоу Чанг", 45, 20),
                new Hogwarts("Падма Патил", 47, 29),
                new Hogwarts("Маркус Белби", 50, 34)
        };
        Griffindor[] griffindor = {
                new Griffindor("Гарри Поттер", 58, 80, 88, 65, 76),
                new Griffindor("Гермиона Грейнджер", 45, 40, 34, 28, 50),
                new Griffindor("Рон Уизли", 35, 44, 45, 29, 50)
        };

        Slizerin[] slizerins = {
                new Slizerin("Драко Малфой", 40, 40, 44, 36, 47, 56, 54),
                new Slizerin("Грэхэм Моньегю", 25, 35, 25, 45, 35, 51, 42),
                new Slizerin("Грегори Гойл", 20, 35, 24, 36, 37, 42, 36)
        };

        Puffendy[] puffendies = {
                new Puffendy("Захария Смит", 25, 35, 55, 45, 39),
                new Puffendy("Седрик Диггори", 30, 31, 51, 43, 36),
                new Puffendy("Джастин Финч-Флетчли", 24, 35, 25, 42, 41),
        };

        Kogtervan[] kogtervans = {
                new Kogtervan("Чжоу Чанг", 45, 20, 35, 45, 69, 43),
                new Kogtervan("Падма Патил", 47, 29, 44, 54, 36, 52),
                new Kogtervan("Маркус Белби", 50, 34, 44, 25, 65, 14)
        };

        hogwarts[0].print(hogwarts);
        griffindor[0].print(griffindor);
        puffendies[0].print(puffendies);
        kogtervans[0].print(kogtervans);
        slizerins[0].print(slizerins);
        griffindor[0].printCompareFacult(griffindor, "Гермиона Грейнджер", "Гарри Поттер");
        puffendies[0].printCompareFakult(puffendies, "Седрик Диггори", "Джастин Финч-Флетчли");
        kogtervans[0].printCompareFacult(kogtervans, "Чжоу Чанг","Маркус Белби");
        slizerins[0].printCompareFacult(slizerins, "Грегори Гойл","Драко Малфой");
        hogwarts[0].printCompare(hogwarts, "Рон Уизли","Падма Патил");
    }
}