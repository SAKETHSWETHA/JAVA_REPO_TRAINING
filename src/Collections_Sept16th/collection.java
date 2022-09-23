package Collections_Sept16th;

import java.util.*;

public class collection {
    public static void main(String[] args) {
        Integer[] i = {1, 2, 3, 4, 5, 6};

        //List
        //List is an object of class list so it only accepts object parameter but not any primitive datatype like int etc.
        System.out.println("Array List Implementation: ");
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list.get(0));
        System.out.println(list.size());
        System.out.println(list.contains(20));

        for (int x : list) {
            System.out.println(x);
        }
        //list = Collections.unmodifiableList(list);


        //Stack
        System.out.println("Stack Implementation: ");
        Stack<Integer> stk = new Stack<Integer>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.pop();

        System.out.println("Located at index: " + stk.search(2));
        System.out.println(stk.peek());
        System.out.println(stk.isEmpty());
        System.out.println(stk);

        //Set-->Doesn't accept duplicates
        //Used to maintain unique set of data and also helps in faster access
        System.out.println("Set Implementation: ");
        Set<String> S = new HashSet<>();

        S.add("Swetha");
        S.add("Venkat");
        S.add("Ishaan");
        S.add("Saketh");
        //Can store the data in the form of hash_code
        System.out.println(S.hashCode());
        System.out.println(S);

        //Maps--> Key,Value pair(Similar to dictionary in python)
        System.out.println("Map Implementation: ");
        HashMap<String, Integer> M = new HashMap<>();
        M.put("Saketh", 2001);
        M.put("Deepika", 1988);
        System.out.println(M);
        System.out.println(M.containsKey("Saketh"));
        System.out.println(M.containsValue(1988));
    }
}
