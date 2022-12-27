package collectionTask;

import java.util.ArrayList;

public class UserField {
//	- 회원 정보를 담을 DB를 ArrayList로 선언
	public ArrayList<User> users = new ArrayList<User>();
	
//	- 아이디 중복검사
	public User checkId(String id) {
		
	}
	
//	- 회원가입
	public void join() {
		
	}
	
//	- 로그인
	public User login(String id, String pw) {
		User user = checkId(id);
		if(user != null) {
			user.getPassword()
		}
	}
	
//	- 암호화
	public String encrypt(String password) {
		
	}
	
//	- 비밀번호 변경(비밀번호 찾기 서비스)
	public void changePassword(User user) {
		User userOriginal = checkId(user.getId());
		userOriginal.setPassword(null);
	}
	
//	- 인증번호 전송
//	인증번호 전송 시 전송된 인증번호가 화면에서 필요하다.
//	따라서 전송한 인증번호를 사용한 화면쪽으로 리턴해준다.
	public String sendSms() {
		
	}
}









