# while문, 기타제어문, 배열 기본

<h3>while문이란?</h3>
<ul>
  <li>앞에서 배운 for문의 경우 몇 번 반복이 될지 정확히 알 경우 사용하면 좋고, 몇 번 반복할지 불확실한 경우는 while문을 사용하게 된다.</li>
  <li>while문의 문장은 아래와 같이 구성이 된다.</li>
    <pre><code>
      while(조건식) {
      실행할 문장;
      }
    </code></pre>
  <li>이전에 작성했던 성격유형 검사 프로그램을 입력한 정수에 따라 결과가 출력이 되는데, while을 통해 무한반복을 해보도록 하자. 단, 5번을 입력할 경우 프로그램은 종료되어야 한다.</li>
    <pre><code>
    package controlTest;

    import java.util.Scanner;

    public class WhileTask {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자의 선택을 저장한 변수
        int choice = 0;

        // 양수의 경우만 기입 가능
        boolean check = false;

        // 색상에 대한 설명
        String red = "빨간색 : 불같고 열정적이고 적극적이다.";
        String yellow = "노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.";
        String black = "검정색 : 묵묵하고 든든하고 냉철하고 멋지다.";
        String white = "하얀색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
        String exit = "프로그램을 정상적으로 종료하였습니다.";

        // 보기를 위한 Msg
        String msg = "보기 중 선택하세요.(1~4)";
        String choiceMsg = "1.빨간색\n2.노란색\n3.검정색\n4.흰색\n5.나가기", result = "";

        while(choice != 5) {
          System.out.println(msg + "\n" + choiceMsg);
          choice = sc.nextInt();

          // 입력한 값이 1~4인지 확인
          check = choice > 0 && choice < 5;

          switch(choice) {
          case 1:
            result = red;
            break;
          case 2:
            result = yellow;
            break;
          case 3:
            result = black;
            break;
          case 4:
            result = white;
            break;
          case 5:
            result = exit;
            break;
          default:
            result = "값을 잘못입력하셨습니다. 1~4 사이의 숫자를 입력해주세요.";
          }

          System.out.println(result);
        }
      }
    }
  </code></pre>
</ul>



<h3>do~while문</h3>
<ul>
  <li>do~while문의 문장구성은 다음과 같다.</li>
  <li>do의 경우 while문을 실행하기 전, 무조건적으로 1번은 실행을 해라! 라는 역할을 한다.</li>
  <pre><code>
      do {
        실행할 문장;
      }while(조건식);
  </code></pre>
  <li>while문을 사용하다보면 아래와 같이 변수에 초기값을 주고, 0을 입력했을 시 종료 등의 기능을 만들 때가 있다. 초기값을 0으로 두었기 때문에 해당 프로그램은 바로 종료가 된다. 그런 경우 바로        do~while문을 사용하게 된다.</li>
  <pre><code>
    package controlTest;

    import java.util.Scanner;

    public class DoWhileTest {
      public static void main(String[] args) {
        String msg = "1. 통신요금 조회\n2. 번호이동\n3. 분실신고\n0. 상담원 연결";
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do{
          System.out.println(msg);
          choice = sc.nextInt();
        } while(choice != 0);
      }
    }
  </code></pre>
</ul>



<h3>기타제어문이란?</h3>
<ul>
  <li>기타제어문은 반복문과 조건문을 제어하기 위한 목적으로 사용이 된다.</li>
    <ul>
      <li>break : 즉시 해당 중괄호 영역을 탈출</li>
      <pre><code>
        // 1~10까지 중 4까지만 출력
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
            if(i == 4) {
                break;
            }
        }
      </code></pre>
    </ul>
    <ul>
      <li>continue : 즉시 다음 반복(스킵 역할)</li>
      <pre><code>
        //		1~10까지 중 3을 제외하고 출력
        for(int i = 1; i <= 10; i++) {
            if(i == 3) {
                continue;
            }
            System.out.println(i);
            }
        }
      </code></pre>
    </ul>
</ul>



