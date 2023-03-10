# 변수, 자료형, 형변환, 입력의 기본


<h3>변수란?</h3>
<ul>
  <li>값을 저장할 수 있는 저장공간이다</li>
  <li>자료형이 있거나, 대입연산자가 있는 경우는 변수이다.</li>
  <ul>
    <li>Ex) int a;  => 정수형 자료형이 붙은 a이기 때문에 변수임을 알 수 있다.</li>
    <li>Ex) a = 3;  => 대입연산인 "="를 확인할 수 있기 때문에 변수임을 알 수 있다.</li>
  </ul>
</ul>

<h3>변수 안의 값이란?</h3>
<ul>
  <li>상수이며, 상수는 변하지 않는 값을 뜻한다.</li>
</ul>

<h3>변수는 어디에 저장이 될까?</h3>
<ul>
  <li>메모리에 할당이 되며, 휘발성을 갖고 있는 RAM에 저장이 된다.</li>
</ul>

  
<h3>변수의 선언 방법은?</h3>
<ul>
  <li>자료형 변수명 = 초기값;</li>
  <ul>
    <li>Ex) int x = 10;  -> x라는 이름의 저장공간이 할당되고, 그 안에는 10이 들어간다.</li>
  </ul>
  <li>초기값을 사용하는 이유는 이후 나오지만, 쓰레기값을 방지위함이다.</li>
</ul>

<h3>변수는 왜 사용할까?</h3>
<ul>
  <li>재사용을 위해 사용된다. 즉, 값을 수시로 넣고 빼고 자유자재로 하기 위해 사용한다.</li>
  <li>의미없는 값을 하나의 정보로 만들기 위해서 사용한다. (자료구조)</li>
</ul>

<h3>RAM이란?</h3>
<ul>
  <li>RAM은 컴퓨터의 메모리에 해당이 되며, 휘발성 하드웨어이다.</li>
  <ul>
    <li>휘발성 : 전기 공급이 끊기는 경우 사용했던 데이터들은 모두 날아감</li>
    <li>비휘발성 : 전기 공급이 끊겼다가 다시 공급되어도 저장된 데이터가 날아가지 않음</li>
  </ul>
  <li>휘발성과 비휘발성의 가장 큰 차이는 저장도 있지만, 속도에도 큰 차이가 있다. 데이터를 계속 저장하고 있지 않은 휘발성은 연산 속도가 매우 빠른 편에 속한다.</li>
</ul>

<h3>메모리(RAM)의 구조</h3>
<img src = 'https://postfiles.pstatic.net/MjAyMjA3MTRfMTAx/MDAxNjU3ODAwNDI0NTMz.6mLI6JiLotHT_-AcabrUSjIq84dGzq-_i-Ch7z_DSWAg.pqg7cJQlgVhC0b0k1nnbdj5YiyFNO_iENEPS0XGrW_kg.PNG.mesudal/SE-fe5b3b36-c2cb-4d68-89f7-611b515d9e7b.png?type=w773'>
  
  
<h3>주소값이란?</h3>
<ul>
  <li>x라는 이름의 저장공간이 RAM에 할당되면 고유한 값인 주소값이 부여된다. 계속 실행되거나 종료되는 프로그램이 있기 때문에, 주소값은 변경될 수 있으나 중복은 없다.</li>
</ul>


  
<h3>변수의 사용 구분</h3>
<pre><code>
  int data = 20; // 저장공간
  data = 30; // 저장공간
  System.out.print(data+9); // 값
  data = data + 7; // 저장공간, 값
  data-9; // 값
</code></pre>
  
<h3>변수 선언시 주의사항</h3>
<ul>
  <li>같은 이름의 변수로 선언할 수 없다.</li>
  <li>초기화를 해준다. (쓰레기값 방지를 위함)</li>
  <li>되도록 선언부에 한꺼번에 선언한다. (영역의 상단)</li>
</ul>
  
<h3>변수명 주의사항</h3>
<ul>
  <li>문자로 시작해야 한다. (좌에서 우로 읽기 때문)</li>
  <li>특수문자는 사용할 수 없다. 단, _는 허용.</li>
  <li>되도록 소문자만 사용한다.</li>
  <ul>
    <li>goodBoy[카멜 표기법, Java에서 주로 사용], good_boy[파스칼 표기법, DB에서 주로 사용]</li>
  </ul>
  <li>공백을 사용할 수 없다.</li>
  <li>되도록 한글을 사용하지 않는다.</li>
  <li>명사로 사용해야 한다.</li>
  <li>뜻이 있는 단어를 사용한다.</li>
