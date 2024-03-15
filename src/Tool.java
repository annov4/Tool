abstract class Tool implements Workable {
    private Tool tool;

    public Tool(Tool tool) {
        this.tool = tool;
    }

    public Tool() {
    }

    @Override
    public void hardWork() {
    }

    public void work() {
        if (tool != null) {
            hardWork();
            tool.work();
        } else {
            hardWork();
        }
    }
}



