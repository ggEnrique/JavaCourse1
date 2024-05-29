public class Decisions {

    public static void main(String[] args) {
        int dateOfRelease = 1999;
        boolean partOfSubscription = true;
        double movieRating = 8.2;
        String plan = "plus";

        if (dateOfRelease >= 2022){
            System.out.println("Popular movies");
        } else {
            System.out.println("Retro movies that are still awesome");
        }

        if (partOfSubscription && plan.equals("plus")) {
            System.out.println("Enjoy your movie");
        } else {
            System.out.println("Not part of your plan");
        }
    }
}
