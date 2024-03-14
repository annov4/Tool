class Knife extends Work {
    public Knife(Tool tool) {
        super(tool);
    }
    public Knife() {
    }
    @Override
    public void work() {
        System.out.println("Режу");
        super.work();
    }
}
