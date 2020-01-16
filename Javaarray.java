import java.util.ArrayList;
import java.util.Arrays;

class Javaarray{
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>(Arrays.asList("Cat","Cow","Dog"));
        System.out.println("ArrayList: " + animals);

        String element = animals.get(1);
        System.out.println("Accessed Element: " + element);


    }

}