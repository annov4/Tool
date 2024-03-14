class Otvertka extends Work {
    public Otvertka(Tool tool) {
        super(tool);
    }
    public Otvertka() {
    }
    @Override
    public void work() {
        System.out.println("Кручу");
        super.work();
    }
}
