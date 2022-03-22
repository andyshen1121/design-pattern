package observer;

/**
 * 观察者接口
 *
 * @author shenrongtao
 * @date 2022/3/22
 */
public interface RegObserver {

    /**
     * 对注册成功进行处理
     * @param userId 用户Id
     */
    void handleRegSuccess(long userId);

}
