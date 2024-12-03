public class TestRandom {
    public static void main(String[] args){
        // 生成 [0, 1) 之间的随机数
        double random = Math.random();

// 生成 [0, 100) 的随机整数
        int randomInt = (int) (Math.random() * 100);

// 生成 [50, 100) 的随机整数
        int randomRange = 50 + (int) (Math.random() * 50);
        System.out.println(random);
        System.out.println(randomInt);
        System.out.println(randomRange);
    }
}
