package com.collection;

import java.util.HashSet;
import java.util.Iterator;
//집합이 영어로 Set이었어!?
public class SetDemo {
	public static void main(String[] args) {
		HashSet<Integer> A = new HashSet<Integer>();// A 라는HashSet컨테이너.
//		HashSet<Iterator> A = new HashSet<Iterator>();
//		제네릭설정을 오타냈더니 아래 값을 추가하는 명령어 부분에서 컴파일 에러가 발생된다.
		A.add(1);
		A.add(2);
		A.add(3);

		Iterator hi = (Iterator) A.iterator();
		while (hi.hasNext()) {
			System.out.println(hi.next());

			HashSet<Integer> B = new HashSet<Integer>();
			B.add(3);
			B.add(4);
			B.add(5);
			
			HashSet<Integer> C = new HashSet<Integer>();
			C.add(1);
			C.add(2);
			
			A.addAll(B);//A와 B를 합쳐서 A로 만든다.A,B의 합집합 
			A.retainAll(B);
			A.removeAll(B);
			

		}
	}
}
