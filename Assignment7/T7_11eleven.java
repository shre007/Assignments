//Question 11
//Find to sort HashMap in java by keys and values?


//Part 1: Sort by keys
package task_7;
//import java.util.HashMap;
//import java.util.TreeMap;

// public static void main(String[] args) {
//	      HashMap<String,Integer> hMap = new HashMap<>();
//	      TreeMap<String,Integer> sortedMap = new TreeMap<>();
//	      hMap.put("A",5);
//	      hMap.put("V",8);
//	      hMap.put("G",3);
//	      hMap.put("B",7);
//	      hMap.put("T",2);
//	      hMap.put("C",10);
//	      hMap.put("S",1);
//	      sortedMap = sortByKey(hMap);
//	      System.out.println(sortedMap);
//	   }
//	   public static TreeMap<String,Integer> sortByKey(HashMap<String,Integer> mapToSort) {
//	      TreeMap<String,Integer> sortedMap = new TreeMap<>();
//	      sortedMap.putAll(mapToSort);
//	      return sortedMap;
//	   }
//	}



//Part 2: Sort by values
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.HashMap;
//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.Map.Entry;
// 
//public class T7_11eleven {
////public class Main {
//    public static void main(String[] args) {
//        HashMap<String, Integer> map = new HashMap<>();
//        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
//        ArrayList<Integer> list = new ArrayList<>();
//        map.put("A", 5);
//        map.put("B", 7);
//        map.put("C", 3);
//        map.put("D", 1);
//        map.put("E", 2);
//        map.put("F", 8);
//        map.put("G", 4);
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            list.add(entry.getValue());
//        }
//        Collections.sort(list); 
//        for (int number : list) {
//            for (Entry<String, Integer> entry : map.entrySet()) {
//                if (entry.getValue().equals(number)) {
//                    sortedMap.put(entry.getKey(), number);
//                }
//            }
//        }
//        System.out.println(sortedMap);
//    }
//}