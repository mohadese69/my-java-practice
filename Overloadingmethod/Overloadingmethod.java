public class Overloadingmethod {
    static int plusmethod(int x, int y){
        return x + y;
        static double plusmethod( double x, double y){
            return x +y;
        }
    }
    public static void main(String[] args){
        int myNum1 = plusmethod(7,9);
        double mynum2 = plusmethod(4.2, 7.8);
        System.out.println("int:" + myNum1);
        System.out.println("double :" + mynum2);
    }
}
