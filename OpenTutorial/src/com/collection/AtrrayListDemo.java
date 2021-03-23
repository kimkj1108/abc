package com.collection;

import java.util.ArrayList;

public class AtrrayListDemo {
	public static void main(String[] args) {
		String[] arrayObj = new String[2];//배열 선언과 생성.
		arrayObj[0] = "one";
		arrayObj[1] = "two";
//		arrayObj[2] = "three";//오류가 발생한다.ArrayIndexOutOfBoundsException:
								//배열의 범위를 초과한 범위에 값을 추가하려고 하다보니 에러..
		for(int i = 0; i<arrayObj.length; i++) {
			System.out.println(arrayObj[i]);
		}
		
		ArrayList al = new ArrayList();//선언..ArrayList인스턴스를 al변수에 담았다.
		//util.ArrayList패키지를 import해야 한다.
		//ArrayList클래스는 생성시 범위를 지정하지 않아도 된다.
		al.add("one");
		al.add("two");
		al.add("three");
		//위와 같이 데이터를 추가해도 범위관련 에러가 나지 않는다.
		for(int i = 0; i<al.size(); i++) {
			//값을 불러올때도 일반 배열객체와는 다른 방법을 쓴다.
			//size() 메소드를 통해 ArrayList에 값이 몇개인지 파악한다.
//			String value = al.get(i);  //에러발생.
			String value = (String)al.get(i);//가져온 값을 스트링으로 형변환해서
											//value라는 변수에 담을 수 있게된것이다.
//			.add라는 메소드는 모든 데이터타입을 수용한다.
//			그렇게 하기 위해서는 .add메소드의 파라미터 데이터 타입이 Object여야 한다.
//			큰거에 작은걸 담을때는 묵시적 형변환(자동으로 형변환)되니까....
//			즉, Object타입을 String타입 변수에 담으려다보니 에러가 발생한다.
			System.out.println(al.get(i));
		}
	}

}
