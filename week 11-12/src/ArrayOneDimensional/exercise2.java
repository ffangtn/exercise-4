package ArrayOneDimensional;

public class exercise2 {

	public static void main(String[] args) {
		// write a statement that declare a string array initialize with the following string: 
		//sunday, monday, tuesday, wednesday, thursday, friday, saturday
		// write a loop that display the content of each element in the array that you declared
		
		String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		System.out.println("For");
		for(int i=0; i<days.length; i++) {
			System.out.println(days[i]);
		}
		System.out.println();
		System.out.println("While");
		int j = 0;
		while(j < days.length) {
			System.out.println(days[j]);
			j++;
		}
		System.out.println();
		System.out.println("Do while");
		int k = 0;
		do {
			System.out.println(days[k]);
			k++;
		}while(k < days.length);
	}

}
