package template;

/**
 * 模版方法
 *
 * @author shenrongtao
 * @date 2022/4/5
 */
public class Main {

}

abstract class Template {
    public void m() {
        op1();
        op2();
    }

    abstract void op1();

    abstract void op2();
}

class C1 extends Template {

    @Override
    void op1() {
        System.out.println("op1");
    }

    @Override
    void op2() {
        System.out.println("op2");
    }
}