import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();  // יוצרים אובייקט של random כדי ליצור מספרים אקראיים

        int number = random.nextInt(100);   // יוגרלו מספרים בטווח בין 0-100

        int number2 = random.nextInt();


        System.out.println("The two numbers are: " + number + " and " + number2);


        float number3 = random.nextFloat();  // אם נרצה להגריל מספר שאינו שלם בטווח 0.0 - 1.0

        System.out.println(number3);
    }
}