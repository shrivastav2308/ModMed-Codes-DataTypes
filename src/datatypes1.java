public class datatypes1 {
    public static void main(String[] args) {
        byte var1 = 20;
        short var2 = 50;
        int var3 = 40;
        long last = 50000L + 10L * (var1+var2+var3);
        System.out.println(last);

        short stotal = (short) (1000 + var1 + var2 + var3);
        System.out.println(stotal);
    }
}
