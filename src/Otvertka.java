class Otvertka extends Tool {
    public Otvertka(Tool tool) {
        super(tool);
    }

    public Otvertka() {
    }

    @Override
    public void hardWork() {
        System.out.println("Кручу");
    }
}
