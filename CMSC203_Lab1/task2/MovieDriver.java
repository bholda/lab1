import java.util.Scanner;

public class MovieDriver {
	public static void main(String args[]) {
		boolean run = true;
		do{
		Scanner scan = new Scanner(System.in);
		Movie newMovie = new Movie();
		System.out.println("Please Enter a movie title: ");
		String movie = scan.nextLine();
		newMovie.setTitle(movie);
		System.out.println("Enter the movies rating: ");
		String rating = scan.nextLine();
		newMovie.setRating(rating);
		System.out.println("Enter the number of tickets sold: ");
		int sold = scan.nextInt();
		newMovie.setSoldTickets(sold);
		System.out.println(newMovie.toString());
		System.out.println("Would you like to run again(y/n): ");
		String repeat = scan.next();
		if(repeat.equals("n")) {
			run = false;
		}
		}while(run == true);
	}
}
