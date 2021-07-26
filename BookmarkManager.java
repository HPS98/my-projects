package bookmarkit.root.managers;

import bookmarkit.root.entities.Movie;

public class BookmarkManager {

	private static BookmarkManager instance = new BookmarkManager();

	private BookmarkManager() {

	}

	public static BookmarkManager getInstance() {
		return instance;
	}

	public Movie createMovie(long id, String title, String profileUrl, int releaseYear, String[] cast,
			String[] directors, String genre, double imdRating) {
		Movie movie = new Movie();

		movie.setId(id);
		movie.setTitle(title);
		movie.setProfileUrl(profileUrl);
		movie.setReleaseYear(releaseYear);
		movie.setCast(cast);
		movie.setDirectors(directors);
		movie.setGenre(genre);
		movie.setImdbRating(imdRating);

		return movie;
	}
}
