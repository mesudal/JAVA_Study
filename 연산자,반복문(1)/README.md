# 연산자, 비트 연산, 조건식, 삼항 연산, 제어문, 조건문, 반복문 기본 이해

<h3>연산자란?</h3>
<ul>
  <li>기능이 있는 특수문자</li>
</ul>


<h3>연산자의 우선순위?</h3>
<ul>
  <li>연산자의 우선순위는 아래와 같은 순서로 진행되며, 암기를 하면 좋다.</li>
  <ul>
    <li>최 : 최우선 연산자</li>
    <li>단 : 단항 연산자</li>
    <li>산 : 산술 연산자</li>
    <li>쉬 : 쉬프트 연산자</li>
    <li>관 : 관계 연산자</li>
    <li>리 : 논리 연산자</li>
    <li>삼 : 삼항 연산자</li>
    <li>대 : 대입 연산자</li>
  </ul>
</ul>


<h3>결합성이란?</h3>
<ul>
  <li>하나의 수식에 동일한 연산자가 여러 개 사용되면 알맞은 방향으로 결합되어 연산되는 성질</li>
  <li></li>
</ul>


<h3>비트 연산이란?</h3>
<ul>
  <li>논리 연산자</li>
    <ul>
      <li>& (AND, 논리곱) : 두 비트 모두 1인 경우 1</li>
      <li>| (OR, 논리합) : 두 비트 중 하나라도 1인 경우 1</li>
      <li>^ (XOR, 베타논리합) : 두 비트가 서로 다른 경우 1</li>
    </ul>
  <li>단항 연산자</li>
     <ul>
      <li>~ (NOT, 논리부정) : 모든 값을 반대로 한다.</li>
      <li>가장 왼쪽에 있는 숫자를 최상위 비트라고 하며, 0일 경우 양수, 1일 경우 음수</li>
      <li>음수 : ~a = -a - 1</li>
    </ul>
  <li>쉬프트 연산자(이동)</li>
    <ul>
      <li><< (LEFT SHIFT, 좌쉬프트) : A를 왼쪽으로 B만큼 이동해라( A << B )</li>
      <li>>> (RIGHT SHIFT, 우쉬프트) : A를 오른쪽으로 B만큼 이동해라( A >> B )</li>
    </ul>
</ul>


<h3>조건식이란?</h3>
<ul>
  <li>결과가 참 또는 거짓, 둘 중 하나가 나오는 식</li>
  <ul>
    <li>관계 연산자</li>
      <ul>
        <li>== : 같다</li>
        <li>!= : 같지 않다</li>
        <li>>, < : 초과, 미만</li>
        <li>>=, <= : 이상, 이하</li>
      </ul>
    <li>논리 연산자</li>
      <ul>
        <li>&& : 두 조건식 모두 참이면 참( A && B )</li>
        <li>|| : 둘 중 하나라도 참이면 참 ( A || B )</li>
      </ul>
    <li>단항 연산자</li>
      <ul>
        <li>! : 조건식이 참이면 거짓으로, 거짓이면 참으로 변경( !A )</li>
      </ul>
  </ul>
</ul>


<h3>삼항 연산자 (  : ? ) : 값으로 봐야 한다!</h3>
<ul>
  <li>조건식 ? 참 : 거짓</li>
  <li>단, 참과 거짓 자리에는 값만 작성할 수 있다.</li>
  <li>삼항연산을 볼 때는 조건식을 끊어서 이해해야 한다.</li>
  <li>Ex) 10 > 9 ? 10 : 9;   ->   결과값은 10</li>
  <li>Ex ) int data = 10 > 9 ? 10 : 9;</li>
</ul>


<h3>논리형(boolean)이란?</h3>
<ul>
  <li>자료형에 해당하며, 참과 거짓으로 구분이 된다.</li>
  <li>boolean의 초기값은 false이다.</li>
  <li>논리형은 boolean으로 사용되며, 1byte | true, false로 구분된다.</li>
</ul>


<h3>논리형은 왜 byte를 사용할까?</h3>
<ul>
  <li>정보 하나를 저장하기 위한 최소 단위는 byte이며, 논리형의 경우 정보를 저장해야 하기 때문에 bit가 아닌 byte를 사용한다.</li>
</ul>


<h3>삼항 연산자, if문, switch문의 비교</h3>
<ul>
  <li>삼항 연산자 : 조건식이 1개 있을 경우 사용</li>
  <li>if문 : 조건식에 비교(>, <, >=, <=) 연산자를 사용하거나, 여러 개의 조건식을 논리 연산자(&&, ||)로 연결할 때 사용</li>
  <li>switch문 : 하나의 변수에 여러 개의 값이 담길 수 있고, 각 값이 같은 지를 비교할 때 사용</li>
  <li></li>
</ul>


