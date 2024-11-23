class Dog{
    int size;
    String breed;
    String name;

    void bark(){
        System.out.print("Ruff!Ruff!");
    }
}
public class DogTestDrive {
    public static void main(String [] args){
        Dog d = new Dog();
        //为什么不能像c++一样用：
        //Dog d；
        //来直接创建对象
        //内存分配与c++不同。
        d.size = 40;
        d.bark();
    }
}
