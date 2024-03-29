// # 소스 파일과 컴파일 결과 파일을 분리하기
// - 메이븐(Maven)과 그레이들(Gradle) 빌드 도구에서 사용하는 자바 표준 디렉토리 구조로 소스를 관리한다.
// - 메이븐(60%)과 그레이들(19%)이 전세계 빌드 시장의 80% 정도 점유하고 있을 정도로 현업에서 많이 사용한다.
//   (Snyk & Java Magazine의 'JVM Ecosystem Report 2018')
// - 개발 도구에 상관없이 동일한 디렉토리 구조로 프로젝트 산출물을 관리하기 때문에 유지보수에 좋다.
// - 대부분의 자바 오픈 소스 프로젝트들도 이 디렉토리 구조를 따르고 있다.
//
// ## 폴더 구조
// 프로젝트 폴더
// └── src
//     └── main  <-- 자바 애플리테이션 관련 파일을 두는 폴더
//         └── java       <-- 자바 애플리테이션 소스 파일을 두는 폴더
//         └── resources  <-- 애플리케이션을 실행하는 동안 사용할 파일을 두는 폴더
//         └── webapp     <-- 자바 웹 애플리케이션 리소스 파일(HTML, CSS, JavaScript 등)을 두는 폴더
//     └── test  <-- 단위 테스트 소스 파일을 두는 폴더
//         └── java       <-- 단위 테스트 할 때 사용할 파일을 두는 폴더
//         └── resources  <-- 단위 테스트를 실행하는 동안 사용할 파일을 두는 폴더
// └── build  <-- gradle 빌드의 실행 결과를 두는 폴더
// └── bin    <-- 개발 도구에 따라 이 이름의 폴더에 컴파일 결과 파일을 두기도 한다.
//     └── main <-- src/main 의 빌드 결과 파일을 두는 폴더
//     └── test <-- src/test 의 빌드 결과 파일을 두는 폴더
// └── out  <-- 개발 도구에 따라 이 이름의 폴더에 컴파일 결과 파일을 두기도 한다.
//

class Hello2 {
  public static void main(String[] args) {
    System.out.println("Hello, world!");
    byte b = 3;
    char c = '';
    //        char answer ='no';
    //        float f = 3.14;
    double d = 1.4e3f;

    System.out.println(b);
    System.out.println(c);
    //    System.out.println(answer);
    //    System.out.println(f);
    System.out.println(d);
  }
}

// ## 실습
// 1) 소스 디렉토리 생성
// - /src/main/java 폴더를 생성한다.
//
// 2) 소스 파일 생성
// - /src/main/java 폴더에 Hello2.java 파일을 작성한다.
//
// 3) 컴파일하기
// - 프로젝트 폴더에서 컴파일 할 때:
// 예) $ javac src/main/java/Hello2.java
// - 클래스 파일은 소스 파일이 있는 폴더에 생성된다.
// 예) /src/main/java/Hello2.class
//
// 3) 컴파일 하기2
// - 컴파일러가 생성한 파일을 소스 파일과 분리하여 관리하기
// - 프로젝트 폴더에서 컴파일 할 때:
// javac -d [컴파일 결과 파일을 둘 디렉토리 경로] [소스파일명]
// 예) $ javac -d bin/main src/main/java/Hello2.java
// - 클래스 파일은 컴파일 할 때 지정한 폴더에 생성된다.
// 예) /bin/main/Hello2.class
//
// 4) 실행하기
// - 프로젝트 폴더에서 실행 할 때:
// java -classpath [클래스가 있는 디렉토리 경로] 클래스이름
// java -cp [클래스가 있는 디렉토리 경로] 클래스이름
// 예) $ java -cp bin/main Hello2
//
