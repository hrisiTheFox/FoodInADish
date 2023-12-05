import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class Main {
    public static void main(String[] args) throws IOException {

        JFrame frame = new JFrame();
        frame.setTitle("Food in a dish");
        frame.setSize(1050,200);
        frame.setLayout(null);

        JPanel allPnl = new JPanel();

        List<FoodInADish<Food>> list = new ArrayList<FoodInADish<Food>>();
        list.add(new FoodInADish<Food>(new Fruit("blueberry", 0.182, true),DishColor.GREEN));
        list.add(new FoodInADish<Food>(new Fruit("banana", 0.118, true),DishColor.BLUE));
        list.add(new FoodInADish<Food>(new Vegetable("pepper", 0.123, true),DishColor.DARKBLUE));
        list.add(new FoodInADish<Food>(new Fruit("strawberry", 0.009, true),DishColor.BLUE));
        list.add(new FoodInADish<Food>(new Vegetable("lettuce", 0.324, true),DishColor.YELLOW));

        Collections.sort(list);
        int x = 0;
        for(FoodInADish f : list){
            JPanel newPanel = f.draw();
            newPanel.setBounds(x,0,200,200);
            x+=200;
            frame.add(newPanel);
        }

        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}
