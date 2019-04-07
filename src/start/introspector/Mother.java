package start.introspector;

/**
 * @author: lrk
 * 2019/4/7 22:55
 */
public class Mother {
    private String love;
    private int heart;

    public Mother() {
    }

    public Mother(String love, int heart) {
        this.love = love;
        this.heart = heart;
    }

    public String getLove() {
        return love;
    }

    public int getHeart() {
        return heart;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public void setHeart(int heart) {
        this.heart = heart;
    }

    @Override
    public String toString() {
        return "mom{ love: " + this.love + "  heart: " + this.heart + " }";
    }
}