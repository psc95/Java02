/* 클래스 초기화블록과 인스턴스 초기화 블록 
 */
public class ObjTest11 {
	static {
		System.out.println("static{}");
	}
	/* static{}을 클래스 초기화 블록이라고 한다. 클래스 초기화 블록은 정적변수 즉 클래스변수 초기화에 사용된다.
	 * static키워드로 정의된 변수를 정적변수 즉 클래스 변수라고 한다. 정적변수는 객체 생성없이 클래스로 직접접근 가능하다.
	 * 클래스 초기화 블록은 해당 클래스가 최초 로딩될 때 딱 한번만 수행된다. 
	 */
	{
		System.out.println("인스턴스 초기화 블록");
	}
	/* {} 인스턴스 초기화블록은 인스턴스 변수 초기화에 사용된다.인스턴스 초기화 블록은 객체가 생성될 때 마다 수행되고,생성자
	 * 보다 먼저 호출한다. 
	 */
	public ObjTest11() {
		System.out.println("기본 생성자");
	}
	public static void main(String[] args) {
        new ObjTest11();//인스턴스 초기화블록 먼저 호출이후 생성자 호출
        new ObjTest11();//인스턴스 초기화 블록이나 생성자는 객체 생성할 때 마다 호출된다.
	}
}


