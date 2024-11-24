public class sharp2 {
    public static void main(String[] args){
//        int x = 34.5; can't work: it's float
//        boolean boo = x; can't work: boolean is JVM-specific
        int g = 17;
        int y = g;
        y = y + 10;
        short s;
//        s = y; can't work:
        byte b = 3;
        byte v = b;
        short n = 12;
//        v = n; can't work: short16 byte8
//        byte k = 128; can't work byte can only get 127
    }
}
