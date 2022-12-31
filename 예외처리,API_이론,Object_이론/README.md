# 예외처리, API, Object, toString 개념


<h3>예외 처리</h3>
<ul>
  <li>예외처리를 공부하기 전 에러와 예외의 구분을 좀 이해해야 한다.</li>
  <ul>
    <li>에러 : 심각한 오류</li>
    <li>예외 : 덜 심각한 오류</li>
  </ul>
  <li>예외는 발생이 되는 순간 생성자를 호출한다 -> 생성자가 생기면 필드가 메모리에 할당이 되는데, 할당받을 주소가 없는 경우 강제 종료가 된다.</li>
</ul>



<h3>예외 처리 문법</h3>
<pre><code>
try {
    // 오류가 생길 수도 있는 문장을 작성
} catch(예외이름 객체명) { // 예외 이름은 클래스
    // 예외 발생 시 실행할 문장
    // 예외 발생 시 해외 예외 필드가 메모리에 할당된다.
    // 할당된 주소를 선언한 객체로 받지 못한다면 프로그램이 강제 종료된다.
    // 이를 막기 위해 동일한 예외 타입의 객체를 catch문 안에 선언하여 전달되는 주소를 잡아준다.
    // 해당 예외 주소가 담긴 catch문의 문장이 실행된다.
} catch(예외이름 객체명) {
    // 예외 발생 시 실행할 문장
} ... {
  ...
} finally {
    // 예외 발생 여부에 상관없이 무조건 실행할 문장
    // try로 외부 장치와 연결을 했다면, 다시 닫을 때 주로 사용한다.
}
</code></pre>



<h3>예외처리 활용 예제</h3>
<pre><code>
package exception;

import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
		// 5개의 정수만 입력받기
		// - 무한 입력 상태로 구현
		// - q 입력 시 나가기
		// - 5개의 정수는 배열에 담기
		// - if문은 딱 한 번만 사용
		
		Scanner sc = new Scanner(System.in);
		int arrData[] = new int[5];
		String msg = "번재 정수 : ", temp = null;
		int cnt = 0;
		
		while(true) {
			System.out.println(++cnt + msg);
			temp = sc.next();
			
			if(temp.equals("q")) {break;}
			
			try {
				arrData[cnt-1] = Integer.parseInt(temp);
			} catch (NumberFormatException e) { // 정수 외에 다른걸 입력했을 때
				System.out.println("숫자만 입력하세요.");
				cnt --; // 1회 차감
				
			} catch (ArrayIndexOutOfBoundsException e) { // 배열의 길이를 6 초과했을 경우
				System.out.println("5개만 입력 가능합니다.");
				
				for (int i = 0; i < arrData.length; i++) {
					System.out.println(arrData[i] + " ");
				}
				break;
				
			} catch(Exception e) { // 그 외에 모든 오류
				System.out.println("예측할 수 없는 오류입니다.");
				cnt --;
			}
		}
	}
}
</code></pre>



<h3>API(Application Programming Interface)</h3>
<ul>
  <li>개발에 필요한 라이브러리들의 집합이다. 즉, 기업 혹은 다른 개발자들이 미리 만들어놓은 소스코드이다.</li>
  <li>다른 사람 혹은 기업이 만든 API에 대해 공부를 하기 위해서는 해당 개발자가 만들어놓은 API 문서(API Documents)를 확인해야 한다.</li>
  <li>API에는 2가지의 종류가 있다.</li>
  <ul>
    <li>내부 API</li>
      <ul>
        <li>JDK 설치시 제공해주는 기본 API</li>
        <li>docs.oracle.com/javase (API 문서)</li>
      </ul>
    <li>외부 API</li>
      <ul><li>선배 개발자들이 개발한 패키지 및 클래스들을 의미하며, 보통 JAR파일(=짜르파일)로 배포하며 자바 프로젝트의 buildPath에 추가하여 사용할 수 있다.</li></ul>
  </ul>
  <li>외부 API 짜르파일 프로젝트에 추가하는 방법</li>
  <pre><code>
  JAR 파일로 배포하기
   배포할 클래스 또는 패키지 우클릭
   > Export > JAVA/JAR file 선택 > Next
   > destination을 원하는 경로로 선택
   > Export Java source files... 체크
   > Finish

  JAR 파일을 프로젝트에 추가하기
     배포된 JAR파일을 다운 받기
     > 프로젝트 우클릭 > Build Path > Configure Build Path
     > Libraries 탭 클릭 > ClassPath(안되면 ModulePath) 클릭 > Add External JARs
     > 저장된 경로의 .jar파일을 더블 클릭으로 추가 > Apply 클릭
     > Orders and Exports 탭 클릭
     > Select All 클릭 > Apply and Close
  </code></pre>
</ul>



<h3>Object(최상위 부모 클래스)</h3>
<ul>
  <li>모든 클래스는 자동으로 Object 상속을 받는다</li>
  <li>toString()</li>
    <ul><li>항상 객체명을 출력할 때에는 toString()이 생략되어 있다. toString()을 통해 출력되는 문자열이 마음에 들지 않는다면, 재정의하여 수정하도록 한다. 실무에서는 클래스 선언 시 각 필드의 초기화 여부를 확인하기 위해 toString을 재정의하여 사용한다.</li></ul>
  <li>equals()</li>
    <ul>
      <li>주소값 비교(==), 값 비교(.equals)</li>
      <li>String 클래스에서 equals를 값 비교로 재정의하여 사용하기 때문에, 문자열 비교는 무조건 equals()로 비교한다.</li>
    </ul>
  <li>hashCode()</li>
    <ul>
      <li>JVM에서 관리하는 중복없는 값. 실제 메모리에 할당되는 주소와 다르다.</li>
      <li>실제 메모리에 부여되기 전까지 임시로 사용할 주소이다.</li>
      <li>String 클래스에서는 필드의 해시코드값이 아닌 필드 안에 있는 문자열 상수값의 해시코드값을 리턴하도록 재정의하였다.</li>
    </ul>
</ul>
