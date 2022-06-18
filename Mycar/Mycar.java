public class Mycar {
    //creat a car object named mycar. call the fullthrottle() and speed() methods on the mycar object,and run the program.
   //creat a fullthrottle method
    public void fullthrottle() {
        System.out.println("the car is going as fast as it can! ");
    }
    //creat a speed method and add a parameter
    public void speed(int maxspeed) {
        System.out.println("max speed is :"+ max speed);
    }
    //call the methods in main
    public static void main(String[] args) {
        Mycar mycar = new Mycar();
        mycar.fullthrottle();// call the fullthrottle method
        mycar.speed(200); // call the speed method
        //output is "the car is going as fast as it can!
        //out put is max speed is : 200
    }
}
