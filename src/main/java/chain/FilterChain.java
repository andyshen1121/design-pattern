package chain;

import java.util.ArrayList;
import java.util.List;

/**
 * design-pattern
 *
 * @author shenrongtao
 * @date 2022/3/21
 */
public class FilterChain implements Filter{
    List<Filter> filterList = new ArrayList<>();

    public FilterChain add(Filter filter) {
        filterList.add(filter);
        return this;
    }

    @Override
    public void doFilter(Message message) {
        for (Filter filter : filterList) {
            filter.doFilter(message);
        }
    }
}
