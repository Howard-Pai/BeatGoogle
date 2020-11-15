import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		System.out.println("欸你這週要去哪");
		System.out.print("輸入網址：");
		Scanner in = new Scanner(System.in);
		String web = in.next();
		WordCounter counter = new WordCounter(web);
		int count = 0;
		try {
			count = counter.countKeyword("展演");
		}
		catch(IOException exception) {
			exception.printStackTrace();
		}
		Keyword keyword = new Keyword("展演", count, 1);
		KeywordList list = new KeywordList();
		list.add(keyword);
		System.out.print("總分： ");
		list.outputScore();
	}

}
