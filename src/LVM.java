import java.util.UUID;
import java.util.ArrayList;
import java.util.Arrays;
public class LVM {
    private String uuid;
    private String name;
    private ArrayList<hardDrive> driveList;
    public LVM(String n){
        name = n;
        UUID u = UUID.randomUUID();
        uuid = u.toString();
        driveList = new ArrayList<hardDrive>();
    }
    public String getUuid(){
        return uuid;
    }
    public String getName(){
        return name;
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
    public String listDrives(){
        String output = "";
        for (int i = 0; i < driveList.size(); i++){
            output+= driveList.get(i).getName() + " [" + driveList.get(i).getSize() + "GB] [" + driveList.get(i).getUuid() + "]\n"  ;
        }
        return output;
    }
}
