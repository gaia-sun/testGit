package test.buy;

public class CU {

	public Object getNugaba(int left) {
		// TODO Auto-generated method stub
		return "������";
	}

	public Object getTera(int left) {
		// TODO Auto-generated method stub
		return "�׶�";
	}

	public Object getItem(String item, int left) {
		// TODO Auto-generated method stub
		// item�� ������ ����, 
		// ���� item�� "������"�� ������ (equal)
		// return "������"�� 
		// �׷��� ������ 
		// return "�׶�"�� �����Ѵ�.
		if (item.equals("������")) {
			return "������";
		} else {
			return "�׶�";
		}
	}

}
