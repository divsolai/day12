package java30;

import java.util.HashSet;
import java.util.Scanner;

public class CommonElementsinSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Integer> hs = new HashSet<Integer>();
Scanner scan = new Scanner(System.in);
for(int i=0;i<5;i++)
{
	System.out.println("Enter the value to be added to the set");
	int v= scan.nextInt();
	hs.add(v);
}
System.out.println("The values of hashset1 is" + hs);
HashSet<Integer> hs2 = new HashSet<Integer>();
for(int i=0;i<5;i++)
{
	System.out.println("Enter the value to be added to the set");
	int v= scan.nextInt();
	hs2.add(v);
}
System.out.println("The values of hashset1 is" + hs2);
hs.retainAll(hs2);
System.out.println("the retained elements are"+ hs);
scan.close();

	}

}
