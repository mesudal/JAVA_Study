# 상속, super, 다형성, Casting에 대하여

<h3>상속(inheritance)이란?</h3>
<ul>
  <li>기존에 선언된 클래스의 필드를 새롭게 만들 클래스의 필드로 사용하고자 할 때</li>
  <li>여러 클래스 선언 시 필드가 겹치는 경우, 부모 클래스를 먼저 선언하고 공통 필드를 묶어서 자식 클래스들에게 상속해준다.</li>
</ul>



<h3>상속 문법</h3>
<pre><code>
  class 자식 extends 부모 {
      필드
  }

  class A {
      A 필드
  }

  class B extends A { // B 클래스에 이미 만들어져 있는 A 클래스로부터 상속받는다
      A 필드 // 보이지는 않지만, A 클래스 안에 있는 필드가 상속되어 옴
      B 필드 // 기존 A 필드에 B 필드를 추가
  }
</code></pre>



<h3>상속의 용어</h3>
<ul>
  <li>부모 클래스 : 상위 클래스, 슈퍼 클래스, 기반 클래스</li>
  <li>자식 클래스 : 하위 클래스, 서브 클래스, 파생 클래스</li>
</ul>



<h3>super()란?</h3>
<ul>
  <li>super() : 부모 클래스 생성자이며, 자식 클래스(B) 타입의 객체로 부모(A)필드에 접근할 수 있다. 하지만 자식 생성자만 호출하기 때문에, 자식 필드만 메모리에 할당된다고 생각할 수 있다. 사실 자식 생성자에는 항상 부모 생성자를 호출하기 때문에 자식 생성자 호출 시 부모와 자식 필드 모두 메모리에 할당된다. 이 때 부모 생성자를 호출하는 방법은 super()를 사용하는 것이다.</li>
  <li>만약 상속받은 자식 클래스에 생성자를 만들 때 super()를 따로 작성하지 않더라도 컴파일러가 자동적으로 생성한다.</li>
</ul>



<h3>다형성(polymorphism)</h3>
<ul>
  <li>오버로딩 : 새로운 메소드를 정의</li>
  <li>오버라이딩(재정의)</li>
  <ul>
    <li>부모 필드에서 선언한 메소드를 자식 필드에서 수정하고자할 때 재정의가 필요하다. 이는 자식에서 부모 필드의 메소드와 동일한 이름으로 선언하는 것이다. 부모 필드가 메모리에 먼저 할당되고, a라는 메소드가 먼저 올라간다고 하면 자식 필드가 메모리에 할당되면서 재정의한 a메소드가 새롭게 만들어지는 것이 아니라 기존에 할당된 a메소드 저장공간에 새롭게 재정의한 자식 필드의 소스코드 주소가 들어가게 된다. 따라서 자식 객체 a메소드에 접근하면 자식 필드에서 재정의한 소스코드의 내용이 읽히게 된다.</li>
    <li>오버라이딩을 배운 순간부터 메소드는 저장공간으로 본다.</li>
    <ul>
      <li>메소드는 return을 만나는 순간 값으로 변하며, return이 없는 경우 저장공간이 된다.</li>
      <li>오버로딩과 오버라이딩을 한 예시코드</li>
      <pre><code>
      class Parent {
    void display() {
    System.out.println("부모 클래스의 display() 메소드입니다.");
  }
}

class Child extends Parent {
    // 오버라이딩된 display() 메소드
    void display() {
    System.out.println("자식 클래스의 display() 메소드입니다.");
  }
    // 오버로딩된 display(매개변수) 메소드
    void display(String str) {
    System.out.println(str);
  }
}

public class Inheritance {
  public static void main(String[] args) {
    Child ch = new Child();
    ch.display();
    ch.display("새롭게 오버로딩된 display() 메소드입니다.");
  }
}
      </code></pre>
    </ul>
  </ul>
</ul>



<h3>Storage class(저장 기억 부류)란?</h3>
<ul>
  <li>전역변수 : 생성자를 통해 메모리에 할당되며, 객체가 각각 가지고 있는 변수</li>
  <li>static 변수(정적변수) : 컴파일러를 통해 메모리에 1개 할당되며, 모든 객체가 공유하는 변수</li>
  <ul><li>Ex) A라는 회사의 매출, 자동차 속도제한(80km) 등등..</li></ul>
  <li>static은 컴파일러가 직접 메모리에 할당을 해주기 때문에 new의 영향을 받지 않는다.</li>
