
public class hardDrive extends LVM{
    private int size;
    private String sizeString;

    public hardDrive(String n, int s, String size){
        super(n);
        this.size = s;
        sizeString = this.size + size;
    }
    public int getSize(){
        return size;
    }

}
