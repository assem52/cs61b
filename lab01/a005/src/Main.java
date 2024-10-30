
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
        IntList L = new IntList();
        L.first = 5;
        L.rest = new IntList();
        L.rest.first = 10;
        L.rest.rest = new IntList();
        L.rest.rest.first = 17;
        L.rest.rest.rest = new IntList();
        L.rest.rest.rest.first = 42;
        L.rest.rest.rest.rest = new IntList();
        L.rest.rest.rest.rest.first = 999;
        L.rest.rest.rest.rest.rest = null;
        print(L);
      System.out.println(get(L,4));
    }
        public static void print(IntList L) {
            IntList current = L;
            while (current != null) {
                System.out.println(current.first);
                current = current.rest;
            }
        }
    public static int get(IntList L,int i) {
        if (i == 0){
            return L.first;
        }
        return get(L.rest,i -1);
    }

//    public static void gett(IntList L, int i) {
//        IntList curr = L;
//
//        for (int k = 0; k < i; k++) {
//            curr = curr.rest; // Move to the next node
//        }
//
//        // Print the value at index i (assuming i is within bounds)
//        System.out.println(curr.first);
//    }

}







