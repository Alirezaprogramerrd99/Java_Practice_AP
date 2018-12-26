package MidTermExersize;

import java.util.Scanner;

class Bank{
    protected int rate;
    static int NUMBER_OF_BANKS;

    Bank(int rate){
        this.rate = rate;
        NUMBER_OF_BANKS++;

    }

    public int getIntrestRate(){
        return rate * 1;
    }

    public String toString(){
        return "\nrate is: " + rate;
    }

}

class Pasargad extends Bank{

    Pasargad(int rate){
        super(rate);
    }

    public int getIntrestRate(){
        return rate * 7;

    }

    public void ParsargadMethod(){
        System.out.println("Its pasargad bank!");
    }

    @Override
    public String toString(){
        return "This is Pasargard bank and " + super.toString();
    }
}

class Meili extends Bank{

    Meili(int rate){
        super(rate);
    }

    public int getIntrestRate(){
        return rate * 10;
    }

    public void MeiliMethod(){
        System.out.println("Its Meili bank!");
    }

    @Override
    public String toString(){
        return "This is Meili bank and " + super.toString();
    }
}

class Parsian extends Bank {

    Parsian(int rate) {
        super(rate);
    }

    @Override
    public int getIntrestRate(){
        return rate * 4;
    }

    public void paresianMethod() {
        System.out.println("Its Parsian bank!");
    }

    @Override
    public String toString() {
        return "This is Parsian bank and " + super.toString();

    }
}

    class LittleParsian extends Parsian {

        long id;

        LittleParsian(int rate, long id) {

            super(rate);
            this.id = id;
        }

        public void paresianMethod() {
            System.out.println("Its Little Parsian bank!");
        }
    }

public class TestBanks {

    public static void printBanks(Bank[] banks){
        for (int i = 0; i < banks.length; i++){

            if (banks[i] instanceof Pasargad) {
                Pasargad p = (Pasargad) banks[i];
                p.ParsargadMethod();
                System.out.println(p.getIntrestRate());
                System.out.println(p.toString());
            }
            else if (banks[i] instanceof Meili){
                Meili m = (Meili) banks[i];
                m.MeiliMethod();
                System.out.println(m.getIntrestRate());
                System.out.println(m.toString());
            }
            else if (banks[i] instanceof Parsian){
                Parsian p = (Parsian) banks[i];
                p.paresianMethod();
                System.out.println(p.getIntrestRate());
                System.out.println(p.toString());
            }
            else if (banks[i] instanceof LittleParsian){
                LittleParsian p = (LittleParsian)banks[i];
                p.paresianMethod();
                System.out.println(p.getIntrestRate());
                System.out.println(p.toString());
            }
            else
                continue;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of banks you want to build.");
        int numberOfBanks = scan.nextInt();

        Bank[] banks = new Bank[numberOfBanks];
        int i = 0;
        int choice, rate = 0;
        while (i < numberOfBanks){

            System.out.println("Witch bank do you want to build ?");
            System.out.println("1-Parsian\n" + "2-Meili\n" + "3-Pasargad\n" + "4-Little Parsian");
            choice = scan.nextInt();

            switch(choice) {

                case 1:
                    System.out.println("Enter rate:");
                    rate = scan.nextInt();
                    banks[Bank.NUMBER_OF_BANKS] = new Parsian(rate);
                    break;

                case 2:
                    System.out.println("Enter rate:");
                    rate = scan.nextInt();
                    banks[Bank.NUMBER_OF_BANKS] = new Meili(rate);
                    break;

                    case 3:
                        System.out.println("Enter rate:");
                        rate = scan.nextInt();
                        banks[Bank.NUMBER_OF_BANKS] = new Pasargad(rate);
                        break;


                case 4:
                    System.out.println("Enter rate and id:");
                    rate = scan.nextInt();
                    int id = scan.nextInt();
                    banks[Bank.NUMBER_OF_BANKS] = new LittleParsian(rate, id);
                    break;


            }

            i++;
        }

        printBanks(banks);
    }
}
