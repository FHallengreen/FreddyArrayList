import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class FreddyArrayList<T> {

    // Class Object is the root of the class hierarchy. Every class has Object as a superclass. All objects, including arrays, implement the methods of this class.
    // Object[] stores the objects in an array. In this case we use int.
    private T[] freddyArrayList;
    private int elementsInFreddyArray;

    // Only if I is greater than 0, can below Contructor be initialized with i as the size and elements = 0.
    //
    public FreddyArrayList(int initialCapacity) {
        this.freddyArrayList = (T[]) new Object[initialCapacity];
        this.elementsInFreddyArray = 0;
    }

    //checks if array length matches elements in array.
    private boolean isArrayFull() {
        return this.elementsInFreddyArray == this.freddyArrayList.length;
    }

    public int size() {
        return this.elementsInFreddyArray;
    }

    // adds an int to the array[i] position. If value on position is 0, it will overwrite value and add one to the elements and afterwards break out the loop.
    public void addInt(Object value) {
        if (isArrayFull()) {
            increaseArray();
        }
        this.freddyArrayList[this.elementsInFreddyArray] = (T) value;
        this.elementsInFreddyArray++;

        for (int i = 0; i < freddyArrayList.length; i++) {
            if (freddyArrayList[i] == null) {
                removeFromArray(freddyArrayList[i]);
            }
        }
    }

    private void increaseArray() {
        Object[] newFreddyArray = new Object[freddyArrayList.length * 2];

        for (int i = 0; i < freddyArrayList.length; i++) {
            newFreddyArray[i] = freddyArrayList[i];
        }
        freddyArrayList = (T[]) newFreddyArray;
    }

    public void removeFromArray(Object value) {
        for (int i = 0; i < freddyArrayList.length; i++) {
            if (value == freddyArrayList[i]) {
                freddyArrayList[i] = null;
                this.elementsInFreddyArray--;
            }
        }
    }


    // takes the index from the for loop and assigns value with it's value. It returns the value where get is called.
    public Object get(int index) {
        Object value = null;
        try {
            value = this.freddyArrayList[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.exit(-1);
        }
        return value;
    }


    public static void main(String[] args) {

        FreddyArrayList<Object> test = new FreddyArrayList<>(5);
        System.out.println(Arrays.toString(test.freddyArrayList));

        Car car = new Car(2022, "Ford");
        test.addInt(car);
        System.out.println(test.get(0));
        System.out.println(Arrays.toString(test.freddyArrayList));
    }
}