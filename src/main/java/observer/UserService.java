package observer;

/**
 * 用户服务
 *
 * @author shenrongtao
 * @date 2022/3/22
 */
public interface UserService {

    /**
     * 注册
     * @param telephone 电话
     * @param password 密码
     * @return long
     */
    long register(String telephone, String password);
}
