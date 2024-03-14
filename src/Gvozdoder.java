public class Gvozdoder extends Work {
    public Gvozdoder(Tool tool) {
        super(tool);
    }
    public Gvozdoder(){}
    @Override
    public void work() {
        System.out.println("Убираю гвозди");
       super.work();
    }
}