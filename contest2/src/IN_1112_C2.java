import java.util.*;

public class IN_1112_C2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			// Input:
			String result = "";
			String[] inputs = in.nextLine().split(", ");
			String shortHand = inputs[0];
			int numberOfStrings = Integer.parseInt(inputs[1]);
			String[] bitString = new String[numberOfStrings];
			for (int j = 0; j < numberOfStrings; j++) {
				bitString[j] = inputs[2 + j];

			}
			in.close();
			
			
			
			// Solve:
			for (int j = 0; j < bitString.length; j++) {
				boolean condition = true;
				for (int x = 0; x < shortHand.length(); x++) {
					String shortHandChar = shortHand.substring(x, x + 1);
					String bitStringChar = bitString[j].substring(x, x + 1);
					if (shortHandChar.equals("*")) {
						// Don't do anything
					} else if (!shortHandChar.equals(bitStringChar)) {
						condition = false;
					}
				}
				if (condition == true) {
					result += bitString[j] + ", ";
				}
				condition = true;
			}

			
			
			
			// Output:
			if (result.length() == 0) {
				System.out.println("NONE");
			}
			else {
				System.out.println(result.substring(0, result.length() - 2));
			}
		}
	}
}
