class Otvertka extends Tool {
    private Tool tool;

    public Otvertka(Tool tool) {
        this.tool = tool;
    }

    @Override
    void work() {
        tool.work();
        System.out.println("Кручу");
    }
}