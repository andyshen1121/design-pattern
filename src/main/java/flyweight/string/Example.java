package flyweight.string;

/**
 * design-pattern
 *
 * @author shenrongtao
 * @date 2022/3/22
 */
public class Example {
    public static void main(String[] args) {

        // 字符串常量池，享元模式
        String s1 = "shenrongtao";
        String s2 = "shenrongtao";

        // 堆
        String s3 = new String("shenrongtao");

        // true
        System.out.println(s1 == s2);

        // false
        System.out.println(s1 == s3);
    }
}
