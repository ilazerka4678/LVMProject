import java.util.UUID;
import java.util.ArrayList;
import java.util.Arrays;
public class LVM {
    private String uuid;
    private String name;
    private ArrayList<hardDrive> driveList;
    private ArrayList<physicalVolume> physVolList;
    public LVM(String n){
        name = n;
        UUID u = UUID.randomUUID();
        uuid = u.toString();
        driveList = new ArrayList<hardDrive>();
        physVolList = new ArrayList<physicalVolume>();
    }
    public String getUuid(){
        return uuid;
    }
    public String getName(){
        return name;
    }
    public ArrayList<hardDrive> getDriveList(){
        return driveList;
    }
    public ArrayList<physicalVolume> getPhysVolList(){
        return physVolList;
    }
    public int findDriveIndex(String driveName){
        int i = 0;
        String compareName = driveList.get(0).getName();
        while (i < driveList.size() && !(driveName.equals(compareName))){
            compareName = driveList.get(i).getName();
            i++;
        }
        if (driveName.equals(compareName)){
            return i;
        }
        return -1;
    }
    public boolean addHardDrive(hardDrive drive){
        for (int i = 0; i < driveList.size(); i++){
            if (driveList.get(i).getName().equals(drive.getName())){
                return false;
            }
        }
        driveList.add(drive);
        return true;
    }
    public boolean addPhysicalVolume(physicalVolume volume){
        for (int i = 0; i < physVolList.size(); i++){
            if (physVolList.get(i).getName().equals(volume.getName())){
                return false;
            }
        }
        for (int i = 0; i < physVolList.size(); i++){
            if (physVolList.get(i).getAssociatedDrive().equals(volume.getAssociatedDrive())){
                return false;
            }
        }
        for (int i = 0; i < driveList.size(); i++){
            if (volume.getAssociatedDrive().equals(driveList.get(i))){
                physVolList.add(volume);
                return true;
            }
        }
        return false;
    }

    public String listDrives(){
        String output = "";
        for (int i = 0; i < driveList.size(); i++){
            output+= driveList.get(i).getName() + " [" + driveList.get(i).getSize() + "] [" + driveList.get(i).getUuid() + "]\n"  ;
        }
        return output;
    }
}
