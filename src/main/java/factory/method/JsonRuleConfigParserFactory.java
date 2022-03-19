package factory.method;

import factory.simplefactory.IRuleConfigParser;
import factory.simplefactory.JsonRuleConfigParser;

public class JsonRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new JsonRuleConfigParser();
    }
}