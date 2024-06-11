package test.buy;

public class CU {

	public Object getNugaba(int left) {
		// TODO Auto-generated method stub
		return "누가바";
	}

	public Object getTera(int left) {
		// TODO Auto-generated method stub
		return "테라";
	}

	public Object getItem(String item, int left) {
		// TODO Auto-generated method stub
		// item의 내용을 보고, 
		// 만약 item이 "누가바"와 같으면 (equal)
		// return "누가바"를 
		// 그렇지 않으면 
		// return "테라"를 실행한다.
		if (item.equals("누가바")) {
			return "누가바";
		} else {
			return "테라";
		}
	}

}
