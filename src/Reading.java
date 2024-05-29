import java.util.Scanner;

public class Reading {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Enter the name of your movie");
        String movie = teclado.nextLine();
        System.out.println("When was it released?");
        int releasedDate = teclado.nextInt();

        System.out.println("What is your rating for the movie");
        double rating = teclado.nextDouble();

        System.out.println(movie);
        System.out.println(releasedDate);
        System.out.println(rating);
    }
}
