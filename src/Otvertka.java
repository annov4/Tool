class Otvertka extends Tool {
    private Tool tool;

    public Otvertka(Tool tool) {
        this.tool = tool;
    }
    public Otvertka() {}

    @Override
    void work() {
        System.out.println("Кручу");
        if (tool != null) {
            tool.work();
        }

    }
}