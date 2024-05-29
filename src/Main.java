//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome to Screen Match");
        System.out.println("Movie: Matrix");

        int dateOfRelease = 1999;
        boolean partOfSubscription = true;
        double movieRating = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        String summary = """
                Matrix is a paradox
                The best movie of the millenium
                It premiered:
                """ + dateOfRelease;
        System.out.println(summary);

        int rating = (int) (media / 2);
        System.out.println(rating);
    }
}