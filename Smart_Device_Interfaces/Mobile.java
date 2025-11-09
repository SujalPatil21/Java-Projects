
public class Mobile implements wifi, MusicPlayer,stepTracker {


    @Override
    public void play(String Music) {
        System.out.println("Music Playing : " + Music);
    }

    @Override
    public void trackSteps(int num) {
        System.out.println(" Total Steps  : " + num);
    }

    @Override
    public void network(String name) {

        System.out.println("\n Network Used : " + name );
    }
}