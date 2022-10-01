import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a temperatura em Fahrenheit?");
        double fahre = sc.nextDouble();

        sc.close();
        
        double celsius = 5 * ((fahre-32) / 9);
        
        System.out.println("A temperatura em Celsius é: "+celsius);
    }
}