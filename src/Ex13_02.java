//13장.생성자.pdf No20 2번문제 이 문제도 생성자 오버로딩을 하라는 것
class Product{
	String name;//상품명
	int price;//상품가격
	
	public Product() {}//생성자가 오버로딩이 되면 기본생성자 묵시적 제공을 하지 않아서 명시적 코드로 정의
	
	public Product(int price) {
		this("물",price);//같은 클래스내의 전달인자 개수가 다른 오버로딩 된 생성자 호출
	}
	
	public Product(String name) {
		this(name,800);
	}
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}//생성자 오버로딩	
	
	public void pr() {
		System.out.println(name+", "+price);
	}	
}//Product class End
public class Ex13_02 {
	public static void main(String[] args) {
		Product p1 = new Product("웰치스", 700);
		Product p2 = new Product("커피");
		Product p3 = new Product(500);
		Product p4 = new Product();
		
		p1.pr();
		p2.pr();
		p3.pr();
	}
}
