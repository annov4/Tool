abstract class Tool implements Workable { //класс декоратор
    protected Workable workable;
    public Tool() {}
    @Override
    public void hardWork() {
    }
    abstract void work();
}