</ul>



<h3>접근 권한 제어자(접근자)</h3>
<ul>
  <li>dafault : 다른 패키지에서 접근 불가</li>
  <li>public : 모든 곳에서 접근 가능, 해당 파일의 메인 클래스일 경우만 사용</li>
  <li>protected : 다른 패키지에서 접근 불가, 자식은 가능</li>
  <li>private : 다른 클래스에서 접근 불가, 메소드로만 접근하자! </li>
  <ul><li>이후 JSP를 배울 때 private를 사용하게 되는데 이럴 때, getter & setter 메소드를 사용해야 한다.</li></ul>
</ul>



<h3>Casting(어려움)</h3>
<ul>
  <li>up casting : 자식 값을 부모 타입으로 형변환</li>
  <li>down casting : up casting된 객체를 자식 타입으로 형변환</li>
  <img src="https://postfiles.pstatic.net/MjAyMjA4MDhfNjYg/MDAxNjU5OTM5MzI4MzUw.nJUkiUt3QtJQeKNu1K2XQU7UJJRP8Hpwa7LKWr6C664g.hCUW1R3jrAHdJZ_SkfLjnromveu2vXal9vxLLH9hz7cg.PNG.mesudal/SE-9fdee941-8606-4c9f-9b19-13081f811c9a.png?type=w773">
  <li>위 이미지에서 A a = new B();는 up casting이다</li>
  <li>위 이미지에서 B b = (B)a; 는 B타입으로 a를 형변환해줬기 때문에 down casting이다.</li>
  <li>B b = (B) A()를 할 경우 A가 B로 형변환은 되지만, 할당량이 안 되기 때문에 오류이다.</li>
</ul>



<h3>Cating을 사용하는 이유</h3>
<ul>
  <li>모든 자식 값을 전달받기 위해서는 동일한 타입의 저장공간으로 받아야 한다. 하지만 자식끼리는 서로 타입이 다르기 때문에 한 번에 전달받을 수 없다. 이 때 up casting을 사용하면, 모든 자식이 부모 타입이므로 하나의 저장공간에 모든 자식을 받을 수 있게 된다. 만약 up casting으로 자식 값을 전달받았다면, 자식에서 새롭게 구현한 기능들은 사용할 수 없기 때문에 down casting을 통해서 복구하고 사용한다.</li>
</ul>



<h3>객체 간 타입 비교(instacneof)</h3>
<ul>
  <li>a instanceof A : 조건식, 참 또는 거짓 중 하나가 나오는 식</li>
  <ul><li>a가 A 타입이면 true, a가 A 타입이 아니면 false</li></ul>
</ul>


<h3>Casting을 활용한 예제 코드</h3>
<pre><code>
  class Netflix {}

class Anime extends Netflix{
	void sub() {
		System.out.println("자막 지원");
	}
}

class Movie extends Netflix{
	void fourD() {
		System.out.println("4D 지원");
	}
}

class Drama extends Netflix{
	void goods() {
		System.out.println("굿즈 판매");
	}
}

public class CastingTask {
	//	넷플릭스
	//	애니메이션, 영화, 드라마 클래스 선언
	//	사용자가 선택한 영상이
	//	애니메이션이라면 "자막지원"기능 사용
	//	영화라면 "4D"기능 사용
	//	드라마라면 "굿즈"기능 사용
	public void check(Netflix netflix) {
		if(netflix instanceof Anime) { // 메인 클래스에서 매개변수에 Anime를 넣었을 때, netflix 객체가 Anime 클래스 타입인지 확인 => up casting
			Anime ani = (Anime) netflix; // netflix 클래스를 Anime 클래스 타입으로 바꿔주어, Anime의 기존 할당량을 사용할 수 있게 한다 => down casting
			ani.sub(); 
		} else if(netflix instanceof Movie) {
			Movie movie = (Movie) netflix;
			movie.fourD();
		} else {
			Drama drama = (Drama) netflix;
			drama.goods();
		}
	}
	
	public static void main(String[] args) {
		CastingTask ct = new CastingTask();
		
		ct.check(new Anime()); // check 메소드에 매개변수로 Anime를 넣어 조건문에 따른 결과 출력
		ct.check(new Movie());
		ct.check(new Drama());
	}
}
</code></pre>
