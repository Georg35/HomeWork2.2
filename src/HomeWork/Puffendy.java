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

    @Override
    public String toString() {
        return "Студенты факультета Пуффендуй " + getName() +
                ": навык колдовства = " + getConjure() +
                ", навык трансгрессии = " + getTransgress() +
                ", трудолюбие = " + industriousness +
                ", верность = " + loyality +
                ", честность = " + honesty;
    }

    public void printCompareFacult(Puffendy hogwarts2){
        if((industriousness + loyality +honesty) > (hogwarts2.industriousness + hogwarts2.loyality + hogwarts2.honesty)) {
            System.out.println(getName() + " лучший Пуффендуец, чем " + hogwarts2.getName());
        } else {
            System.out.println(hogwarts2.getName() + " лучший Пуффендуец, чем  " +
                getName());
        }
    }
    }

