public class Multiplemethod {
    static void myMethod(String fname ,  int age){
        System.out.println(fname + "is"+ age);
    }
    public static void main(String[] args){
        myMethod("jhon" , 15); //output jhon is 15
        myMethod("joe" , 21);
        myMethod("jack" , 40);
    }
}
