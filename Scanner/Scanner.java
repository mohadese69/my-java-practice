import java.util.Scanner; //import the scanner class
public class Scanner {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String userName;
        //Enter userName and press Enter
        System.out.println("Enter username");
        userName = myObj.nextline();
        System.out.println("username is :"+ userName);
    }
}
