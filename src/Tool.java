abstract class Tool implements Workable { //класс декоратор
    public Tool() {}
    @Override
    public void hardWork() {
    }
    abstract void work();
}


