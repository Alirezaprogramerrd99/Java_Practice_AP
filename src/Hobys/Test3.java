package Hobys;

import java.util.Date;
import java.util.Scanner;

//Commodity -->> Stuff.
class Commodity {     // this is stuff class.

    static int NUMBER_OF_Commodity;
    protected String name;
    protected String description;
    protected double height;
    protected double width;
    protected double weight;
    protected Date creationDate;

    Commodity(String name, String description) {
        this.name = name;
        this.description = description;
    }

    Commodity(String name, String description, double height, double width, double weight) {

        this(name, description);
        this.height = height;
        this.width = width;
        this.weight = weight;
        creationDate = new Date();
        NUMBER_OF_Commodity++;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}

class Sensitive extends Commodity {    // sensitive stuffs.

    private int stockOfSensitive;
    private String keepingDescription;

    Sensitive(String name, String description, String keepingDescription, double height, double width, double weight) {

        super(name, description, height, width, weight);
        this.keepingDescription = keepingDescription;
    }

    public void showKeepingDescription() {
        System.out.println(keepingDescription);
    }

    public void setStockOfSensitive(int value) {
        stockOfSensitive = value;

    }

    public int getStockOfSensitive() {
        return stockOfSensitive;
    }

    /*
    public static void increase() {
        NUMBER_OF_SENSITIVE++;
    }

    public static void Decrease() {
        NUMBER_OF_SENSITIVE--;
    }
*/
    // get extentionDate method.
    static boolean isSensitive(Commodity stuff) {

        if (stuff instanceof Sensitive)
            return true;
        else return false;
    }
}

class Edible extends Commodity {    // food stuff class.

    private int stockOfEdible;
    private String expirationDate;

    Edible(String name, String description, String expirationDate, double height, double width, double weight) {
        super(name, description, height, width, weight);
        this.expirationDate = expirationDate;
    }

    public void setStockOfEdible(int value) { /////------------------------------------
        stockOfEdible = value;
    }

    public int getStockOfEdible() {
        return stockOfEdible;
    }

    static boolean isEdible(Commodity stuff) {

        if (stuff instanceof Edible)
            return true;
        else return false;
    }
}

class Electronic extends Commodity {   // Electronic stuff class.

    private int stockOfElectronic;
    private int WarrantyPeriod;
    private String brand;

    Electronic(String name, String brand, String description, double height, double width, double weight, int warrantyPeriod) {

        super(name, description, height, width, weight);
        this.WarrantyPeriod = warrantyPeriod;
        this.brand = brand;
    }

    public int getStockOfElectronic() {
        return stockOfElectronic;
    }

    public int getWarrantyPeriod() {
        return WarrantyPeriod;
    }

    public void setStockOfElectronic(int value) { /////------------------------------------
        stockOfElectronic = value;
    }

    public String getBrand() {
        return brand;
    }

    static boolean isElectronic(Commodity stuff) {

        if (stuff instanceof Electronic)
            return true;
        else return false;
    }
}

class Other extends Commodity {   // other stuff class.

    private int stockOfOther;

    Other(String name, String description, double height, double width, double weight) {

        super(name, description, height, width, weight);
    }

    public int getStockOfOther() {
        return stockOfOther;
    }

    public void setStockOfOther(int value) {
        stockOfOther = value;
    }

    public static boolean isOther(Commodity stuff) {
        if (stuff instanceof Other)
            return true;
        else return false;
    }
}

public class Test3 {

    static Scanner scanner = new Scanner(System.in);

    public static void setCommodites(Commodity[] stuff, String name, String dis, double w, double h, double wei) {

        switch (dis) {

            case "Electronic":
            case "electronic":

                System.out.println("Enter Warranty period:");
                int grantiy = scanner.nextInt();
                System.out.println("Enter development Brand:");
                String brand = scanner.next();

                stuff[Commodity.NUMBER_OF_Commodity] = new Electronic(name, brand, dis, h, w, wei, grantiy);

                System.out.println("new " + stuff[Commodity.NUMBER_OF_Commodity - 1].getName() + " has been created" + " with stock of: " + ((Electronic) stuff[Commodity.NUMBER_OF_Commodity - 1]).getStockOfElectronic());
                System.out.println("Company is: " + ((Electronic) stuff[Commodity.NUMBER_OF_Commodity - 1]).getBrand() + '\n');

                break;

            case "Eating":
            case "Edible":
            case "eating":
            case "edible":

                // extinction time must be added.
                System.out.println("Enter extensionTime:");
                String expirationDate = scanner.next();
                stuff[Commodity.NUMBER_OF_Commodity] = new Edible(name, dis, expirationDate, h, w, wei);
                System.out.println("new " + stuff[Commodity.NUMBER_OF_Commodity - 1].getName() + " has been created " + "with stock of: " + ((Edible) stuff[Commodity.NUMBER_OF_Commodity - 1]).getStockOfEdible() + '\n');

                break;

            case "Sensitive":
            case "sensitive":

                System.out.println("Enter the stuff keepingDescriptions: ");
                String keeping = scanner.next();
                stuff[Commodity.NUMBER_OF_Commodity] = new Sensitive(name, dis, keeping, h, w, wei);  //??? keeping aya metone toye constracotr bashe??
                System.out.println("new " + stuff[Commodity.NUMBER_OF_Commodity - 1].getName() + " has been created " + "with stock of: " + ((Sensitive) stuff[Commodity.NUMBER_OF_Commodity - 1]).getStockOfSensitive() + '\n');
                break;

            default:

                System.out.println("Other stuff has been created.");
                stuff[Commodity.NUMBER_OF_Commodity] = new Other(name, dis, h, w, wei);
                System.out.println("new " + stuff[Commodity.NUMBER_OF_Commodity - 1].getName() + "has been created" + "with stock of: " + ((Other) stuff[Commodity.NUMBER_OF_Commodity - 1]).getStockOfOther() + '\n');

                break;
        }
    }

