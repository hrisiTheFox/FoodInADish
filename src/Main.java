import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<FoodInADish<Food>> list = new ArrayList<FoodInADish<Food>>();
        list.add(new FoodInADish<Food>(new Fruit("apple", 0.182, true), "green"));
        list.add(new FoodInADish<Food>(new Fruit("banana", 0.118, true), "blue"));
        list.add(new FoodInADish<Food>(new Vegetable("pepper", 0.123, true), "black"));

        System.out.println(list.get(0).compareTo(list.get(1)));
        System.out.println(list.get(0).compareTo(list.get(2)));
        System.out.println(list.get(0).compareTo(list.get(1)));
        Collections.sort(list);
        for (FoodInADish f: list){
            System.out.println(f.toString());
        }

    }
}
