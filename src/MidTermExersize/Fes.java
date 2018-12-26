package MidTermExersize;

class Father{
    int n;
    Father(int n){
        this.n = n;
    }
}

class Child extends Father{
    int a,b;

    Child(int a, int b){
        super(a);
        this.b = b;
    }

    public static boolean Obj(Father f){

        if (f instanceof Child) {
            Child child = (Child) f;
            System.out.println("Yes");
            return true;
        }
        else return false;
    }
}

public class Fes {

    public static void main(String[] args) {
        Father father = new Child(1,2);
        Child child = new Child(2,1);
        System.out.println(child.Obj(father));

    }
}
