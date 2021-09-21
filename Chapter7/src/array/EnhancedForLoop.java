package array;

public class EnhancedForLoop {
	public static void main(String[] args) {
		String[] strArray= {"Java","Android","C","Javascript","Python"};
		
		for (String lang : strArray) {
			System.out.println(lang);
			//lang에 strArray의 모든 요소가 대입됨
		}
	}
}
