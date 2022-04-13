package singleton;

/**
 * design-pattern
 *
 * @author shenrongtao
 * @date 2022/4/13
 */
public class Mgr06 {
    /**
     * 禁止指令重排序，不加的话，第二个线程可能使用半初始化状态的对象
     */
    private static volatile Mgr06 INSTANCE;

    /**
     * 构造方法私有化
     */
    private Mgr06() {

    }

    public static Mgr06 getInstance() {
        // Double Check Lock
        if (INSTANCE == null) {
            // 双重检查
            synchronized (Mgr06.class) {
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr06();
                }
            }
        }
        return INSTANCE;
    }
}
