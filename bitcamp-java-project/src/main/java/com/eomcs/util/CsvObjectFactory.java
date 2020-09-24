package com.eomcs.util;

// CSV 문자열을 이용하여 객체를 생성하는 것을 규칙으로 정의한다.

public interface CsvObjectFactory<T> {

  T create(String csv);

}
