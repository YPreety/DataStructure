package String_Array;

import java.util.ArrayList;
import java.util.List;

public class WordBreak1 {

	public static void main(String[] args) {
		List dict = new ArrayList<>();
		dict.add("cat");
		dict.add("cats");
		dict.add("and");
		dict.add("sand");
		dict.add("dog");
		System.out.println(new WordBreak().wordbreak("catsanddog", dict));
	}

	public boolean wordBreak(String s, List<String> wordDict) {
		boolean[] f = new boolean[s.length() + 1];
		f[0] = true;
		for (int i = 1; i <= s.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (f[j] && wordDict.contains(s.substring(j, i))) {
					f[i] = true;
					break;
				}
			}
		}
		return f[s.length()];
	}

}
