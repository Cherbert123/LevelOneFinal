package Netflix;

public class ShowRunner {

public static void main(String[] args) {
	Movie starTrack = new Movie("Star Track", 4);
	Movie desertBook = new Movie("Desert Book", 5);
	Movie rickeyMouse = new Movie("Rickey Mouse ", 1);
	Movie nowYouDont = new Movie("Now You Don't See Me", 3);
	Movie groundWars = new Movie("Ground Wars", 2);
	desertBook.getTicketPrice();
	NetflixQueue shows = new NetflixQueue();
	shows.addMovie(desertBook);
	shows.addMovie(starTrack);
	shows.addMovie(nowYouDont);
	shows.addMovie(groundWars);
	shows.addMovie(rickeyMouse);
	shows.printMovies();
	System.out.println("The Best Movie Is " + shows.getBestMovie());
	System.out.println("The Second Best Movie Is " + shows.getSecondBestMovie());
	for (int i = 0; i < 5; i++) {
		System.out.println(shows.getMovie(i));
	}
}

}
