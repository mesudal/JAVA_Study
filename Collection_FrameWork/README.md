# Collection_FrameWork, Wrapper Class에 대해 알아보기!

<h3>Wrapper Class</h3>
<ul>
  <li>Wrapper Class : 기본 자료형들의 클래스 타입</li>
  <li>Boxing 문법</li>
  <ul>
    <li>클래스타입 객체 = new 클래스타입(일반타입의 값); // boxing (권장x)</li>
    <li>클래스타입 객체 = 클래스타입.valueOf(일반타입의 값); // boxsing (권장사용)</li>
  </ul>
  <li>UnBoxing 문법</li>
  <ul>
    <li>일반타입 변수 = 객체.000Value(); // unboxing</li>
  </ul>
  <li>JDK4 버전 이상부터는 auto를 지원한다.</li>
    <ul>
      <li>오토박싱</li>
        <ul>
          <li>클래스타입 객체 = 일반타입의 값;</li>
        </ul>
      <li>오토언박싱</li>
        <ul>
          <li>일반타입 변수 = 객체;</li>
        </ul>
    </ul>
  <li>Wrapper Class 사용 문법</li>
  <pre><code>
  
  public class WrapperTest {
	  public static void main(String[] args) {
		  int data_i = 10;
  		int data_t = 30;
		
	  	// boxsing
      //		Integer data_I = new Integer(data_i);
  		Integer data_I = Integer.valueOf(data_i);
		
	  	// unboxing
		  data_i = data_I.intValue();
		
		
  		// auto boxing
	  	Integer data_T = data_i;
		  // auto unboxsing
  		data_t = data_T;
	  }
  }
</code></pre>
</ul>


<h3>Wrapper Class를 사용하는 이유</h3>
<ul>
   <li>원시타입(일반타입)을 박싱하면 다양한 메소드를 제공받을 수 있다. 여러 일반 타입을 하나의 타입으로 묶기 위해서는 반드시 클래스 타입(Wrapper Class)으로 사용해야 되고, 이 때에는 박싱을 해준다.</li>
</ul>


<h3>알고리즘</h3>
<ul>
  <li>알고리즘 : 어떤 문제가 발생되었을 때 해결할 수 있는 절차 혹은 순서</li>
</ul>


<h3>자료구조</h3>
<ul>
  <li>의미없는 데이터를 하나의 정보로 만들어주는 알고리즘들의 집합, 수집한 자료를 저장하는 방법</li>
</ul>


<h3>컬렉션 프레임워크</h3>
<ul>
  <li>많은 데이터를 쉽고 효과적으로 관리할 수 있는 표준화된 방법을 제공하는 클래스들의 집합</li>
  <li>자주 사용하는 자료구조</li>
    <ul>
      <li>List extends CollectionList extends Collection</li>
      <li>Set extends Collection</li>
      <li>Map</li>
    </ul>
</ul>


<h3>List extends CollectionList extends Collection</h3>
<ul>
  <li>List 구현 클래스</li>
    <ul>
      <li>Vector : 용량 관리, 보안성 강화, 처리량 감소</li>
      <li>LinkedList : FILO(=선입후출)으로 인해 넣을 때는 빨라도, 뺄 때에는 상대적으로 느리다.</li>
      <li>ArrayList : 배열의 특징인 인덱스를 이용하여 값을 저장하고 관리한다. 컬렉션 클래스 중에서 가장 많이 사용되는 클래스이다.</li>
    </ul>
  <li>배열과 ArrayList의 차이점</li>
    <ul>
      <li>배열은 길이에 제한을 두어야 할 때 자주 사용된다. (Ex : 100명의 회원정보만 받아라)</li>
      <li>ArrayList는 몇 개의데이터가 들어올지 알 수 없을 때 사용한다.</li>
    </ul>
</ul>


<h2>실습 파일은 아래 포스팅 참고...!</h2>
<a href="https://blog.naver.com/mesudal/222847817487">심화실습</a>
