import java.io.Console;

public class console_ex {
    
    public static void main(String[] args) {
        Console con = System.console();

        String name;
        
        name = con.readLine("Please enter your name : ");

        System.out.println("Hello " + name);
    }
    

}
