package corejav;

public class Sample {

    public static void main(String[] args) {
        Bar bar = new Bar();
        bar.setName("FirstName");
        System.out.println(bar.getName()+"\n%%%%%%%%%%%%%%%%%%%%%\n");
        new Foo().foo(bar);
        System.out.println(bar.getName());
    }
}
class Foo{
    void foo(Bar b){
        b.setName("SecondName");
    }
}
class Bar{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
