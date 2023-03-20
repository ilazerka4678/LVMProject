
public class hardDrive extends LVM{
    private int size;

    public hardDrive(String n, int s){
        super(n);
        size = s;
    }
    public int getSize(){
        return size;
    }

}
