public class HiddenWord {
    private String word;

    public HiddenWord(String w) {
        word = w;
    }

    public String getHint(String guess) {
        String temp = word;
        String w = "";
        for (int i = 0; i < guess.length(); i++) {
            String letter = guess.substring(i, i + 1);
            int a = temp.indexOf(letter);
            if (a != -1) {
                if (i == a) {
                    w += letter;
                } else {
                    w += "+";
                }
            } else {
                w += "*";
            }
            temp = temp.substring(i + 1);
            guess = guess.substring(i + 1);
            i--;
        }
        return w;
    }
}