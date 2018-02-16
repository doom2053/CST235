//Mark Piland
//CST 235
// 2/15/18
// I used source code from the following websites to complete this assignment: 
//https://stackoverflow.com/questions/16104616/using-bufferedreader-to-read-text-file  to read the textfile into a buffered reader.
// https://stackoverflow.com/questions/25606833/fastest-way-to-sum-integers-in-text-file  I used this to help provide  information on guiding me to find and add numbers.
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Assignment_1b implements java.io.Serializable {

    		private static int totalWords = 0;
		private static int totalCharacters = 0;
                private static int totalNumber = 0;
                private static String numbers = "";
		private static String textFile;

    public static void readFileAndPrintCounts(String myFile) throws FileNotFoundException {
 
		// Read file contents
                
		try (BufferedReader textBuffer = new BufferedReader(new FileReader(myFile))) {
			printLog(" ---File Content--- " );
 
			// read each line one by one
			while ((textFile = textBuffer.readLine()) != null) {
				printLog(textFile);
 
				// ignore multiple white spaces
				String[] myWords = textFile.replaceAll("\\s+", " ").split(" ");
 
				for (String word : myWords) {
					totalCharacters += word.length();
				}
                                
				totalWords += myWords.length;
                                numbers += textFile.replaceAll("[^0-9]+", "");
                                
			}
                        for (int i = 0; i < numbers.length(); i++){
                                    int add = Character.getNumericValue(numbers.charAt(i));
                                    totalNumber = totalNumber + add;
                                }
		} catch (IOException e) {
			e.printStackTrace();
		}
		printLog("\n -----Result------- ");
 
		printLog("* Total Characters: " + totalCharacters);
		printLog("* Total Words: " + totalWords);
                printLog("* Sum of all Numbers: " + totalNumber);
	}
            

    public void setTotalCharacters(int totalCharacters){
        this.totalCharacters = totalCharacters;
    }

    public void setNumbers(String numbers){
        this.numbers = numbers;
    }

    public void setTextFile(String textFile){
        this.textFile = textFile;
    }
    
    public int getTotalWords(){
        return this.totalWords;
    }             

    public int getTotalCharacters(){
        return this.totalCharacters;
    }

    public String getNumbers(){
        return this.numbers;
    }

    public String getTextFile(){
        return this.textFile;
    }
    
    private static void printLog(String string) {
            System.out.println(string);
    }
    
    public static void main(String[] args) {
        try {
                String myFile = "Assignment1btext.txt";
                readFileAndPrintCounts(myFile);
        } catch (FileNotFoundException e) {
                e.printStackTrace();
        }
    }
    
}