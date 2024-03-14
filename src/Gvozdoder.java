public class Gvozdoder extends Tool {
    private Tool tool;

    public Gvozdoder(Tool tool) {
        this.tool = tool;
    }
    public Gvozdoder(){}

    @Override
    void work() {
        System.out.println("Убираю гвозди");
        if (tool != null) {
            tool.work();
        }

    }
}