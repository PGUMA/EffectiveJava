package lab.pguma.ej.chapter02.index01;

import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class Dog {

  private final Sex sex;

  public static Dog getInstanceOf(@NonNull final DogBreed dogBreed, @NonNull final String sex) {
    final Sex sexType = Sex.getInstanceOf(sex);
    if(dogBreed == DogBreed.GoldenRetriever) {
      return new GoldenRetriever(sexType);
    } else {
      return new Poodle(sexType);
    }
  }

  public abstract void cry();

  public enum DogBreed {
    GoldenRetriever,
    Poodle
    ;
  }

}