public class SwitchLearn {
    public static void main(String[] args) {
        /** knowledge point:
         *      因为case不是一个代码块，所以整个switch里面的变量的作用域就是switch;
         *      switch 会先判断case中有没有符合条件的情况，有的话就从第一个符合情况的语句开始执行，直到遇到case或者return才结束执行
         */
        switch ("1") {
            default:
                int b = 3 + 6;
                System.out.println("default");
            case "2":
                int a = 3 + 5;
                System.out.println("2");
            case "1":
//                int a = 3 + 5;
                System.out.println("1");
            case "3":
//                int a = 3 + 5;
                System.out.println("3");



        }
    }

}
