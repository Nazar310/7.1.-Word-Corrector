package app;

public class Corrector {
    public String handleData(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] correctWords = {"orange", "plum", "tomato", "onion", "grape"};

        for (int i = 0; i < strs.length; i++) {
            stringBuilder.append(i + 1).append(") ").append(correctWords[i]).append("\n");
        }

        return stringBuilder.toString();
    }
}
