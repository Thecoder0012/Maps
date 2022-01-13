import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("John",43264123);
        numbers.put("Peter",54230323);
        numbers.put("Kurt",91345434);
        numbers.put("Per",25465434);
        numbers.put("Anders",45934923);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a name to view their number");
        String name = scanner.next();

        if (numbers.containsKey(name)){
            System.out.println(name +"'s number is: "+numbers.get(name));
        }

    }
}
