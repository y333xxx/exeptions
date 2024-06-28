import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] months = {"январь", "февраль", "март", "апрель", "май",
                "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};

        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Введите интересующий вас месяц: ");
            int x = input.nextInt();
            --x;
                System.out.println("В месяце " + months[x] + " " + dom[x] + " дней");
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Недопустимый месяц, введите в формате от 1 до 12.");
        }
        catch (InputMismatchException ex){
            System.out.println("Недопустимый тип данных, введите число!");
        }
    }
}