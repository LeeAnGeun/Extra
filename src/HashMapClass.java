

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HashMapClass {

	public static void main(String[] args) {
		/*
			HashMap은 사용을 많이 한다.
			HashMap : 사전
					   ("사과":"apple") 한쌍으로 관리 
						key  : value -> json
						Tree 구조*
						key값 으로 관리
						key값의 중복x
						
			TreeMap : HashMap + sorting
		 */
		
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		Map<Integer, String> hMap1 = new HashMap<Integer, String>(); // 인터페이스 사용
		
		// 추가     key  value
		hMap.put(11, "십일");
		hMap.put(22, "이십이");
		hMap.put(33, "삼십삼");
		
		String value = hMap.get(22); // get(key) -> 해당 key값에 value값 반환
		System.out.println(value);
		
		// 삭제
		String del = hMap.remove(11);
		System.out.println("삭제데이터 : " + del);
		
		System.out.println("hMap의 크기 = "+ hMap.size());
		
		// 검색 - 속도가 빠르다
		// 있다/없다
		boolean b = hMap.containsKey(22);
		if(b == true) {
			String s= hMap.get(22);
			System.out.println("value = " + s);
		}
		
		// 수정
		hMap.replace(22, "이십 + 이");
		System.out.println(hMap.get(22));
		
		hMap.put(22, "이십플러스 이"); // put에 중복 키 값을 사용하였을 때 허용하지 않고  해당 key값에 value값이 새로운 값으로 변경된다.
		System.out.println(hMap.get(22));
		
		// 모든 키 값을 취득하고 싶을 때
		Iterator<Integer> it = hMap.keySet().iterator(); // 반복자 생성
		
		while(it.hasNext()) {
			Integer k = it.next(); // 모든 key값을 가져옴
			System.out.println("key = " + k);
			
			String v = hMap.get(k);
			System.out.println("value = "+ v);
		}
		
		// 좋아하는 과일 
		// key:value -> String
		// "apple":"사과"
		
		HashMap<String, String> fMap = new HashMap<String, String>();
		
		fMap.put("Melon", "멜론");
		fMap.put("Banana", "바나나");
		fMap.put("Apple", "사과");
		fMap.put("Orange", "오렌지");
		fMap.put("Watermelon", "수박");
		
		Iterator<String> fIt = fMap.keySet().iterator();
		
		if(fMap.containsKey("Banana")) {
			fMap.put("Banana", "뻐나나");
		}
		
		while(fIt.hasNext()) {
			String k = fIt.next();
			System.out.println("key = "+ k);
			
			String v = fMap.get(k);
			System.out.println("value = " + v);
		}
		
		// TreeMap - HashMap 보다는 조금 무겁다
		// sorting 기능
		TreeMap<String, String> tMap = new TreeMap<String, String>(fMap);
		
		// 오름차순
	//	Iterator<String> itKey = tMap.keySet().iterator(); // 오름차순으로 데이터가 들어간다. key값 기준
		
		
		// 내림차순
		Iterator<String> itKey = tMap.descendingKeySet().iterator(); // 내림차순으로 데이터가 들어간다. key값 기준
		
		System.out.println("=========================");
		while(itKey.hasNext()) {
			String k = itKey.next();
			String v = tMap.get(k);
			
			System.out.println("key = "+ k + " value" + v);
		}
	}
}





















