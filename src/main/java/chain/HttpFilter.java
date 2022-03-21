package chain;

/**
 * design-pattern
 *
 * @author shenrongtao
 * @date 2022/3/21
 */
public class HttpFilter implements Filter{
    @Override
    public void doFilter(Message message) {
        String msg = message.getMessage();
        msg = msg.replace("http", "https");
        message.setMessage(msg);
    }
}
