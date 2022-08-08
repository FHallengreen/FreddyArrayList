
public class FreddyArrayList {

    // Class Object is the root of the class hierarchy. Every class has Object as a superclass. All objects, including arrays, implement the methods of this class.
    // Object[] stores the objects in an array. In this case we use int.
    private Object[] freddyArrayList;
    private int elementsInFreddyArray;

    public FreddyArrayList() {
        this(10);
    }

    // Only if i is greater than 0, can below Contructor be initialized with i as the size and elements = 0.
    //
    public FreddyArrayList(int i) {
        if (i <= 0) {
            System.out.println("Size cannot be less than 0");
        } else {
            this.freddyArrayList = new Object[i];
            this.elementsInFreddyArray = 0;
        }
    }

    public int size() {
        return this.elementsInFreddyArray;
    }


    public static void main(String[] args) {

        FreddyArrayList test = new FreddyArrayList();
        System.out.println(test.size());
    }
}