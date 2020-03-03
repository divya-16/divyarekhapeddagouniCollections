package eapmcom.Collections;

import java.util.Arrays;

public class DataList <L> {
	private int size = 0;
  
    private static final int DEFAULT_SIZE = 10;
     
 
    private Object values[];
 
  
    public DataList() {
        values = new Object[DEFAULT_SIZE];
    }
  
    public void add(L l) {
        if (size == values.length) {
            ensureCapacity();
        }
        values[size++] = l;
    }
  
    public L get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (L) values[i];
    }
   
    public L remove(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        Object item = values[i];
        int numElts = values.length - ( i + 1 ) ;
        System.arraycopy( values, i + 1, values, i, numElts ) ;
        size--;
        return (L) item;
    }
     

    public int size() {
        return size;
    }
     
    public String toString() 
    {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i = 0; i < size ;i++) {
             sb.append(values[i].toString());
             if(i<size-1){
                 sb.append(",");
             }
         }
         sb.append(']');
         return sb.toString();
    }
     
    private void ensureCapacity() {
        int newSize = values.length * 2;
        values = Arrays.copyOf(values, newSize);
    }
}

