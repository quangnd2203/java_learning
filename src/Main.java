import com.example.animal.Animal;
import com.example.animal_child.Cat;
import com.example.animal_child.Dog;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.speak();
//
//        Cat cat = new Cat();
//        cat.speak();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        for(int number: numbers){
            System.out.println(number);
        }
    }
}
