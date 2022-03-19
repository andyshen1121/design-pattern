package factory.method;

import factory.simplefactory.IRuleConfigParser;

/**
 * 典型工厂方法，定义接口，让其他工厂实现
 *
 * @author shenrongtao
 * @date 2022/3/19
 */
public interface IRuleConfigParserFactory {

    IRuleConfigParser createParser();
}
