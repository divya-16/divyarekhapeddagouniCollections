package eapmcom.Collections;

public class Main {
	public static void main(String[] args) 
    {
        DataList<Integer> list = new DataList<Integer>();
 
        //Add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
         
       
        list.remove(3);
        System.out.println(list);
    
        System.out.println( list.get(0) );
        System.out.println( list.get(1) );
 
        
        System.out.println(list.size());
    }

}
