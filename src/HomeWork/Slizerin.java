package HomeWork;

public class Slizerin extends Hogwarts {
    public int s;
    private int trick;
    private int resolute;
    private int ambitious;
    private int resourceful;
    private int lustForPower;

    public Slizerin(String name, int conjure, int transgress, int trick, int resolute, int ambitious, int resourceful, int lustForPower) {
        super(name, conjure, transgress);
        this.trick = trick;
        this.resolute = resolute;
        this.ambitious = ambitious;
        this.resourceful = resourceful;
        this.lustForPower = lustForPower;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getResolute() {
        return resolute;
    }

    public void setResolute(int resolute) {
        this.resolute = resolute;
    }

    public int getAmbitious() {
        return ambitious;
    }

    public void setAmbitious(int ambitious) {
        this.ambitious = ambitious;
    }

    public int getResourceful() {
        return resourceful;
    }

    public void setResourceful(int resourceful) {
        this.resourceful = resourceful;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

   @Override
   public String toString() {
       return "Студент факультета Пуффендуй " + getName() +
               ": навык колдовать = " + getConjure() +
               ", навык трансгрессии = " + getTransgress() +
               ", хитрость = " + trick +
               ", решительность = " + resolute +
               ", амбициозность = " + ambitious +
               ", находчивость = "  + resourceful +
               ", жажда власти = " + lustForPower;
   }

    public void printCompareFacult(Slizerin hogwarts2) {
        if ((trick + resolute + ambitious + resourceful + lustForPower) > (hogwarts2.trick + hogwarts2.resolute + hogwarts2.ambitious
                + hogwarts2.resourceful + hogwarts2.lustForPower)) {
            System.out.println(getName() + " лучший Слизеринец, чем " +
                    hogwarts2.getName());
        } else {
            System.out.println(hogwarts2.getName() + " лучший Слизеринец, чем  " +
                    getName());
        }
    }
}
