package bpj.lesson20;

public class TvShow {
    public String showName;
    public String actor1="Don Knots";
    public int y=1059;

    public static int numShows = 0;
    public static int x = 59;
    public static String actor2 = "Homer Simpson";

    public TvShow(String nm){
        numShows++;
        showName = nm;
    }

    public static int numberOfShows(){
        return numShows;
    }

    public void setActor1(String act1){
        this.actor1 = act1;
    }
}
