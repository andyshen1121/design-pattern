package observer;

/**
 * design-pattern
 *
 * @author shenrongtao
 * @date 2022/3/22
 */
public class RegNotificationObserver implements RegObserver {

    private NotificationService notificationService;

    @Override
    public void handleRegSuccess(long userId) {
        notificationService.sendInboxMessage(userId, "Welcome...");
    }
}
