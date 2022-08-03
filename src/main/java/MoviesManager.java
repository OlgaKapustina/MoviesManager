public class MoviesManager {
    private String[] movies = new String[0];
    private int limit = 10;
    public MoviesManager(){
    }

    public MoviesManager(int limit){
        this.limit = limit;

    }

    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];

        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;

    }

    public String[] findAll() {
        return movies;

    }

    public String[] findLast() {
        int resultlenght;
        if (movies.length < limit) {
            resultlenght = movies.length;

        } else {
            resultlenght = limit;


        }
        String[] tmp = new String[resultlenght];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}