<h3>대입 연산자</h3>
<ul>
  <li>대입 연산자는 기존 변수에 값을 더하거나 뺀 값을 저장하기 위해 사용되는 것으로, 다음과 같이 작성할 수 있다.</li>
  <ul>
    <li>+=</li>
    <li>-=</li>
    <li>/=</li>
    <li>*=</li>
    <li>%=</li>
  </ul>
</ul>


<h3>증감 연산자</h3>
<ul>
  <li>증감 연산자는 값이 1씩 증가하거나, 감소할 때 간단하게 사용이 가능하다.</li>
  <li>전위와 후위로 구분되며, 전위는 변수 앞에, 후위는 변수 뒤에 작성된다.</li>
  <li>전위형  : 해당 라인부터 바로 적용</li>
  <li>후위형 : 다음 라인부터 적용</li>
</ul>


<h3>제어문이란?</h3>
<ul>
  <li>if문 : 조건식 결과가 true인 경우 중괄호{ } 안에 있는 코드가 실행된다.</li>
  <pre><code>
  // if의 경우 괄호 안에 있는 조건식을 모두 확인해야 한다.
  // 첫 번째 if문의 조건을 충족시켜도 다음 if문은 검사를 계속 진행한다.

  if(조건식) {
      실행할 문장;
  }
  if(조건식) {
      실행할 문장;
  }
  if(조건식) {
      실행할 문장;
  }
  </code></pre>
  
  <pre><code>
  // else는 부정을 의미하며, 가장 첫 번째 조건이 충족되지 않을 경우 else if 조건을 확인하고,
  // 또 조건이 충족되지 않을 경우 else로 넘어간다. else는 나머지 모든 조건을 의미한다.
  // 하지만! 가장 첫 번째 조건문인 if에서 조건을 충족할 경우 아래에 있는 조건문은 스킵한다.

  if(조건식) {
      실행할 문장;
  }
  else if(조건식) {
      실행할 문장;
  }
  else {
      실행할 문장;
  }
  </code></pre>
  <li>if문을 활용한 코드</li>
  <pre><code>
  public class IfTask {
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

      // 보기를 위한 Msg
      String msg = "보기 중 선택하세요.(1~4)";
      String choiceMsg = "1. 빨간색\n2.노란색\n3.검정색\n4.흰색", result = "";

      System.out.println(msg + "\n" + choiceMsg);
      choice = sc.nextInt();

      // 입력한 값이 1~4인지 확인
      check = choice > 0 && choice < 5;

      // 강사님이 설명해준 삼항 연산자
      if(choice == 1) {
        result = red;
      } else if(choice == 2) {
        result = yellow;
      } else if(choice == 3) {
        result = black;
      } else if (choice == 4) {
        result = white;
      } else {
        result = "값을 잘못입력하셨습니다. 1~4 사이의 숫자를 입력해주세요.";
      }
      System.out.println(result);
    }
  }
  </code></pre>
  <li>switch 조건문</li>
  <ul>
    <li>괄호 안에 있는 변수명이 값1, 값2, 값3, ...과 일치할 경우 일치하는 값의 코드를 실행한다. 최종적으로 어느 값에도 포함되지 않을 때는 default 문장이 실행된다.</li>
    <li>그리고! 원하는 값에 실행할 문장이 정상적으로 실행이 되었다면 break를 통해 탈출을 해야 한다.</li>
    <pre><code>
    switch(변수명) {
    case 값1:
          실행할 문장;
          break;
    case 값2:
          실행할 문장;
          break;
    case 값3:
          실행할 문장;
          break;
    case 값4:
          실행할 문장;
          break;
  ...
    default:
          실행할 문장;
          break;
  }
  </code></pre>
  </ul>
  <li>switch문을 활용한 코드</li>
  <pre><code>
    public class IfTask {
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

        // 보기를 위한 Msg
        String msg = "보기 중 선택하세요.(1~4)";
        String choiceMsg = "1. 빨간색\n2.노란색\n3.검정색\n4.흰색", result = "";

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
        default:
          result = "값을 잘못입력하셨습니다. 1~4 사이의 숫자를 입력해주세요.";
        }
        System.out.println(result);
      }
    }
  </code></pre>
  <li>반복문</li>
    <ul><li>for문 : 초기식은 말그대로 시작지점이고, 조건식은 언제까지 반복할지 도착지점이다. 증감식은 초기식에서 설정한 시작지점이 몇씩 증가를 하여 도착지점까지 갈 것인지 설정하는 것이다.</li></ul>
    <pre><code>
    for(초기식; 조건식; 증감식) {
      실행할 문장;
    }
    </pre></code>
</ul>


<h3>좀 더 자세한 실습 풀이는 아래 포스팅을 참고해주세요</h3>
<a href="https://blog.naver.com/mesudal/222812905748">포스팅 링크</a>
