package app;

public class Main {
    public static void main(String[] args) {
        DataProvider dataProvider = new DataProvider();
        Corrector corrector = new Corrector();

        getOutput(corrector.handleData(dataProvider.getData()));
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