    public static int searchByName(Commodity[] stuff, String suffName) {

        int i;
        for (i = 0; i < Commodity.NUMBER_OF_Commodity; i++) {
            if (stuff[i].getName().equals(suffName))
                break;
        }
        return i;
    }

    public static void setArrayofCommodites(Commodity[] stuff) {

        String name, dis;
        double hight, width, weight;

        System.out.println("Enter stuff`s name:");
        name = scanner.next();

        System.out.println("Enter stuff`s description:");
        dis = scanner.next();

        System.out.println("Enter stuff`s hight:");
        hight = scanner.nextDouble();

        System.out.println("Enter stuff`s width:");
        width = scanner.nextDouble();

        System.out.println("Enter stuff`s weight:");
        weight = scanner.nextDouble();

        setCommodites(stuff, name, dis, width, hight, weight);
    }

    public static void main(String[] args) {

        Commodity[] stuffs = new Commodity[30];
        int choice, stock, index;

        while (true) {

            System.out.println("1-create the stuff\n2-change stock of stuff using name of it.\n3-show stock of searched name.");

            choice = scanner.nextInt();
            switch (choice) {

                case 1:
                    setArrayofCommodites(stuffs);
                    break;

                case 2:
                    // TODO must add the name search and stock change logic.

                    System.out.println("Enter name of existed stuff to change stock of it:");
                    String stuffName = scanner.next();

                    if (Electronic.isElectronic(stuffs[searchByName(stuffs, stuffName)])) {

                        index = searchByName(stuffs, stuffName);
                        System.out.println("Enter " + stuffs[index].getName() + " new stock:");
                        stock = scanner.nextInt();
                        ((Electronic) stuffs[index]).setStockOfElectronic(stock);
                        System.out.println("The stock of " + stuffs[index].getName() + " is " + ((Electronic) stuffs[index]).getStockOfElectronic() + '\n');

                    } else if (Edible.isEdible(stuffs[searchByName(stuffs, stuffName)])) {

                        index = searchByName(stuffs, stuffName);
                        System.out.println("Enter " + stuffs[index].getName() + " new stock:");
                        stock = scanner.nextInt();
                        ((Edible) stuffs[index]).setStockOfEdible(stock);
                        System.out.println("The stock of " + stuffs[index].getName() + " is " + ((Edible) stuffs[index]).getStockOfEdible() + '\n');

                    } else if (Sensitive.isSensitive(stuffs[searchByName(stuffs, stuffName)])) {

                        index = searchByName(stuffs, stuffName);
                        System.out.println("Enter " + stuffs[index].getName() + " new stock:");
                        stock = scanner.nextInt();
                        ((Sensitive) stuffs[index]).setStockOfSensitive(stock);
                        System.out.println("The stock of " + stuffs[index].getName() + " is " + ((Sensitive) stuffs[index]).getStockOfSensitive() + '\n');

                    } else {
                        index = searchByName(stuffs, stuffName);
                        System.out.println("Enter " + stuffs[index].getName() + " new stock:");
                        stock = scanner.nextInt();
                        ((Other) stuffs[index]).setStockOfOther(stock);
                        System.out.println("The stock of " + stuffs[index].getName() + " is " + ((Other) stuffs[index]).getStockOfOther() + '\n');
                    }

                    break;

                case 3:

                    System.out.println("Enter name of stuff:");
                    stuffName = scanner.next();

                    if (Electronic.isElectronic(stuffs[searchByName(stuffs, stuffName)]))
                        System.out.println((((Electronic) stuffs[searchByName(stuffs, stuffName)]).getStockOfElectronic()));

                    else if (Edible.isEdible(stuffs[searchByName(stuffs, stuffName)]))
                        System.out.println((((Edible) stuffs[searchByName(stuffs, stuffName)]).getStockOfEdible()));

                    else if (Sensitive.isSensitive(stuffs[searchByName(stuffs, stuffName)]))
                        System.out.println((((Sensitive) stuffs[searchByName(stuffs, stuffName)]).getStockOfSensitive()));

                    else if (Other.isOther(stuffs[searchByName(stuffs, stuffName)]))
                        System.out.println((((Other) stuffs[searchByName(stuffs, stuffName)]).getStockOfOther()));

                    else
                        System.out.println("the stuff has not exist!\n");

                    break;
            }
        }
    }
}