package observer;

/**
 * 提醒服务
 *
 * @author shenrongtao
 * @date 2022/3/22
 */
public interface NotificationService {

    /**
     * 发送消息
     * @param userId 用户Id
     * @param message 消息
     */
    void sendInboxMessage(long userId, String message);
}
