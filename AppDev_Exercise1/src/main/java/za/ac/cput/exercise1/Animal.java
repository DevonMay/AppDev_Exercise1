package za.ac.cput.exercise1;

/**
 * Devon May
 * 219168296
 */
public class Animal {
    private int deer;
    private int goose;

    public Animal(){
        this.deer = deer;
        this.goose = goose;
    }

    public int getDeer() {
        return deer;
    }

    public void setDeer(int deer) {
        this.deer = deer;
    }

    public int getGoose() {
        return goose;
    }

    public void setGoose(int goose) {
        this.goose = goose;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "deer=" + deer +
                ", goose=" + goose +
                '}';
    }
}
