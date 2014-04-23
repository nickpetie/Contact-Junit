package contact;

public class sort {
	
	public static void main(String args[])
	{
		int[] myInt = {100, 356, 67, -12, 89};
		String[] myStr = {"Spring", "Fall", "Winter", "Summer"};
		double[] myDou ={56.78, 89.90, 12.89,-15.89};
		
		//Sorting an Int Array
		sortingBad.selectionSortInt(myInt);
		
		for(int i=0 ; i < myInt.length; i++ )
		{
			System.out.print(" " + myInt[i]);
		}
		
		System.out.println();
		
		//Sorting a String Array
       sortingBad.selectionSortString(myStr);
		
		for(int i=0 ; i < myStr.length; i++ )
		{
			System.out.print(" " + myStr[i]);
		}
		
		System.out.println();
		
		
		//Using Generic Sorting Method
		sortingGood.selectionSort(myStr);
		
		for(int i=0 ; i < myStr.length; i++ )
		{
			System.out.print(" " + myStr[i]);
		}
		
		
		
		System.out.println();
		
		Integer[] myIntObj = new Integer[myInt.length];
		
		for(int i=0 ; i < myInt.length; i++ )
		{
			myIntObj[i]= new Integer(myInt[i]);
		}
		
		sortingGood.selectionSort(myIntObj);
		
		for(int i=0 ; i < myInt.length; i++ )
		{
			myInt[i]=myIntObj[i].intValue();
			System.out.print(" " + myInt[i]);
		}
		
		
		
		   Contact[] friends = new Contact[8];

	      friends[0] = new Contact ("John", "Smith", "610-555-7384");
	      friends[1] = new Contact ("Sarah", "Barnes", "215-555-3827");
	      friends[2] = new Contact ("Mark", "Riley", "733-555-2969");
	      friends[3] = new Contact ("Laura", "Getz", "663-555-3984");
	      friends[4] = new Contact ("Larry", "Smith", "464-555-3489");
	      friends[5] = new Contact ("Frank", "Phelps", "322-555-2284");
	      friends[6] = new Contact ("Mario", "Guzman", "804-555-9066");
	      friends[7] = new Contact ("Marsha", "Grant", "243-555-2837");

	      sortingGood.selectionSort(friends);

	      for(int i=0 ; i < friends.length; i++ )
			{
	         System.out.println (friends[i]);
			}

	}

}
