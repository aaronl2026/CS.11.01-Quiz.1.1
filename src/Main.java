import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner age_scanner = new Scanner(System.in);
        int age;
        String firstName;
        String favouriteFood;
        System.out.println("Please enter your age: ");
        age = age_scanner.nextInt();
        Scanner name_scanner = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        firstName = name_scanner.nextLine();
        Scanner food_scanner = new Scanner(System.in);
        System.out.println("Please enter your favourite food: ");
        favouriteFood = food_scanner.nextLine();
        System.out.println("First name: "+firstName+"\nAge: "+age+"\nFavourite food: "+favouriteFood);





    }

}