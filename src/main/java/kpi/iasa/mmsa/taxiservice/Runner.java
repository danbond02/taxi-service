package kpi.iasa.mmsa.taxiservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Runner {

       public static boolean fourSumProblem(ArrayList<Integer> array){

           HashMap<Map<Integer, Integer>, Integer> map = new HashMap<>();

           for (int i = 0; i < array.size(); i++){
               for (int j = i+1; j < array.size(); j++){
                   System.out.print(array.get(i) + " " + array.get(j) + "\n");
                   Map<Integer, Integer> newMap = new HashMap<>();
                   newMap.put(array.get(i), array.get(j));
                   map.put(newMap, array.get(i)+array.get(j));
               }
           }

           List<Map<Integer, Integer>> keys = new ArrayList<Map<Integer, Integer>>(map.keySet());
           System.out.print(keys);

           for (int i = 0; i < keys.size(); i++){
               Integer sum = map.get(keys.get(i));
               for(int j = i+1; j< keys.size(); j++){
                   if (map.get(keys.get(j)) == sum){
                       return true;
                   }
               }
           }

           return false;
       }

       public static void main(String[] args) {

          ArrayList<Integer> array = new ArrayList<>();

          array.add(1);
          array.add(2);
          array.add(3);
          array.add(4);

          System.out.print(fourSumProblem(array));


       }
}