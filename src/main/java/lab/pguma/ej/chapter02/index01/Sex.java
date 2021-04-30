package lab.pguma.ej.chapter02.index01;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

/**
 * 本来はEnumを使うべきだけどイミュータブルの例のために敢えて
 */
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Sex {

  @Getter
  private final String type;

  public static final String maleType = "♂";
  public static final String femaleType = "♀";

  static final Sex MALE = new Sex(maleType);
  static final Sex FEMALE = new Sex(femaleType);

  public static Sex getInstanceOf(@NonNull final String type) {
    if(type.equals(maleType)) {
      return MALE;
    } else if(type.equals(femaleType)) {
      return FEMALE;
    } else {
      throw new RuntimeException("不正なtype指定です。type=" + type);
    }
  }
}