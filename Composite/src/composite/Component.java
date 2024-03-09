package composite;

public abstract class Component {
    protected String name ;
    protected int level ;
    public Component(String name){
        this.name=name;
    }
    public abstract void print();

}
