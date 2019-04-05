public class TenFiveTwo {
    private int ten;

    private int five;

    private int two;

    TenFiveTwo(int ten, int five, int two) {
        this.ten = ten;
        this.five = five;
        this.two = two;
    }

    public int getTen() {
        return ten;
    }

    public void setTen(int ten) {
        this.ten = ten;
    }

    public int getFive() {
        return five;
    }

    public void setFive(int five) {
        this.five = five;
    }

    public int getTwo() {
        return two;
    }

    public void setTwo(int two) {
        this.two = two;
    }

    @Override
    public String toString() {
        return "TenFiveTwo{" +
                "ten=" + ten +
                ", five=" + five +
                ", two=" + two +
                '}';
    }
}
