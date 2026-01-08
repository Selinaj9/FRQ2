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

    public int next() {
        num += pattern;
        return num;
    }

    public int prev() {
        if (num != start) {
            num -= pattern;
        }
        return num;
    }
}