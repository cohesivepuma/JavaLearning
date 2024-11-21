public class first {
    public static void main(String[] args){ //I think there is just a little differet with c++.
        int x = 17;
        String name = "gu";
        x = x * 3;
        System.out.println("your number is "+x);
        double d = Math.random(); //this is a comment

        while(x>12){
            x-=1;
            System.out.print("It work!!!!");//it's differet with println
        }

        System.out.println(x);

        for(int i = 1;i<10;i++){
            System.out.println("now the i is " + i);
        }

        if(x == 10){
            System.out.println("x is ten");
        }else{
            System.out.println("x is not ten");
        }

        if(x<19 && name.equals("gu")){
            System.out.println("It can work!");
        }

        System.out.println("this line runs no matter what");

        boolean is_true = true;
        if(is_true){
            System.out.println("yes, it work again");
        }
    }
}
