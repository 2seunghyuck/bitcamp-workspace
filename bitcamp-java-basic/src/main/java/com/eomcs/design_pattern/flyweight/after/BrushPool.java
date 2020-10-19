package com.eomcs.design_pattern.flyweight.after;

import java.util.HashMap;
import java.util.Map;

// 생성한 객체를 보관해 두었다가 필요할떄마다 꺼내 사용하는 클래스
// 이렇게 생성된 객체를 재사용할 수 있도록 보관해 두었다가 꺼내주는 방식의 설계 기법을
// -----FlyWeight-------- 디자인 패턴이라한다.
// => 메모리를 효율적으로 사용하는 방법이다.
public class BrushPool {
  Map<String,Brush> brushMap = new HashMap<>();

  //브러시를 리턴하는 메서드
  public Brush getBrush(String pattern) {

    Brush brush = brushMap.get(pattern);
    if (brush == null) {
      System.out.printf("%s Create Brush\n", pattern);
      brush = new Brush(pattern);
      brushMap.put(pattern, brush);
    }
    return brush;
  }
}
