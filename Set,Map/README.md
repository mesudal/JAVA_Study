# Set(HashSet), Map(HashMap)에 대한 공부

<h3>Set</h3>
<ul>
  <li>쉽게 설명하면 Set은 집합으로 볼 수 있다. 수학에서 집합을 배울 때 {원소}로 가정을 하였을 때 중복되는 값을 저장할 수 없기 때문에 Set의 성질과 동일하다.</li>
  <li>Set의 구현 클래스</li>
  <ul>
  <li>HashSet : 집합에서는 중복되는 원소를 포함할 수 없는 것처럼 HashSet이라는 자료구조는 중복되는 값을 무시한다. 또한, 저장된 값들은 인덱스가 없기 때문에 순서가 없다. 따라서 HashSet은 값의        유무 검사에 특화되어 있는 자료구조이며, 해시코드로 유무 검사가 진행되고 속도가 상대적으로 빠르다. Set은 검사의 목적이 있기 때문에 순서 정보를 관리할 필요가 없어서 데이터 크기에 상관없이 검색에        걸리는 시간이 매우 짧다. 반면 ArrayList는 index를 관리해야하기 때문에 상대적으로 시간이 오래 걸린다. 그러므로 기능적 차이가 없다면 Set을 사용한다.</li>
    <li>HashSet을 쓰는 형식</li>
  </ul>
  <li>HashSet에 순서를 부여하기 위한 iterator()</li>
  <ul>
    <li>순서가 없는 객체에 순서를 부여하거나, 순서가 있어도 iterator 방식의 순서로 변경하고자 할 때 사용한다. iterator를 사용하여 HashSet을 iterator 타입으로 변경을 해준 후, hasNext()      메소드를 통해 다음 값이 있는지 검사하고, next() 메소드를 사용하여 값을 가져온다.</li>
    <li>iterator를 쓰는 방식</li>
  </ul>
  <li>만약, equals를 재정의했다면, hashCode()도 재정의를 해주어야 한다. 재정의를 하지 않을 경우 hashCode 메소드를 실행하였을 때 원하는 값으로 비교하지 않고, 필드의 주소로 비교를 하여 원하는     결과가 나오지 않게 되는 상황이 발생한다. 따라서 equals()에서 비교한 값을 hashCode()의 리턴값으로 재정의해야 한다.</li>
</ul>


<h3>Map</h3>
<ul>
  <li>Map은 Key(Set) - 해시테이블 - Value(Collection)로 구성이 되어 있다.</li>
  <li>key와 value로 구성이 되어 있으며, 둘이 한 세트이다. 즉, key가 ID일 경우 value에는 mesudal이 들어가면 {ID : mesudal}이 하나의 쌍이 되는 것이다.</li>
  <li>Map의 구현 클래스</li>
    <ul><li>HashMap(서버 간 데이터 교환) : Key와 Value 한 쌍으로 저장되며, 검색의 목적을 가지고 있다. Key는 중복된 값을 넣으면 Value가 최근 값으로 수정되고 중복되지 않은 값을 넣으면 새롭게 추가된다. Value는 중복이 가능하다.</li><ul>
</ul>
