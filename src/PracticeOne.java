public class PracticeOne {
    /**
     * 打印26个连续的字符
     */
    public static void main(String[] args) {
        for (int i = 65; i < 91; i++) {
            System.out.print((char) i + "\t");
        }
        System.out.println();
        int j = '\u1125';
        for (int i = j; i < j + 26; i++) {
            System.out.print((char) i + "\t");
        }

    }
}
