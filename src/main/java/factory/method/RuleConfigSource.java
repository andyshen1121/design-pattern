package factory.method;

import factory.simplefactory.IRuleConfigParser;
import factory.simplefactory.RuleConfig;

public class RuleConfigSource {
  public RuleConfig load(String ruleConfigFilePath) throws Exception {
    String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
    // 此处使用工厂的工厂
    IRuleConfigParserFactory parserFactory = RuleConfigParserFactoryMap.getParserFactory(ruleConfigFileExtension);
    if (parserFactory == null) {
      throw new Exception();
    }
    IRuleConfigParser parser = parserFactory.createParser();

    String configText = "";
    //从ruleConfigFilePath文件中读取配置文本到configText中
    RuleConfig ruleConfig = parser.parse(configText);
    return ruleConfig;
  }

  private String getFileExtension(String filePath) {
    //...解析文件名获取扩展名，比如rule.json，返回json
    return "json";
  }
}