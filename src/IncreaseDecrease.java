public class IncreaseDecrease {
    /**
     * knowledge point:
     * 自增
     * a++ 先用再加
     * ++a 先加再用
     * 自减
     * 同上
     */
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + "------" + a);//10 11
        System.out.println(++a + "------" + a);//12 12
        System.out.println(a-- + "------" + a);//12 11
        System.out.println(--a + "------" + a);//10 10
    }
}
