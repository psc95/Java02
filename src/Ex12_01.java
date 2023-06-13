//12장.메서드 살피기.pdf의 No.19쪽의 1번문제

class MtRef01{
	void p(int a,int b) {
		if(a>b) {
			System.out.println(a+"와 "+b+"중에서 더 큰수(최대값) ="+a);
		}
	}
	
	void p(double a,double b) {
		if(a<b) {
			System.out.println(a+"와 "+b+" 실수숫자중에서 더 큰수(최대값) ="+b);
		}
	}//전달인자 타입이 다른 메서드 오버로딩
}
public class Ex12_01 {
	public static void main(String[] args) {
      MtRef01 mt=new MtRef01();
      mt.p(100,50);
      mt.p(50.0,75.0);
	}
}
