public class Stamp {
    public static final int MIN_STAMP = 0;
    public static final int USE_STAMP = 10;
    private int stamp = MIN_STAMP;

    public int getStamp() {
        return stamp;
    }

    public void setStamp(int stamp) {
        this.stamp = stamp;
    }

    public void addStamp(){
        stamp++;
    }
    public void useStamp(){
        stamp=-USE_STAMP;
    }
}