</ul>
  
<h3>서식문자(format)란?</h3>
<ul>
  <li>반드시 쌍따옴표("") 안에서 작성해야 한다.</li>
  <ul>
    <li>%d : decimal(10진수 정수)</li>
    <li>%o : octal(8진수 정수)</li>
    <li>%x : hexadecimal(16진수 정수)</li>
    <li>%f : float(실수)</li>
    <li>%c : char(문자)</li>
    <li>%s : String(문자열)</li>
  </ul>
</ul>
  
<h3>출력 메소드 중 printf란?</h3>
<ul>
  <li>printf() : 서식문자를 사용하여 출력할 수 있으며, 자동으로 줄바꿈되지 않는다.</li>
  <ul><li>Ex) System.out.printf("안녕하세요 %s님, 반갑습니다.", name);</li></ul>
</ul>
  
<h3>상수란?</h3>
<ul>
  <li>항상 그대로인 수, 값을 변경할 수 없도록 한다. (고정)</li>
  <li>상수의 상수명은 무조건 대문자로 작성해야 한다.</li>
</ul>

<h3>형변환(Casting)이란?</h3>
<ul>
  <li>말그대로 Type을 변환한다는 의미이며, int -> double, char -> int 등으로 변환할 때 사용된다.</li>
  <li>자동 형변환 : 말그대로 따로 지정하지 않아도 결과가 자동적으로 형이 변환되는 것</li>
  <ul>
    <li>정수 + 정수 = 정수</li>
    <li>정수 + 실수 = 실수</li>
    <li>문자 + 정수 = 정수</li>
  </ul>
  <li>강제 형변환 : 값 앞에 변환할 자료형을 붙여줌으로써 강제적으로 형이 변환되게끔 하는 것</li>
  <ul>
    <li>(자료형)값</li>
    <li>Ex) (double)3</li>
  </ul>
</ul>

<h3>문자열 형변환하는 방법은?</h3>
<ul>
  <li>우선 문자열을 형변환하기 이전에 문자열은 Class 타입이라는 것을 잊으면 안 된다! 일반 자료형은 일반 자료형끼리 형변환이 가능하고, 문자열은 클래스 타입이기에 클래스 타입을 이용하여 형변환을 해야 한다.</li>
  <li>다른 자료형 -> 문자열</li>
  <ul>
    <li>문자열과 다른 일반 자료형을 연결하면 결과는 항상 문자열이 된다. (연결)</li>
    <li>Ex) System.out.println("안녕" + 1);  => 결과는 "안녕1"이 된다.</li>
  </ul>
  <li>문자열 -> 다른 자료형</li>
  <ul>
    <li>Integer.parseInt("");</li>
    <li>Float.parseFloat("");</li>
    <li>Double.parseDouble("");</li>
  </ul>
</ul>

<h3>입력이란?</h3>
<ul>
  <li>커서가 깜빡이고 있는 상태. 즉, 값을 입력받을 준비가 된 상태</li>
  <li>입력하기 전에 출력을 통해 어떤 값을 입력해야할 지 사용자에게 알려주어야 한다.</li>
</ul>

<h3>입력 클래스란?</h3>
<ul>
  <li>Scanner 클래스</li>
  <li>Scanner sc = new Scanner(System.in);</li>
</ul>

<h3>입력 메소드란?</h3>
<ul>
  <li>콘솔창에서 커서를 깜빡여주기 위해 사용. 즉, 입력상태를 만들기 위해 사용</li>
  <ul>
    <li>next() : 공백, 줄바꿈을 기준으로 구분하여 값을 저장한다.</li>
    <li>nextLine() : 공백, 줄바꿈 문자도 값으로 취급하기 때문에 그대로 값을 저장한다.</li>
  </ul>
</ul>

<h2>자세한 실습 코드는 아래 포스팅 참고</h3>
<a href="https://blog.naver.com/mesudal/222811450677">실습 포스팅</a>
