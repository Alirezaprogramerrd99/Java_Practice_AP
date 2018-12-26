package MidTermExersize;

class Employe{

    int salery;
    Employe(){
        this.salery = 40000000;
    }

    Employe(int salery){
        this();
        this.salery = salery;

    }


    public int getSalery() {
        return salery;
    }
}

class Programmer extends Employe{

    int bounes;

    Programmer(int boun){
        super(boun);
    }
}

public class Abstraction {

    public static void main(String[] args) {
        Employe e = new Programmer(4567);
        System.out.println(e.getSalery());
    }



}
