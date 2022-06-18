public class Staticmethod {
    //static method
    static void myStaticmethod(){
        System.out.println("static method can be called without creating objects.");
    }
    //public method
    public void myPublicmethod(){
        System.out.println("public method must be called by creating objects.");
    }
    public static void main(String[] args){
        myStaticmethod();
        Staticmethod myobj = new Staticmethod();//creating object for myPublicmethod
        myobj.myPublicmethod();
    }
}
