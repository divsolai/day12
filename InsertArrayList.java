package java30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int val;
		Scanner scan= new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the value of the ArrayList");
			int v=scan.nextInt();
			list.add(v);
		}
		System.out.println("The ArrayList is"+ list);
		int size= list.size();

		System.out.println("Enter the position in which the number should be entered in arrayList of size " + size);
		num  = scan.nextInt();
		System.out.println("Enter the value");
		val= scan.nextInt();
		list.add(num-1, val);
		System.out.println("The new updated ArrayList is"+ list);

		scan.close();
	}

}
