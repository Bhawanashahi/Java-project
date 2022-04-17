import com.sun.source.tree.NewArrayTree;

public class Helloworld {
    public static void main(String[] args){
      System.out.println ("HelloWorld!!!");

    }
}
class Hellojava{
    public static void main(String[] args){
        System.out.println("Hellojava !!!");
    }
}
//this is single line comment
/*
this is multi line comment*/

class Hello{
    public static void main(String[] args){
        System.out.println(" My name is \'Bhawana shahi\'");
    }
}
 class Bhawana{
     static int a=10; //static variable or class variable
    int b=12; //instance variable
    public static void main(String[] args){
        Bhawana bhawana = new Bhawana();
        System.out.println(a);
        System.out.println(bhawana.b);
        System.out.println("Hello world");
        bhawana.printName();

    }
    void printName(){
        String name="Bhawana";
        System.out.println(name);
    }
}


