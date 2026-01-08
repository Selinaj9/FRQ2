public class AdditionPattern {
    private int start;
    private int pattern;
    private int num;

    public AdditionPattern(int s, int p) {
        start = s;
        pattern = p;
        num = s;
    }

    public int currentNumber() {
        return num;
    }

    public void next() {
        num += pattern;
    }

    public void prev() {
        if (num != start) {
            num -= pattern;
        }
    }
}