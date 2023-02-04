import java.util.ArrayList;
import java.util.List;
public class PC {
    private List<Parts> items = new ArrayList<Parts>();

    public void addItem(Parts item){
        items.add(item);
    }

    public int getCost(){
        int cost = 0;
        for (Parts item:items){
            cost += item.price();
        }
        return cost;
    }

    public void showParts(){
        for(Parts item : items){
            System.out.println(item.type()+": "+item.name()+"-> "+item.price() + " Tk");
        }
    }
}
