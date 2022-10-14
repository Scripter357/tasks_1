//Main class
public class Tasks {
	public static void main(String[] args) {
		System.out.println("Enter a task number: ");
		String input = System.console().readLine();
		try {
		switch(input) {
			case "1":
				System.out.println(remainder(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
				return;
			case "2":
				System.out.println(triArea(Double.parseDouble(args[0]),Double.parseDouble(args[1])));
				return;
			case "3":
				System.out.println(animals(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])));
				return;
			case "4":
				System.out.println(profitableGamble(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2])));
				return;
			case "5":
				System.out.println(operation(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])));
				return;
			case "6":
				System.out.println(ctoa(args[0].charAt(0)));
				return;
			case "7":
				System.out.println(addUpTo(Integer.parseInt(args[0])));
				return;
			case "8":
				System.out.println(nextEdge(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
				return;
			case "9":
				System.out.println(sumOfCubes(strArrToIntArr(args)));
				return;
			case "10":
				System.out.println(abcmath(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])));
				return;
			default:
				System.out.println("[ERROR] Input does not match a task number.");
		}
		} catch(Exception err) {
			System.out.println("An error has occured. Check what you're inputting as arguments. Error follows: ");
			System.out.println(err);
		}
	}
	
	//Finds remainder when x is divided by y.
	public static int remainder(int x, int y) {
		return x % y;
	}
	
	//Finds triangle area from it's base and height.
	public static double triArea(double z, double h) {
		return z*h/2.0;
	}
	
	//Counts legs
	public static int animals(int chis, int cows, int pigs) {
		return chis * 2 + cows * 4 + pigs * 4;
	}
	
	//Finds if a gamble is on average profitable
	public static boolean profitableGamble(double prob, double prize, double pay) {
		if(prob*prize > pay) return true;
		return false;
	}
	
	//Finds which operation instead of ? allows for the following statement to be true: a ? b == n
	public static String operation(int n, int a, int b) {
		if(a + b == n) {
			return "added";
		} else if(a - b == n) {
			return "substracted";
		} else if(a * b == n) {
			return "multiplied";
		} else if(a / b == n) {
			return "divided";
		} else {
			return "none";
		}
	}
	
	//Finds ASCII code of a character
	public static int ctoa(char x) {
		return (int)x;
	}
	
	//Finds sum of numbers from 1 to x
	public static int addUpTo(int x) {
		return (x+1)*(x/2)+(x%2*(x/2+1));
	}
	
	//Finds maximum third edge of a triangle with edges of length a and b.
	public static int nextEdge(int a, int b) {
		return a+b-1;
	}
	
	//Finds sum of cubes of integers in the input array
	public static int sumOfCubes(int nums[]) {
		int result = 0;
		for(int i = 0; i < nums.length; i++) {
			result += nums[i]*nums[i]*nums[i];
		}
		return result;
	}
	
	//Converts an array of string to an array of integers
	private static int[] strArrToIntArr(String array[]) {
		int nums[] = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			nums[i] = Integer.parseInt(array[i]);
		}
		return nums;
	}
	
	//Finds if a*2^b is divisible by c
	public static boolean abcmath(int a, int b, int c) {
		return (a*(int)Math.pow(2,b))%c == 0;
	}
}

