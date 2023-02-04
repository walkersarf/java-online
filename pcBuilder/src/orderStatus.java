public class orderStatus {
    private boolean status;
    public orderStatus(){
        status = false;
    }
    public void open(){
        status = true;
    }
    public void close(){
        status = false;
    }
    public boolean getStatus(){
        return status;
    }
}
