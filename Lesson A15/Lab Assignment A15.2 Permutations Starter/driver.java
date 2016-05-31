import java.util.*;
public class driver {
	
	/**
	 * Driver class for the Permutations project
	 * 
	 *@author 
	 *@created March 2014
	 *
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		int pSize = 10;
    	PermutationGenerator permutation = new PermutationGenerator(pSize);

    	System.out.println("Random Permutation List Generator");
    	System.out.println();

	    for (int lNum = 1; lNum <= pSize; lNum++)
	    {
	      ArrayList <Integer>permutedList = permutation.nextPermutation();
	
	      System.out.println("List " + lNum + ": ");
	
	      for (int item = 0; item < permutedList.size(); item++)
	      {
	        System.out.print(permutedList.get(item) + " ");
	      }
	      //System.out.print((Integer)permutedList.get(item) + " ");
	
	      System.out.println();
	    }
	}	
}
