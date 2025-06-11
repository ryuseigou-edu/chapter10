public class Matango {
    int hp;
    final int LEVEL = 10;
    char suffix;
    public void run() {
        System.out.println
                ("お化けキノコ" + this.suffix + "は逃げ出した");
    }

    public Matango() {
        this.hp = 30;
        this.suffix = 'X';
    }
    public Matango(char suffix) {
        this.hp = 30;
        this.suffix = suffix;
    }
}
