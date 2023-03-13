import java.util.Arrays;

class PlusOne {
	public static int[] plusOne(int[] digits) {
		
		int size;
		size = digits.length;  
		for (int i = size - 1; i >= 0; i--) {
			if (digits[i] < 9) {digits[i]++; break;}
			else {digits[i] = 0;}
		}
		if (digits[0] == 0)
			{int[] newdigits = new int[size + 1]; newdigits[0] = 1; return newdigits;}
		return (digits);
	}
    public static void main(String[] args) {
    	int[] stuff = {9,9,9,9,3,4,6,7,6,5,4,5,6,5,4,3,4,5,5,8};
    	System.out.println("This adds 1 to an array of digits");
    	System.out.println("The Old Array " + Arrays.toString(stuff));
    	System.out.println("The New Array " + Arrays.toString(plusOne(stuff)));
    	System.out.println("Program has ended.");
    }
}
