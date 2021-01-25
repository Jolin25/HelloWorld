public class ClassLearn {
    /** knowledge point:
     *  类的学习：
     *      类是对象的模板，对象是类的一个实例
     *          侧重于说现实层面的时候可以说实例，侧重于说和类的从属关系的时候可以说对象。
     *          实例和对象实质上都是同一个东西。
     *      引用只能指向其所属类型的类的对象。
     *      引用一头连着类，一头连着对象。
     *
     *  debug:
     *      variables:
     *          变量变成蓝色：说明该变量在这一步有了变化
     *      断点可以设置为条件断电，满足条件才停在这
     *  evaluate:
     *      可以输入任意的表达式
     */
    public static void main(String[] args) {
        //a是引用，new String()会创建一个对象，String是类（模板）
        String a = new String();
        a= "1";
        String b = "a";
        b = "b";
    }
}
