
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {       
        Scanner scan = new Scanner(System.in);
        Planes plane = new Planes();
        Flights flight = new Flights();
        
         TextUserInterface ui = new TextUserInterface(scan, plane, flight);
         ui.start();    
    }
}
