class Knife extends Tool {
    private Tool tool;

    public Knife(Tool tool) {
        this.tool = tool;
    }
    public Knife() {}

    @Override
    void work() {
        System.out.println("Режу");
        if (tool != null) {
            tool.work();
        }

    }
}