# 파일 입출력 공부...

<pre><code>
  
</pre></code>


<h3>Pattern</h3>
<ul>
  <li>개발자들의 약속</li>
</ul>



<h3>Date</h3>
<ul>
  <li>Month는 1~12월은 값으로 0~11이다.</li>
  <pre><code>
  public class DateTest {
    public static void main(String[] args) {
      SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 / HH시 mm분 ss초");
      Date date = new Date();
      Date time = new Date();

      System.out.println(date.toString());
      System.out.println(simpleDateFormat.format(date));

      try {
        time = simpleDateFormat.parse("2002년 12월 04일 / 09시 00분 00초");
        System.out.println(time);
      } catch (ParseException e) {
        e.printStackTrace();
      }
    }
  }
  </pre></code>
  
  <pre><code>
  public class CalendarTask {
    public static void main(String[] args) {
      // 본인의 생년월일 출력
      SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
      Calendar today = Calendar.getInstance();

      System.out.println(simpleDateFormat.format(today.getTime())); // 현재 년-월-일 출력

     // today.set(1997, 1, 16); // today에 날짜 수정 & 월은 0~11이기 때문에 1을 대입

      /* 년-월-일을 바꾸는 다른 방법 */
      today.set(Calendar.YEAR, 1997);
      today.set(Calendar.MONTH, 1);
      today.set(Calendar.DATE, 16);

      System.out.println(simpleDateFormat.format(today.getTime())); // 변경된 년-월-일 출력
    }
  }
  </pre></code>
</ul>



<h3>파일 입출력</h3>
<ul>
  <li>신입사원이 파일 입출력 업무를 맡게될 확률은 낮지만, 언젠가는 써야하기 때문에 파일 입출력 방법에 대해 공부해야 한다.</li>
  <li>Stream이라는 연결통로를 통해 원본 데이터가 알맞는 인코딩 방식으로 전송된다. Stream은 byte 단위로 입출력되기 때문에 개별처리이며, 상세 연산이 필요하지 않다면 Buffer를 사용한 입출력을 권장한다. 때문에 Buffer를 사용하면 일괄처리가 가능해진다.</li>
  <li>java -> txt 파일로 보내는 경우 java 개발자 입장에서는 출력에 해당되고, txt -> java로 갖고오는 경우 입력에 해당된다.</li>
  <li>입출력 과정은 Stream을 통해 인코딩(보낼 때)을 진행하고, 디코딩(받을 때)를 진행하게 된다.</li>
  <li>인코딩 방식은 완성형과 조합형이 있다.</li>
  <ul>
    <li>완성형 : 각, 간, 갇, 갈 등 완성이 된 상태에서 값을 찾아 출력</li>
    <li>조합형 : ㄱ+ㅏ+ㄱ 등 자음,모음,받침을 조합하여 값으로 출력</li>
    <li>조합형이 효율적이며 byte 단위로 데이터를 전송할 때 고정된 byte가 아니기 때문에 가변형 인코딩 방식을 선호한다. 조합형이면서 가변형인 인코딩 방식은 UTF-8이며, 전 세계에서 가장 많이 사용하    는 방식이다.</li>
  </ul>
</ul>



<h3>버퍼</h3>
<ul>
  <li>기존 Stream을 활용하여, 상속을 받아 최신화 기술로 만들어졌으며 임시 저장공간에 해당된다.</li>
  <li>flush() 메소드를 사용하게 되면, 버퍼 안에 있는 데이터들을 목적지에 맞게끔 전송이 된다.</li>
  <ul><li>flush()를 통해 버퍼의 저장공간을 비울 수 있다.</li></ul>
  <li>버퍼 작업을 마친 후에 flush()보다는 close() 메소드를 활용하여 버퍼를 닫아준다.</li>
  <li>stream과 버퍼의 차이는 다음과 같다.</li>
  <ul>
    <li>stream : byte 단위로 배열을 만듦</li>
    <li>버퍼 : 완성형으로 만듦</li>
  </ul>
  <img src="https://postfiles.pstatic.net/MjAyMjA4MjJfMTA5/MDAxNjYxMTMyMDE2NDQz.VCyvypdvc-rvI-YzeUKooqnDCN6xbA3POF-s9Y4sKWIg.879glMFjCHwW2G_fIi4_Ej_YPOIIZh2nSxK6f6WMurwg.PNG.mesudal/SE-061c8135-e510-437d-8aed-369d050dc72c.png?type=w773">
