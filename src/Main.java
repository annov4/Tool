public class Main {
    public static void main(String[] args) {
        Tool multitool = new Otvertka(new Knife(new Otvertka(new Knife())));
        multitool.work();
    }
}
