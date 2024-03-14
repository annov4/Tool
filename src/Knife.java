class Knife extends Tool {
    private Tool tool;

    public Knife(Tool tool) {
        this.tool = tool;
    }

    @Override
    void work() {
        System.out.println("Режу");;
    }
}