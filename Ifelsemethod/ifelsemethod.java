public class ifelsemethod {
    //create a checkage() method with an integer parameter called age
    static void checkage(int age){
        if (age < 18){
            System.out.println("acsses denied,your age is not enough!");
        } else {
            System.out.println("you are old enough.");
        }
    }
    public static void main(String[] args){
        checkage(20);
    }
}
