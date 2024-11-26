class Cat{
    int name;

    void bark(){
        System.out.println("oh!oh!");
    }
}

public class Reference {
    public static void main(String[] args){
        Cat aoliao = new Cat();
        Cat maoqiu;
        maoqiu = new Cat();
        aoliao.bark();
        maoqiu.bark();//god, Why cat will bark?
    }
}
