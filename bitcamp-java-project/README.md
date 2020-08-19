# 14 - UI 처리 코드와 데이터 처리 코드를 분리하기

객체지향 프로그래밍을 할 때 다음 두 가지를 명심해야 한다.

- Low coupling
- High Cohesion

**관계도를 낮추기(Low coupling)**란 - 한 클래스가 많은 클래스에 의존하는 구조로 작성하면
의존 클래스가 변경될 때 마다, 영향을 받기 때문에 유지보수에 좋지않다.
그래서 가능한 의존하는 클래스의 접점을 줄이는 방향으로 만드는 것이 좋다.
(관계도 낮추기 => 의존 클래스의 변경에 둔감 => 코드 변경이 줄어든다.)

**응집력 강화(high cohesion)**란 - 한 클래스가 너무 다양한 역할을 수행하면 
클래스의 코드가 커지고 변경사항이 잦아지기 때문에 유지보수에 좋지않다.
가능한 한 클래스가 한개의 역할만 수행하게 만드는것이 유지보수에 좋다.
역할을 작게 쪼개게 되면 해당 클래스를 다른 프로젝트에서 재사용하기가 쉽다.
(응집력 강화 => 클래스를 잘게쪼갬 => 교체가 쉬워지고 재사용성이 높아진다)

이번 훈련의 목표는 **응집력 강화**를 연습해 보는것이다.
기존의 XXXHandler 클래스는 사용자에게 출력하고 사용자의 입력을 받는, 
사용자와 소통하는 역할을 수행할 뿐만아니라 사용자가 입력한 데이터를 관리하는 일도 수행한다.
이번 훈련에서는 XXXHandler의 역할을 더 작게 쪼개어 전문화 시킨다.
즉 사용자의 소통을 담당하는 **UI역할** 클래스 와
데이터처리를 담당하는 **DAO(Data Access Object)역할** 클래스로 분리할 것이다.
이렇게 분리하게 되면  추후 데이터 처리부분을 다른 클래스로 교체하기 쉬워진다.
예를들어 지금은 데이터를 배열에 보관하고 있지만, 나중에는 file 이나 DBMS에 보관하는 클래스로 교체할 수 있다.
또한 지금은 CLI(command line interface)방식으로 UI를 처리하고 있지만, 
나중에는 Web으로 처리하는 클래스로 교체하기가 쉬워진다.

## 훈련 목표

- 캡슐화 기법을 이용하여 데이터 처리 코드를 별개의 클래스로 분리할 수 있다.
- 배열 복제를 통해 배열의 크기를 늘릴 수 있다.
- 역할에 따라 클래스를 분리하는 방법과 이점을 이해한다.  

## 훈련 내용

- XxxXHandler 클래스를 UI처리와 데이터처리 역할자로 분리한다.

## 실습

### 1단계 - BoardHandler에서 데이터 처리 코드를 분리하라.

-`BoardHandler` 에서 데이터 처리코드를 분리하여 `BoardList` 클래스로 정의한다.
-`BoardList` 의 기본생성자와 배열의 초기 크기를 설정하는 생성자를 정의한다.
-`BoardList` 에 Board객체를 등록하는 add()를 정의한다.
-`BoardList` 에서 데이터 목록을  리턴하는 toArray()메서드를 정의한다.
-`BoardHandler` 는 `BoardList`를 사용하여 입,출력 데이터를 처리한다.

#### 작업파일 
- com.eomcs.pms.handler.BoardList 클래스 추가
    - 백업 BoardList.java.01
- com.eomcs.pms.handler.BoardHandler 클래스 변경
    - 백업 BoardHandler.java.01

### 2단계 - Board 클래스를 패키지 멤버 클래스로 전환한다.

여러 클래스에서 공유하는 클래스는 중첩 클래스 정의하기 보다는
패키지 멤버 클래스로 정의하면 관리하기가 더 쉽다.

- BoardList 클래스에서 Board클래스를 분리하여 패키지 멤버 클래스로 만든다.

#### 작업 파일

- com.eomcs.pms.domain 패키지를 생성
    - Board 나 Member처럼 데이터타입 역할을 하는 클래스를 **도메인(domain)**객체라고한다
    - 도메인 클래스를 저장할 패키지를 따로 생성한다.
- com.eomcs.pms.domain.Board 클래스를 생성
- com.eomcs.pms.domain.BoardHandler 클래스를 변경
- com.eomcs.pms.domain.BoardList 클래스를 변경


### 3단계 - MemberHandler를  UI 처리와 데이터 처리 클래스로 분리한다.

- BoardHandler 와 마찬가지로 데이터 처리 역할을 별도의 클래스로 분리한다.
- `Member` domain 클래스를 정의한다.
- `MemberList` 클래스를 추가하고 `MemberHandler` 를 사용하여 데이터를 처리한다.

#### 작업파일 
- com.eomcs.pms.handler. 클래스 추가
    - 백업 BoardList.java.01
- com.eomcs.pms.handler.BoardHandler 클래스 변경
    - 백업 BoardHandler.java.01

### 4단계 - ProjectHandler를  UI 처리와 데이터 처리 클래스로 분리한다.
### 5단계 - TaskHandler를  UI 처리와 데이터 처리 클래스로 분리한다.
## 실습 소스 및 결과

- src/main/java/com/eomcs/pms/domain/Board.java 추가
- src/main/java/com/eomcs/pms/domain/Member.java 추가
- src/main/java/com/eomcs/pms/domain/Project.java 추가
- src/main/java/com/eomcs/pms/domain/Task.java 추가
- src/main/java/com/eomcs/pms/handler/MemberList.java 추가
- src/main/java/com/eomcs/pms/handler/BoardList.java 추가
- src/main/java/com/eomcs/pms/handler/ProjectList.java 추가
- src/main/java/com/eomcs/pms/handler/TaskList.java 추가
- src/main/java/com/eomcs/pms/handler/MemberHandler.java 변경
- src/main/java/com/eomcs/pms/handler/BoardHandler.java 변경
