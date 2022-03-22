package flyweight.editor;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 利用工厂类来缓存已经创建好的对象
 * @author shenrongtao
 * @date 2022/3/22
 * @version
 */
public class CharacterStyleFactory {
  private static final List<CharacterStyle> styles = new ArrayList<>();

  public static CharacterStyle getStyle(Font font, int size, int colorRGB) {
    CharacterStyle newStyle = new CharacterStyle(font, size, colorRGB);
    for (CharacterStyle style : styles) {
      if (style.equals(newStyle)) {
        return style;
      }
    }
    styles.add(newStyle);
    return newStyle;
  }
}