public class Mainconstructor {
    int x; //create a class attribute
    //create a constructor for the Mainconstructor class
public Mainconstructor() {
    int x = 5; // set the intial value for the class attribute
}
public static void main(String[] args){
    Mainconstructor myObj = new Mainconstructor();
    System.out.println(myObj.x);
}
}
