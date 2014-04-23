package contact;

public class sortingBad
{
   
 public static void selectionSortInt (int[] list)
   {
      int min;
      int temp;

      for (int index = 0; index < list.length-1; index++)
      {
         min = index;
         for (int scan = index+1; scan < list.length; scan++)
            if (list[scan] < list[min])
               min = scan;

         // Swap the values
         temp = list[min];
         list[min] = list[index];
         list[index] = temp;
      }
   }



   public static void selectionSortString (String[] list)
   {
      int min;
      String temp;

      for (int index = 0; index < list.length-1; index++)
      {
         min = index;
         for (int scan = index+1; scan < list.length; scan++)
            if (list[scan].compareTo(list[min]) < 0)
               min = scan;


         // Swap the values
         temp = list[min];
         list[min] = list[index];
         list[index] = temp;
      }
   }

   
   public static void selectionSortDouble (double[] list)
   {
      int min;
      double temp;

      for (int index = 0; index < list.length-1; index++)
      {
         min = index;
         for (int scan = index+1; scan < list.length; scan++)
            if (list[scan] < list[min]) 
               min = scan;


         // Swap the values
         temp = list[min];
         list[min] = list[index];
         list[index] = temp;
      }
   }
}