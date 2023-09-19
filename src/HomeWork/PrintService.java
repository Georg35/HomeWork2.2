package HomeWork;
public class PrintService {



    public void print(Hogwarts[] hogwarts) {
            System.out.println("Студенты Хогвартса:");
            for (int i = 0; i < hogwarts.length; i++) {
                Hogwarts hogwart = hogwarts[i];
                System.out.println(hogwart.getName() + ", сила магии " + hogwart.getConjure() + ", расстояние трансгрессии " + hogwart.getTransgress());
            }
        }

        public void print(Griffindor[] griffindors) {
            System.out.println("Студенты факультета Гриффиндор");
            for (int i = 0; i < griffindors.length; i++) {
                Griffindor griffindor = griffindors[i];
                System.out.println(griffindor.getName() + ", сила магии " + griffindor.getConjure() + ", расстояние трансгрессии " + griffindor.getTransgress() + ". Свойства характера: благородство " + griffindor.getNobility() + ", честь " + griffindor.getHonor() + ", храбрость " + griffindor.getBravery());
            }
        }

        public void print(Puffendy[] puffendies) {
            System.out.println("Студенты факультета Пуффендуй");
            for (int i = 0; i < puffendies.length; i++) {
                Puffendy puffendy = puffendies[i];
                System.out.println(puffendy.getName() + ", сила магии " + puffendy.getConjure() + ", расстояние трансгрессии " + puffendy.getTransgress() + ". Свойства характера: трудолюбие " + puffendy.getIndustriousness() + ", верность " + puffendy.getLoyality() + ", честность " + puffendy.getHonesty());
            }
        }

        public void print(Kogtervan[] kogtervans) {
            System.out.println("Студенты факультета Когтерван");
            for (int i = 0; i < kogtervans.length; i++) {
                Kogtervan kogtervan = kogtervans[i];
                System.out.println(kogtervan.getName() + ", сила магии " + kogtervan.getConjure() + ", расстояние трансгрессии " + kogtervan.getTransgress() + ". Свойства характера: ум " + kogtervan.getSmartness() + ", мудрость " + kogtervan.getWisdom() + ", остроумие " + kogtervan.getWit() + ", творчество " + kogtervan.getCreative());
            }
        }

        public void print(Slizerin[] slizerins) {
            System.out.println("Студенты факультета Слизерин");
            for (int i = 0; i < slizerins.length; i++) {
                Slizerin slizerin = slizerins[i];
                System.out.println(slizerin.getName() + ", сила магии " + slizerin.getConjure() + ", расстояние трансгрессии " + slizerin.getTransgress() + ". Свойства характера: хитрость " + slizerin.getTrick() + ", решительность " + slizerin.getResolute() + ", амбициозность " + slizerin.getAmbitious() + ", находчивость " + slizerin.getResourceful() + ", жажда власти " + slizerin.getLustForPower() );
            }
        }

        public void printCompareFacult( Griffindor[] griffindors,String name1,String name2){
            int power1=0,power2=0;
            int k1=0,k2=0;

            for (int i = 0; i < griffindors.length; i++) {
                Griffindor griffindor = griffindors[i];
                if (griffindors[i].getName().equals(name1)) {
                    power1 = griffindors[i].getNobility() + griffindors[i].getHonor() + griffindors[i].getBravery();
                    k1 = i;
                }
                if (griffindors[i].getName().equals(name2)) {
                    power2 = griffindors[i].getNobility() + griffindors[i].getHonor() + griffindors[i].getBravery();
                    k2 = i;
                }
            }
            if (power1>power2) {
                System.out.println(griffindors[k1].getName() + " лучший Гриффиндорец, чем " +
                        griffindors[k2].getName());
            } else if (power2>power1) {
                System.out.println(griffindors[k2].getName() + " лучший Гриффиндорец, чем " +
                        griffindors[k1].getName());
            }
            else System.out.println("Силы равны");


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


        public void printCompareFacult(Kogtervan[] kogtervans, String name1, String name2) {
            int power1 = 0, power2 = 0;
            int k1 = 0, k2 = 0;

            for (int i = 0; i < kogtervans.length; i++) {
                if (kogtervans[i].getName().equals(name1)) {
                    power1 = kogtervans[i].getSmartness() + kogtervans[i].getCreative() + kogtervans[i].getWit() + kogtervans[i].getWisdom();
                    k2 = i;
                }
            }
            if (power1 > power2) {
                System.out.println(kogtervans[k1].getName() + " лучший Когтерванец, чем " + kogtervans[k2].getName());
            } else if (power2 > power1) {
                System.out.println(kogtervans[k2].getName() + " лучший Когтерванец, чем " + kogtervans[k1].getName());
            } else
                System.out.println("Силы равны");
        }


        public void printCompareFacult(Slizerin[] slizerins, String name1, String name2) {
            int power1 = 0, power2 = 0;
            int k1 = 0, k2 = 0;
            for (int i = 0; i < slizerins.length; i++) {
                if (slizerins[i].getName().equals(name1)) {
                    power1 = slizerins[i].getLustForPower() + slizerins[i].getResourceful() + slizerins[i].getTrick() + slizerins[i].getResolute() + slizerins[i].getAmbitious();
                    k1 = i;
                }
                if (slizerins[i].getName().equals(name2)) {
                    power2 = slizerins[i].getLustForPower() + slizerins[i].getResourceful() + slizerins[i].getTrick() + slizerins[i].getResolute() + slizerins[i].getAmbitious();
                    k2 = i;
                }
            }
            if (power1 > power2) {
                System.out.println(slizerins[k1].getName() + " лучший Слизеринец, чем " + slizerins[k2].getName());
            } else if (power2 > power1) {
                System.out.println(slizerins[k2].getName() +  " лучший Слизеринец, чем " + slizerins[k1].getName());
            } else
                System.out.println("Силы равны");
        }


        public void printCompare(Hogwarts[] hogwarts, String name1, String name2) {
            int power1 = 0, power2 = 0;
            int k1 = 0, k2 = 0;

            for (int i = 0; i < hogwarts.length; i++) {
                if (hogwarts[i].getName().equals(name1)) {
                    power1 = hogwarts[i].getConjure() + hogwarts[i].getTransgress();
                    k1 = i;
                }
                if (hogwarts[i].getName().equals(name2)) {
                    power2 = hogwarts[i].getConjure() + hogwarts[i].getTransgress();
                    k2 = i;
                }
            }
            if (power1 > power2) {
                System.out.println(hogwarts[k1].getName() + " обладает большей мощностью магии, чем " + hogwarts[k2].getName());
            } else if (power2 > power1) {
                System.out.println(hogwarts[k2].getName() + " обладает большей мощностью магии, чем " + hogwarts[k1].getName());
            } else
                System.out.println("Силы равны");
        }
    }


