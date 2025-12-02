public class Library {
    private static int totalBooksIssued = 0;

    public static void printPersonDetails(Person p){
        p.displayDetails();
    }
    public static int getTotalBooksIssued() {
        return totalBooksIssued;
    }
    static void incrementTotalBooksIssued() {
        totalBooksIssued++;
    }
}
