

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {

	public static void main(String[] args)
	{
		HashSet a = new HashSet();
		a.add("ASPIRE");
		a.add(100);
		a.add('A');
		a.add(60.5f);
		a.add(100);
		a.add(null);
		a.add(null);
		a.add(null);
		a.add("String");
		a.add(6.5f);

		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.contains("AsPIRE"));
		System.out.println("After removing the string");
		a.remove("String");
		System.out.println(a);

		System.out.println("To print the data we used the iterator/List Iterator cursor");
		Iterator itr = a.iterator();

		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("For each loop is used to retrive the data");
		
		for ( Object w : a)
		{
			System.out.println(w);
		}



	}

}
