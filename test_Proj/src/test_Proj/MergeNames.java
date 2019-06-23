package test_Proj;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class MergeNames {
	
	public static String [] uniqueNames(String[] first, String[] second) {
		
//		String names []=new String [names1.length+names2.length]  ;
		
		String[] both = Arrays.copyOf(first, first.length + second.length);
		System.arraycopy(second, 0, both, first.length, second.length);
//		Arrays.stream(both).distinct().toArray();
		removeDublicates(both);
//		return both;
		
		return removeDublicates(both);
	}	

	public static String[] removeDublicates(String[] arr) {
		
		
		
		
		int end=arr.length;
		HashSet<String> set=new HashSet<String>(end);
		for(int i=0; i<end; i++) {
			set.add(arr[i]);
		}
		String[]array= set.stream().toArray(String[]::new);
		return array;
//		System.out.println(set);
//		String[] whiteList=new String[set.size()];
//		int i=0;
//		for(Iterator<String> it=set.iterator(); it.hasNext();) {
//			whiteList[i++]=it.next();
//			System.out.print(whiteList[i]);
//		}
//		return 	whiteList;
		
		
//		int len = arr.length;
//	    for (int i = 0; i < arr.length; i++) {
//	        for (int j = i + 1; j < len; j++) {
//	            if (arr[i] == arr[j]) {
//	                while (j < (len) - 1) {
//	                    arr[j] = arr[j - 1];
//	                    j++;
//	                }
//	                len--;
//	            }
//	        }
//	    }
//	    for (int i = 0; i < len; i++) {
//	        System.out.print("  " +arr[i]);
//	    }
	    
	}
	

//    private String[] removeDublicates(String[] names) {
//        LinkedHashSet<String> hashSet=new LinkedHashSet<String>();
//        hashSet.addAll(names);
//        names.addAll(hashSet);
//        return  names;
//    }

//	public static void removeDublicates(String [] both) {
////		
//		boolean found = false;
//		String current = both[0];
//		for (int i = 0; i < both.length; i++) {
//		    if (current == both[i] && !found) {
//		        found = true;
//		    } else if (current != both[i]) {
//		        System.out.print(" " + current);
//		        current = both[i];
//		        found = false;
//		    }
//		}
//		
//		System.out.print(" "+current);
////		return both;
//	}
   	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] names1=new String[] {"Ava", "Emma", "Olivia"};
		
		String [] names2=new String[] {"Olivia", "Sophia", "Emma"};
		
		System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2)));
		//
		
//		uniqueNames(names1, names2);
		
	}	
}