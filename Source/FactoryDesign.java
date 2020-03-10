public class FactoryDesign {

    public MainInterface Game(String ans) {

        if (ans.equals("c")) {
            return new CardGame();
        } else if (ans.equals("d")) {
            return new DieGame();
        } else {
            System.out.println("Wrong Input!!");
            System.exit(1);
            return null;
        }
    }
}