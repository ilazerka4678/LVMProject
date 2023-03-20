import java.util.ArrayList;
public class volumeGroup extends LVM {
    private ArrayList<physicalVolume> physVolumeList;
    public volumeGroup(ArrayList<physicalVolume> physList, String n){
        super(n);
        physVolumeList = physList;
    }

}
