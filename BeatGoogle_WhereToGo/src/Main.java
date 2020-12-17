import java.util.Scanner;
import java.io.IOException;
import java.util.HashMap;
import java.util.Collection;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		WordCounter counter = new WordCounter();
		
		System.out.println("欸你這週要去哪");
		System.out.print("輸入搜尋關鍵字：");
		Scanner in = new Scanner(System.in);
		String searchWord = in.next();
		
		GoogleQuery google = new GoogleQuery(searchWord); 
		try {
			HashMap<String, String> query = google.query();
			for(String key : query.keySet()) {
				int endIndex = query.get(key).indexOf("&");
				String url = query.get(key).substring(7, endIndex);
				double score = counter.countScore(url);
				System.out.println(key);
				System.out.println(url);
				System.out.println("總分： " + score);
				System.out.println();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