</ul>



<h3>Writer(출력)</h3>
<ul>
  <li>BufferedWriter : 버퍼를 사용한 출력 클래스</li>
  <li>FileWriter : 전달한 경로의 파일을 출력하기 위한 목적으로 열어준다.</li>
  <li>전달한 경로에 파일이 없다면 새롭게 만든 후 열어준다.</li>
</ul>



<h3>Reader(입력)</h3>
<ul>
  <li>BufferedReader : 버퍼를 사용한 입력 클래스</li>
  <li>FileReader : 전달한 경로의 파일을 입력하기 위한 목적으로 열어준다.</li>
  <li>전달한 경로에 파일이 없다면 오류가 발생한다. (FileNotFoundException)</li>
</ul>



<h3>File(파일 정보)</h3>
<ul>
  <li>전달한 경로에 있는 파일의 정보를 담는 타입.</li>
  <li>디렉터리 생성, 해당 경로의 전체 파일 목록, 파일 삭제 등</li>
  <pre><code>
  public class FileTask {
	public static void main(String[] args) throws IOException {
		// 고등어, 갈치, 꽁치, 전어
		// 배열로 출력하고 전체 내용 가져와서 콘솔에 출력하기
		
		String fishs[] = {"고등어", "갈치", "꽁치", "전어"}; // 4가지 생선의 종류를 배열로 저장
		
		
		/* 출력 */
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/fileTest/task.txt", true)); //  덮어쓰기 방지
			for(String fish : fishs) {
				bufferedWriter.write(fish + "\n");
			}
			bufferedWriter.close(); // close()를 통해 buffer 닫기
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/* 입력 */
		File file = new File("src/fileTest/task.txt"); // File타입인 file에 task.txt를 저장
		
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			String line = null;
			while((line = bufferedReader.readLine()) != null) { // task.txt 안에 있는 문자열의 길이만큼 반복 
				System.out.println(line);
			}
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

//		if(file.exists()) { // 해당 경로가 존재할 경우
//			System.out.println(file.delete()); // 삭제
//		}
    }
  }
  </code><pre>
</ul>



<h3>MVC 패턴</h3>
<ul>
  <li>Model View Control의 약어이다. 각자 어떤 기능을 하는지는 아래에 작성했다.</li>
  <ul>
    <li>Model</li>
      <ul>
        <li>DB에서 조회된 결과값을 담기 위한 변수들이 선언된 클래스 (기본 생성자, Getter&Setter, toString 등등..)</li>
        <li>Model 객체 이름 뒤에는 용도에 따라 VO(=Value Object), DTO(=Data Transfer Object)를 붙인다. ex) UserVO</li>
        <li>VO : 테이블을 보고 그대로 만든 객체</li>
        <li>DTO : 화면에 결과를 담아서 전달할 객체</li>
      </ul>
      
    <li>Controller</li>
      <ul>
        <li>DB에 접근할 수 있는 메소드들이 선언된 클래스</li>
        <li>즉, DAO(=Data Access Object)가 포함된 CRUD 기능을 구현하는 메소드 집합 클래스</li>
        <li>접근 후 결과값이 있을 경우 Model 객체에 담은 후 처리</li>
      </ul>
    
    <li>View</li>
      <ul>
        <li>사용자에게 보여질 화면을 구성하는 부분 (HTML, CSS, JavaScript 등..)</li>
        <li>Controller에 선언된 CRUD 메소드를 사용하는 부분</li>
      </ul>
  </ul>
</ul>
