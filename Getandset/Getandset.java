public class Getandset {
    private string name; //private : restricted access
    //Getter
    public String getName();{
        return name;
    }
    //Setter
    public void setName(String newName) {
        this.name = newName;
    }
}
public class Main {
    public static void main(String[] args) {
        Getandset myObj = new Getandset();
        myObj.name = "john"; //accured an error
        System.out.println(myObj.name);
    }
}
public class Second {
    public static void Second(String[] args){
        Getandset.myObj = new Getandset();
        myObj.setname("john");//set the value of the name variable to "john"
        System.out.println(myObj.getName());//output:john
    }
}