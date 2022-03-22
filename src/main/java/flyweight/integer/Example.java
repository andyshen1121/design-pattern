package flyweight.integer;

/**
 * design-pattern
 *
 * @author shenrongtao
 * @date 2022/3/22
 */
public class Example {

    /**
     * 当我们通过自动装箱，也就是调用 valueOf() 来创建 Integer 对象的时候，
     * 如果要创建的 Integer 对象的值在 -128 到 127 之间，
     * 会从 IntegerCache 类中直接返回，否则才调用 new 方法创建。
     * @author shenrongtao
     * @date 2022/3/22
     * @version
     */
//    public static Integer valueOf(int i) {
//        if (i >= IntegerCache.low && i <= IntegerCache.high)
//            return IntegerCache.cache[i + (-IntegerCache.low)];
//        return new Integer(i);
//    }


    // 开发中，优先使用后两种

    Integer a = new Integer(123);
    Integer b = 123;
    Integer c = Integer.valueOf(123);
}
