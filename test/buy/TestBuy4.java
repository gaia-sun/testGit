package test.buy;

import java.util.Scanner;

/**
 * 목적 : 실시간 내가 원하는 물건을 매번 편의점에서 사오는 심부름(누가바, 테라)
0. 00아 편의점에 가서 기다리면 형이 전화로 알려주는 물건을 달라고 해.
0-1. Scanner를 통해 입력한 것을 기억한다.([1]의 item)
0-2. item = Scanner.?();
1. 00아 쪽지를 줄텐데, 잃어버릴 수 있으니 잘 기억해. 사올 물건은 "누가바"야.
1-1. item = "누가바"
2. 형이 주는 돈(10000원)을 왼손에 꼭 가지고 있어.
2-1. 10000 -> left //미국식으로 생각. 결과 = 연산
2-2. left = 1000; // 어떤 값을 저장, 기억하는 것 : 변수
3. 요 앞에 있는 CU 알지? 그곳으로 가.
3-1. cu = ?  // cu = new CU();
4. CU에 도착하면 점원분께 "쪽지에 써있는 물건 주세요."라고 얘기하면서 쪽지와 왼손의 돈을 줘.
4-1. 그럼 점원분이 뭔가를 줄거야 그걸 오른손에 받아.
4-1-1. right = cu.getItem(item, left); // 행위, 값을 만들어주는 것 : 함수, () ->입력값:행위를 위한 필요 데이터
5. 형한테 곧장 와서 오른손의 아이스크림을 형한테 줘.
5-1. syso(right);

 * @author 김대현
 *
 */
public class TestBuy4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		0. 00아 편의점에 가서 기다리면 형이 전화로 알려주는 물건을 달라고 해.
//		0-1. Scanner를 통해 입력한 것을 기억한다.([1]의 item)
		Scanner input = new Scanner(System.in);
//		1. 00아 쪽지를 줄텐데, 잃어버릴 수 있으니 잘 기억해. 사올 물건은 "누가바"야.
		String item = "테라";
//		입력한 것을 기억한다.([1]의 item)
//		item = input.next();
		
		while (!(item = input.next()).equals("끝")) {

//			2. 형이 주는 돈(10000원)을 왼손에 꼭 가지고 있어.
//			2-1. 10000 -> left //미국식으로 생각. 결과 = 연산
			int left = 10000; // 어떤 값을 저장, 기억하는 것 : 변수
//			3. 요 앞에 있는 CU 알지? 그곳으로 가.
			CU cu = new CU();
//			4. CU에 도착하면 점원분께 "쪽지에 써있는 물건 주세요."라고 얘기하면서 쪽지와 왼손의 돈을 줘.
//			4-1. 그럼 점원분이 뭔가를 줄거야 그걸 오른손에 받아.
			Object right = cu.getItem(item, left); // 행위, 값을 만들어주는 것 : 함수, () ->입력값:행위를 위한 필요 데이터
//			5. 형한테 곧장 와서 오른손의 아이스크림을 형한테 줘.
			System.out.println(right);
		}
	}

}
