
public class physicalVolume extends LVM{
    private hardDrive associatedDrive;
    public physicalVolume(hardDrive drive, String n){
        super(n);
        associatedDrive = drive;
    }
    public hardDrive getAssociatedDrive(){
        return associatedDrive;
    }

}
