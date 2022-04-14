public class Anagrams {
	public static void main(String[] args)
	{
		System.out.println(isAnagram("swear oft", "SOFTware")); //true
		System.out.println(isAnagram("swear ofts", "SOFTware")); //false
		System.out.println(isAnagram("Dormitory", "dirty room")); //true
		System.out.println(isAnagram("Dormitory", "dirtyroom")); //true
		System.out.println(isAnagram("Dormitory", "dirty.room")); //true
		System.out.println(isAnagram("dormitory", "dirtyroom")); //true
		System.out.println(isAnagram("hello", "there")); //false
		
		System.out.println(isAnagram("sheer", "here's"));
		System.out.println(isAnagram("hash", "sash"));
		System.out.println(isAnagram("DOOR", "odor"));
		System.out.println(isAnagram("door", "odor"));
		System.out.println(isAnagram("funeral", "real fun"));
		System.out.println(isAnagram("hi", "bye"));
	}

	//returns true if word1 and word2 are anagrams, false otherwise
	public static boolean isAnagram(String word1, String word2){
		String tempWord1 = word1;
		String tempWord2 = word2;
		word1 = word1.toLowerCase();
		word2= word2.toLowerCase();
		int tempIndex = 0;
		boolean letterIsThere = true;
		
		for(int k = 0; k < word1.length(); k++) {
			if(!(Character.isLetter(word1.charAt(k)))) {
				word1 = word1.replace(word1.substring(k, k + 1), "");
			}
		}
		
		for(int l = 0; l < word2.length(); l++) {
			if(!(Character.isLetter(word2.charAt(l)))) {
				word2 = word2.replace(word2.substring(l, l + 1), "");
			}
		}
		
		for(int i = 0; i < word1.length(); i++) {
				tempIndex = word2.indexOf(word1.charAt(i));
				if(tempIndex == -1) {
					letterIsThere = false;
				} else {
					word2 = word2.substring(0, tempIndex) + word2.substring(tempIndex+1);
				}
		}
		if(word2.length() == 0 && letterIsThere) {
			return true;
		} else {
			return false;
		}
	}
}

/*
1)d
2)a
3)d
4)e
5)b
6)b
7)d
8)a
9)d
10)a
11)a
12)c
13)e
14)d
15)c
16)a
 */