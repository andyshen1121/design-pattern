package chain;

/**
 * design-pattern
 *
 * @author shenrongtao
 * @date 2022/3/21
 */
public class ComFilter implements Filter{

    @Override
    public void doFilter(Message message) {
        String msg = message.getMessage();
        msg = msg.replace("com", "cn");
        message.setMessage(msg);
    }
}
