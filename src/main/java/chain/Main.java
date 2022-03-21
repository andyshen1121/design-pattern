package chain;

/**
 * design-pattern
 *
 * @author shenrongtao
 * @date 2022/3/21
 */
public class Main {
    public static void main(String[] args) {
        Message message = new Message();
        message.setMessage("http://www.baidu.com");
        // 第一个FilterChain
        FilterChain filterChain = new FilterChain();
        filterChain.add(new HttpFilter());
        // 把整体的链条也看成一个filter
        // 第二个FilterChain
        FilterChain secondFilterChain = new FilterChain();
        secondFilterChain.add(new ComFilter());
        filterChain.add(secondFilterChain);

        filterChain.doFilter(message);
        System.out.println(message.getMessage());

    }
}
