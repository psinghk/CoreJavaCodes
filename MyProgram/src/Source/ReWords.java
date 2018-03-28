package Source;

public class ReWords {
	
	

	    public static void main(String[] args) {

	        ReWords obj = new ReWords();
	        String print = obj.reverseWords(" prabhat singh gaurav");
	        System.out.println(print);

	    }

	    public String reverseWords(String words)
	    {
	      if(words == null || words.isEmpty() || !words.contains(" "))
	        return words;

	      String reversed = "";
	      for( String word : words.split(" "))
	        reversed = word + " " + reversed;

	      return reversed;
	    }

	}

