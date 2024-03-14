public class Work extends Tool {
    private Tool tool;
    public Work(Tool tool) {
        this.tool = tool;
    }
    public Work() {}
    public void work() {
        if (tool != null) {
            tool.work();
        }
    }
}