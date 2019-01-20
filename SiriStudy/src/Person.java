
/**
 * 클래스에 대한 설명을 여기에 쓴다.
 * 
 * @author 	js
 * @since 	2019. 1. 17.
 * @version 1.0
 * @see <pre>
 *  == 개정이력(Modification Information) ==
 *   
 *   수정일			수정자				수정내용
 *  ---------------------------------------------------------------------------------
 *   2019. 1. 17.		js				최초생성
 * 
 * </pre>
 */

public class Person {
	//변수: 상태, 속성
	// 변수명은 보통 명사
	String name;
	int age;
	
	//메소드: 명령, 하는 일
	// 메소드명은 보통 동사
	public void cook(String name) {
		System.out.println(name + "님이 요리를 시작합니다.");
	}
	
	public void walk(Person p) {
		System.out.println(p.name + "님이 요리를 시작합니다.");
	}
	
	public void sleep(Person p) {
		//만일 펄슨객체의 나이가 23살 미만이면 잠을 재우고
		if(p.age<23){
		System.out.println(p.name+"은 잔다.");
		
		}else{	//23살 이상이면 안 잔다.
		System.out.println(p.name+"은 안잔다.");
		}	
	}
	
	public void run(Person p) {
		// 23살 미만만 달려라
		if(p.age<23){
			System.out.println(p.name+"은 달린다.");
		}else{ //23살 이상은 무시
		
		}
		
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		Person 진실 = new Person();
		진실.name = "진실";
		진실.age = 20;
		진실.cook(진실.name);
		진실.sleep(진실);
		진실.run(진실);
		System.out.println(진실);
		
		Person 지산 = new Person();
		지산.name="지산";
		지산.age = 23;
		지산.walk(지산);
		지산.sleep(지산);
		지산.run(지산);
		System.out.println(지산);	
	}
}
