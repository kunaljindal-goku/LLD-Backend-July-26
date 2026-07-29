public class Client {

    public static void main(String[] args) {
//        Member goku     = new Member("Goku", "goku@email.com");
//        Librarian vegeta  = new Librarian("Vegeta", "vegeta@email.com", "EMP-007");
//
//        goku.displayDashboard();
//        vegeta.displayDashboard();
//
//        System.out.println("Member ID:    " + goku.getUserId());
//        System.out.println("Librarian ID: " + vegeta.getUserId());
//        System.out.println("Total users:  " + User.getTotalUsers());


        Member goku = new Member("Asha", "asha@email.com");
        Book novel  = new NovelBook("N-1", "Dune", "Frank Herbert", "Sci-Fi");

        novel.displayBookDetails();

        System.out.println("Available? " + novel.isAvailable());    // true
        System.out.println("Lend:      " + novel.lend(goku));       // true
        System.out.println("Available? " + novel.isAvailable());    // false
        System.out.println("Lend again:" + novel.lend(goku));       // false
        
    }
}
