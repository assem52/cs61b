public class IntList {
    public int first;
    public IntList rest;
    public int get (int i){
        if (i == 0){
            return this.first;
        }
        return (this.rest.get(i-1));
    }

    public int size(){
        if (rest == null){
            return 1;
        }
        return (1 + this.rest.size());
    }
    public IntList increList(IntList L, int x) {
        IntList q = new IntList(); // Create a new list head
        IntList current = q; // Pointer to build the new list

        while (L != null) { // Loop through the existing list
            current.first = L.first + x; // Increment the current value and assign it to the new node

            // Prepare the next node in the new list
            if (L.rest != null) {
                current.rest = new IntList(); // Create a new node for the next element
                current = current.rest; // Move to the next node in the new list
            }

            L = L.rest; // Move to the next node in the existing list
        }

        return q; // Return the new list (the head)
    }
    public static IntList dincreList (IntList L, int x) {
        L.first -= x;

        IntList curr = L;
        while (curr.rest != null) {
            curr.rest.first -= x;
            curr = curr.rest;
        }
        return L;
    }


    public static void main(String []args){
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
        System.out.println(L.get(1));
        System.out.println(L.size());
        IntList q = new IntList();
        q = q.increList(L, 5);
        System.out.println(q.get(1));
        IntList dec = new IntList();
        dec = dincreList(L,5);
        System.out.println(dec.get(2));
    }

}
