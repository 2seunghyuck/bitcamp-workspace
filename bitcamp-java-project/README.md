# 13 - 생성자가 필요한 이유

** 생성자(constructor)**는 인스턴스를 사용하는데 문제가 없도록
인스턴스 필드를 유효한 값으로 초기화 시키는 일을 한다.

이번훈련에서는 *생성자*를 사용하지 않는 경우의 문제점을 확인하고 . 
*생성자*를 적용해야 하는 상황을 경험해보자.

## 훈련 목표

- 인스턴스 필드의 유효한 값으로 초기화시키지 않을때 문제점을 확인한다.
- 생성자의 용도를 이해한다.
- 생성자를 이용하여 인스턴스를 사용하기 전에 필요한 값들을 준비할 수 있다.

## 훈련 내용

- 생성자를 통해 의존객체를 강제로 주입하게 만든다.
-`projectHandler` 와 `TaskHandler`에서 사용할 `MemberHandler`을 강제로 주입하게 한다.

## 실습


### 1단계 - 의존 객체를 주입하지 않았을 때 발생되는 문제를 확인한다.

- `App` 클래스에서  `ProjectHandler`의 의존객체인 `MemberHandler` 설정을 주석으로 처리하라.
- `App` 클래스에서  `TaskHandler`의 의존객체인 `MemberHandler` 설정을 주석으로 처리하라.  
- *프로젝트 등록* 과 *작업 등록* 을 테스트하여 문제점을 확인한다.

#### 작업파일

- com.eomcs.pms.app 변경

### 2단계 - 생성자를 이용하여 의존객체를 강제로 주입하게 한다.

- `ProjectHandler`의 인스턴스를 생성할 때 의존객체를 반드시 주입하도록 기본 생성자 대신에 의존객체를 파라미터로 받는 생성자를 추가한다.
- `TaskHandler`의 인스턴스를 생성할 때 의존객체를 반드시 주입하도록 기본 생성자 대신에 의존객체를 파라미터로 받는 생성자를 추가한다.
- `App` 클래스에서 `ProjectHandler` 객체를 생성할 때, 생성자 파라미터에 의존객체를 넘겨준다.
- `App` 클래스에서 `TaskHandler` 객체를 생성할 때, 생성자 파라미터에 의존객체를 넘겨준다.

#### 작업파일

- com.eomcs.pms.app 변경
- com.eomcs.pms.handler.ProjectHandler
- com.eomcs.pms.handler.TaskHandler


- LessonHandler.java
    - 기본 생성자 대신에 파라미터로 keyboard를 받는 생성자를 추가한다.
- MemberHandler.java
    - 기본 생성자 대신에 파라미터로 keyboard를 받는 생성자를 추가한다.
- BoardHandler.java
    - 기본 생성자 대신에 파라미터로 keyboard를 받는 생성자를 추가한다.
- App.java
    - 핸들러의 인스턴스를 생성할 때 파라미터의 값으로 keyboard 객체를 넘긴다.

## 실습 결과

- src/main/java/com/eomcs/lms/handler/BoardHandler.java 변경
- src/main/java/com/eomcs/lms/handler/LessonHandler.java 변경
- src/main/java/com/eomcs/lms/handler/MemberHandler.java 변경
- src/main/java/com/eomcs/lms/App.java 변경
