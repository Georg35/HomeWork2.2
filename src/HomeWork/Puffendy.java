package HomeWork;

public class Puffendy extends Hogwarts {
    private int industriousness;
    private int loyality;
    private int honesty;

    public Puffendy(String name, int conjure, int transgress, int industriousness, int loyality, int honesty) {
        super(name, conjure, transgress);
        this.industriousness = industriousness;
        this.loyality = loyality;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyality() {
        return loyality;
    }

    public void setLoyality(int loyality) {
        this.loyality = loyality;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public void print(Puffendy[] puffendies) {
        System.out.println("Студенты факультета Пуффендуй");
        for (int i = 0; i < puffendies.length; i++) {
            Puffendy puffendy = puffendies[i];
            System.out.println(puffendy.getName() + ", сила магии " + puffendy.getConjure() + ", расстояние трансгрессии " + puffendy.getTransgress() + ". Свойства характера: трудолюбие " + puffendy.getIndustriousness() + ", верность " + puffendy.getLoyality() + ", честность " + puffendy.getHonesty());

        }
    }

    public void printCompareFakult(Puffendy[] puffendies, String name1, String name2) {
        int power1 = 0, power2 = 0;
        int k1 = 0, k2 = 0;

        for (int i = 0; i < puffendies.length; i++) {
            if (puffendies[i].getName().equals(name1)) {
                power1 = puffendies[i].getIndustriousness() + puffendies[i].getLoyality() + puffendies[i].getHonesty();
                k1 = i;
            }
            if (puffendies[i].getName().equals(name2)) {
                power2 = puffendies[i].getIndustriousness() + puffendies[i].getLoyality() + puffendies[i].getHonesty();
                k2 = i;
            }
        }
        if (power1 > power2) {
            System.out.println(puffendies[k1].getName() + " лучший Пуффендуец, чем " + puffendies[k2].getName());
        } else if (power2 > power1) {
            System.out.println(puffendies[k2].getName() + " лучший Пуффендуец, чем " + puffendies[k1].getName());
        } else
            System.out.println("Силы равны");

        }
    }

