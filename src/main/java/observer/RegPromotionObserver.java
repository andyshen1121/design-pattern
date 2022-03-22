package observer;

/**
 * 负责推广的观察者
 *
 * @author shenrongtao
 * @date 2022/3/22
 */
public class RegPromotionObserver implements RegObserver {

    private PromotionService promotionService;

    @Override
    public void handleRegSuccess(long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}
