import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<FoodInADish<Food>> list = new ArrayList<FoodInADish<Food>>();
        list.add(new FoodInADish<Food>(new Fruit("apple", 0.182, true), "green"));
        list.add(new FoodInADish<Food>(new Fruit("banana", 0.118, true), "blue"));

    }
}
