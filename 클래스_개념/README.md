# 클래스, 필드, 생성자, this, 다형성 기본 개념!


<h3>클래스란?</h3>
<ul>
  <li>클래스 : 공통적인 요소들을 집합해놓은 하나의 학급(반)이라고 생각하면 쉽다.</li>
  <li>자바에서는 공통적인 요소를 한 번만 선언해놓고 가져다 사용만 하도록 설계한다.</li>
  <li>또한, 클래스의 특징은 다음과 같다.</li>
  <ul>
    <li>Type이다.</li>
    <li>주어이다.</li>
  </ul>
</ul>



<h3>클래스 선언방법</h3>
<pre><code>
class 클래스명 {
    필드(변수, 메소드) // 필드는 전역변수로 이해하면 편함!
}
</code></pre>



<h3>클래스 필드 사용방법</h3>
<ul>
  <li>객체화(instance) : 객체(instance variable)를 만드는 작업, 추상적인 개념을 구체화시키는 작업</li>
  <li>static일 경우 클래스명으로 바로 접근 가능</li>
  <pre><code>
  클래스명 객체명 = new 생성자(); // 객체화(=instance) 과정
  // Ex) Car momCar = new Car();
  객체명.필드명 // .(마침표) : 하위 연산자, 멤버변수 접근 연산자, 닷 연산자, 점 연산자 등의 용어로 쓰임
  </code></pre>
</ul>



<h3>생성자란?</h3>
<ul>
  <li>생성자 : 클래스 이름 뒤에 소괄호가 있는 형태</li>
  <li>메소드와 기능은 똑같지만, 메소드라고 부르지 않고 생성자라고 따로 구분을 한다.</li>
  <li>생성자의 경우 return 기능이 없지만, 생성자의 주소값을 리턴한다.</li>
  <li>하지만, 메소드의 경우 return 기능이 있고, 메소드는 리턴값을 리턴한다.</li>
</ul>



<h3>기본 생성자란?</h3>
<ul>
  <li>따로 선언하지 않으면 자동으로 선언되며, 매개변수와 실행할 문장이 따로 없다.</li>
  <li>사용자가 직접 생성자를 선언하게 되면 기본 생성자는 없어진다.</li>
  <pre><code>
  class A {
	int data = 100;
	
	// A() {}가 생략된 상태
	
	void printData() {
      System.out.println(data);
    }
  }

  public class ClassTest {
    public static void main(String[] args) {
      A print = new A();
      System.out.println(print.data);
    }
  }
  </code></pre>
</ul>



<h3>생성자를 쓰는 이유</h3>
<ul>
  <li>해당 클래스의 필드를 메모리에 할당한 후 부여된 주소값을 가져온다.</li>
</ul>



<h3>this란?</h3>
<ul>
  <li>필드에 접근한 객체가 누구인지 알아야 해당 필드에 접근이 가능한데, 이 때 접근한 객체가 가지고 있닌 필드의 주소값을 this라는 변수에 자동으로 담긴다.</li>
  <pre><code>
  class A {
	int data;
	
	A(int data) {
		this.data = data; // 매개변수로 받은 data의 값을 data 필드 주소의 값으로 저장
    }
  }
  </code></pre>
</ul>



<h3>다형성(polymorphism)이란?</h3>
<ul>
  <li>다형성 : 이름은 같지만, 다양한 형태로 존재할 경우 구분이 가능하다.</li>
  <li>오버로딩(Overloading) : 매개변수의 개수 또는 타입이 다르면 동일한 이름으로 메소드로 선언할 수 있으며, 다형성 내에 형성이 되어 있다</li>
  <pre><code>
  // Car의 전역변수 = brand, color, price 

  Car(String brand, String color) {
      this.brand = brand;
      this.color = color;
  }

  // Ex) 오버로딩 : brand, color, price를 모두 쓰지 않고 price만 사용할 수도 있다.
  Car(int price) {
      this.price = price;
  }
  </code></pre>
</ul>

