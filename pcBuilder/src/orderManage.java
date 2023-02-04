import java.util.ArrayList;
import java.util.List;
public class orderManage {
    private static orderManage instance;
    private boolean status;
    private List <PC> added;
    public orderManage(){
        status = false;
        added = new ArrayList <PC>();
    }
    boolean isEmpty(){
        return added.isEmpty();
    }
    public void addPC(PC pc){
        added.add(pc);
    }
    public void closeOrder(){
        status = false;
        added.clear();
    }

    public List<PC> getAdded() {
        return added;
    }
    public boolean getStatus (){
        return status;
    }

    public void setStatus() {
        status = true;
    }
}
