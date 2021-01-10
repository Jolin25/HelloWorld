public class Variable {
    public static void main(String[] args) {
        /** knowledge point:
         *  3 这种常量叫做 literal value
         *  a 这种变量叫做 variable value
         *
         *  Java语法三级跳： 表达式--->语句--->代码块
         *      a = 3 叫做表达式
         *      int a = 3; 这种叫做 statement （语句）
         *      {} 叫做代码块
         */

        int a = 3;
        int b = 5;
        int c = 7;

        int x = 9;

        int y = a * x + b * x * x + c * x * x * x;

        System.out.println(y);
    }

}
