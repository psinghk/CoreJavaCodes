package coms.sgs.string.program.test;

public class RemoveTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = new String("abbc");
        String output = new String();

        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < output.length(); j++) {
                if (input.charAt(i) != output.charAt(j)) {
                    output = output + input.charAt(i);
                }
            }
        }
  System.out.println(".................");
        System.out.println(output);

	}

}
