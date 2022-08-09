import java.util.Arrays;

public class FreddyArrayList {

    // Class Object is the root of the class hierarchy. Every class has Object as a superclass. All objects, including arrays, implement the methods of this class.
    // Object[] stores the objects in an array. In this case we use int.
    private int[] freddyArrayList;
    private int elementsInFreddyArray;
    private static final int DEFAULT_CAPACITY = 2;

    public FreddyArrayList() {
        this(DEFAULT_CAPACITY);
    }

    // Only if i is greater than 0, can below Contructor be initialized with i as the size and elements = 0.
    //
    public FreddyArrayList(int i) {
        if (i <= 0) {
            System.out.println("Size cannot be less than 0");
        } else {
            this.freddyArrayList = new int[i];
            this.elementsInFreddyArray = 0;
        }
    }

    //checks if array length matches elements in array.
    private boolean isArrayFull() {
        return this.freddyArrayList.length == this.elementsInFreddyArray;
    }

    public int size() {
        return this.elementsInFreddyArray;
    }

    public int[] array() {
        return this.freddyArrayList;
    }

    // adds an int to the array[i] position. If value on position is 0, it will overwrite value and add one to the elements and afterwards break out the loop.
    public void addInt(int value) {
             if (isArrayFull()){
                 increaseArray();
                 System.out.println("Array is full, cannot add entered value: " + value);
            }
                this.freddyArrayList[this.elementsInFreddyArray] = value;
                this.elementsInFreddyArray++;
    }

    // TODO: increase array size.
    private void increaseArray() {
        int [] newFreddyArray = new int [freddyArrayList.length * 2];

        for (int i = 0; i < freddyArrayList.length; i++) {
            newFreddyArray[i] = freddyArrayList[i];
        }

        freddyArrayList = newFreddyArray;
    }

    // TODO: remove element from the array.


    // takes the index from the for loop and assigns value with it's value. It returns the value where get is called.
    public int get(int index) {
        int value = 0;
        try {
            value = this.freddyArrayList[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.exit(-1);
        }
        return value;
    }

    public static void main(String[] args) {

        FreddyArrayList test = new FreddyArrayList();
        System.out.println(test.size());
        System.out.println(Arrays.toString(test.array()));
        test.addInt(39);
        test.addInt(22);
        test.addInt(11);
        System.out.println(Arrays.toString(test.array()));
    }
}