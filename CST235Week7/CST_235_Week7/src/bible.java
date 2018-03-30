import javax.faces.bean.ManagedBean;

@ManagedBean
public class bible {
	
	// selected word for verse one, two, and three 
	private String v1;
	private String v2;
	private String v3;
	
	// no arg constructor
	public bible(){
		
	}
	
	// bible verse 1
	String bibleVerseOne = "In the morning, LORD, you hear my voice; in "
			+ "the morning I lay my requests before you and wait expectantly";
	// bible verse 2
	String bibleVerseTwo = "Brothers and sisters, I do not consider myself yet to have taken hold of it. "
			+ "But one thing I do: Forgetting what is behind and straining toward what is ahead, I "
			+ "press on toward the goal to win the prize for which God has called me heavenward in Christ Jesus";
	// bible verse 3
	String bibleVerseThree = "But he said to me, my grace is sufficient for you, for my power is made perfect "
			+ "in weakness.” Therefore I will boast all the more gladly about my weaknesses, so that "
			+ "Christ’s power may rest on me. That is why, for Christ’s sake, I delight in weaknesses, "
			+ "in insults, in hardships, in persecutions, in difficulties. For when I am weak, then I am strong";
	
	// getters and setters for verses
	public String getV1() {
		return v1;
	}
	public void setV1(String v1) {
		this.v1 = v1;
	}
	public String getV2() {
		return v2;
	}
	public void setV2(String v2) {
		this.v2 = v2;
	}
	public String getV3() {
		return v3;
	}
	public void setV3(String v3) {
		this.v3 = v3;
	}
	
	// Word search method for verse 1
	public static int verseSearchOne(String bibleVerseOne, String v1){
		int i;
	    int last = 0;
	    int count = 0;
	    do {
	        i = bibleVerseOne.indexOf(v1, last);
	        if (i != -1) count++;
	        last = i + v1.length();
	    } while(i != -1);
	    return count;
	}
	
	// Word search method for verse 2
	public static int verseSearchTwo(String bibleVerseTwo, String v2){
		int i;
		int last = 0;
		int count = 0;
		do {
		    i = bibleVerseTwo.indexOf(v2, last);
		    if (i != -1) count++;
		    last = i + v2.length();
		} while(i != -1);
		return count;
	}
	// Word search method for verse 2
	public static int verseSearchThree(String bibleVerseThree, String v3){
		int i;
		int last = 0;
		int count = 0;
		do {
			i = bibleVerseThree.indexOf(v3, last);
			if (i != -1) count++;
			last = i + v3.length();
		} while(i != -1);
		return count;
	}
}


