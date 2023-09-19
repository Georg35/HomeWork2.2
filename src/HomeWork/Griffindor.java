package HomeWork;

public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;


    public Griffindor (String name, int conjure, int transgress, int nobility, int honor, int bravery) {
        super(name, conjure, transgress);

        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Студент факультета Гриффиндор " + getName() +
                ": навык колдовства = " + getConjure() +
                ", навык трансгрессии = " + getTransgress() +
                ", благородство = " + nobility +
                ", честь = " + honor +
                ", храбрость = " + bravery;
    }

    public void printCompareFacult(Griffindor hogwarts2) {
        if ((nobility + honor + bravery) > (hogwarts2.nobility + hogwarts2.honor + hogwarts2.bravery)) {
            System.out.println(getName() + " лучший Гриффиндорец, чем " + hogwarts2.getName());
        } else {
            System.out.println(hogwarts2.getName() + " лучший Гриффиндорец, чем " + getName());

        }
    }
    }

