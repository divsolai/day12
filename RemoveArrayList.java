package java30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the value of the ArrayList");
			int v=scan.nextInt();
			list.add(v);
		}
		System.out.println("The ArrayList is"+ list);
		List<Object> updatedlist = list.stream().distinct().collect(Collectors.toList());
	
	System.out.println("the updated Arraylist is"+ updatedlist);
	scan.close();
	}
}
		

