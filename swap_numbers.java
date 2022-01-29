
public class swap_numbers {

	public static void main(String[] args) {
		int i=-100;
		int j=-30;
		
		System.out.println("before swapping " + i);
		System.out.println("before swapping " + j);
		
		
		i=i+j;
		j=i-j;
		i=i-j;
		
		System.out.println("After swapping " + i);
		System.out.println("After swapping " + j);
		
				
	}

}
