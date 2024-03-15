class Knife extends Tool {
    public Knife(Tool tool) {
        super(tool);
    }

    public Knife() {
    }

    @Override
    public void hardWork() {
        System.out.println("Режу");
    }
}
