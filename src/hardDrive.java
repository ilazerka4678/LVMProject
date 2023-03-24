
public class hardDrive extends LVM{
    private String size;

    public hardDrive(String n, String size){
        super(n);
        this.size = size;
    }
    public String getSize(){
        return size;
    }

}
