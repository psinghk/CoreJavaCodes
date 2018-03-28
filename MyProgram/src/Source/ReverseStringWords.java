package Source;

public class ReverseStringWords {
	
	    public void reverse(String[] source) {

	        String dest = "";
	        for (int n = source.length - 1; n >= 0; n--) {
	            dest += source[n] + " ";
	        }
	        System.out.println(dest);

	    }

	    public static void main(String args[]) {
	        ReverseStringWords rs = new ReverseStringWords();
	        String[] str = "What is going on".split(" ");
	        rs.reverse(str);

	    }

	}