<h3>배열이란?</h3>
<ul>
  <li>배열을 사용하는 이유는 다음과 같다.</li>
    <ul>
      <li>변수를 여러 개 선언하면 다양한 이름을 가진 변수가 선언이 된다. 이런 경우 각 변수명에 맞는 저장공간을 관리하기가 불편하다. 그런데 배열을 사용하게 되면 하나의 이름에 여러 개의 값을 저장할         수 있다.</li>
      <li>규칙성이 없는 값에 규칙성을 부여하기 위해서도 사용이 된다.</li>
    </ul>
  <li>C언어에서는 포인터를 통해 배열 주소값에 접근이 가능하지만, 자바에서는 ar[index]를 하게 되면 해당 배열의 값을 가져올 수 있다.</li>
  <li>new ... 으로 선언을 하게 되면 동적 메모리(Heap)에 저장이 되며, 초기값으로 자동 초기화가 된다. 사용 중 유동적으로 값이나 길이를 변경할 수 있다. (배열 또한 new ...으로 선언)</li>
  <li>null의 경우 주소의 초기값이며, 어떤 주소를 넣을지 모를 때 작성하는 초기값이다.</li>
  <li>메모리상 자바에서는 동적 배열만 존재한다.</li>
  <img src = "https://postfiles.pstatic.net/MjAyMjA4MDFfMTk1/MDAxNjU5MzE3OTk1Mjgx.qGoyshiFvGKlmzOTflFVNGqKLggKsfh162kINkfvcG8g.HUqdHKrlrNiKryLIqIqtGS_cNkO6vlR-0dt6r0Y4uw0g.PNG.mesudal/SE-19657f7e-6482-49a9-b17c-94d4d800e03e.png?type=w773">
  <li>배열의 선언 방법</li>
  <pre><code>
    /* 저장할 값을 정확히 알고 있을 때 사용 */
    // ex) "1~10까지 숫자 중 홀수만 저장하세요" 등등
    자료형 배열명[] = {값1, 값2, 값3, ...};

    /* 저장할 칸수는 정확히 알고 있지만, 어떤 값을 저장할지 모를 때 사용 */
    // ex) "1~10까지 숫자 중 5개 랜덤하게 저장하세요" 등등
    자료형 배열명[] = new 자료형[칸수]; 

    /* 어떤 값을 넣을지도, 몇 칸 만들지도 모를 때 사용(주소의 초기값) */
    // ex) "값을 입력받을 때마다 배열에 저장하세요" 등등
    자료형 배열명[] = null;
            ↓
    배열명 = new 자료형[칸수]; // 배열의 길이를 알게 되는 경우 다시 선언
  </code></pre>
</ul>



<h3>배열의 구조</h3>
<ul>
  <li>배열의 문장구조는 아래와 같다.</li>
  <code>int arrData[] = {3, 5, 9, 6, 7};</code>
  <li>위 문장을 보게 되면 arData라는 이름의 저장공간은 한 개 만들어지며, 여기에는 한 개의 값만 담을 수 있다. 5개의 값을 담기 위해서는 5칸이 필요하며, 이는 Heap에 할당된다. 5칸의 저장공간 중 첫 번째 저장공간의 주소값이 arData 저장공간으로 들어가며, 다음 주소에 접근하기 위해서는 +n을 한다. 예를 들어, arData + 2는 9라는 값이 담긴 저장소의 주소값이 되며, *(arData + 2)는 해당 주소에 가서 읽어온 9라는 값이 된다. JAVA에서는 직접 주소에 접근하는 연산자가 없기 때문에 위와 같은 식을 []로 치환하여 사용하며, arData[2]로 사용한다. 각각의 방 번호는 index라고 부르며, 배열은 시작주소를 가지고 있기 때문에 인덱스 번호는 항상 0부터 시작된다.</li>
  <li>length는 배열을 선언하면 자동적으로 상수가 선언이 되는데, 해당 배열의 길이가 저장이 된다.</li>
</ul>



<h3>오늘 배운 내용 요약</h3>
<ul>
  <li>for문과 while문의 가장 큰 차이는 반복횟수를 정확히 아냐, 모르냐에 따라 사용 용도가 달라진다.</li>
  <li>do~while의 경우 while문에서 발생할 수 있는 사항을 미리 대비하여 무조건적으로 1번 실행하게끔 함</li>
  <li>기타제어문에는 2종류가 있는데, break와 continue로 구분된다.</li>
  <li>배열은 하나의 이름에 다양한 값을 저장하기 위해 사용되며, 이름을 가진 배열 안에 다양한 값을 저장할 수 있다.</li>
  <li>JAVA에서 배열은 Heap인 동적 메모리에만 존재한다.</li>
</ul>



<h2></h2>
<a href = "https://blog.naver.com/mesudal/222836856594">배열 실습</a>
