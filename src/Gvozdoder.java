public class Gvozdoder extends Tool {
    private Tool tool;

    public Gvozdoder(Tool tool) {
        this.tool = tool;
    }

    @Override
    void work() {
        tool.work();
        System.out.println("Убираю гвозди");
    }
}