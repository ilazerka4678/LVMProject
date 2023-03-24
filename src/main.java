import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LVM control = new LVM("control");
        String input = "";
        String[] parameters = new String[3];
        while (!(input.equals("exit"))){
            input = sc.nextLine();
            parameters = input.split(" ");
            if (parameters[0].equals("install-drive")){
                hardDrive drive = new hardDrive(parameters[1], parameters[2]);
                if (!(control.addHardDrive(drive))){
                    System.out.println("Cannot install drive.");
                }
            }
            if (parameters[0].equals("list-drives")){
                System.out.println(control.listDrives());
            }
            if (parameters[0].equals("pvcreate")){
                if (control.findDriveIndex(parameters[2])==-1){
                    System.out.println("Hard drive doesn't exist.");
                }
                if ()
                else{
                    physicalVolume volume = new physicalVolume(control.getDriveList().get(control.findDriveIndex(parameters[2])),parameters[1]);
                    control.addPhysicalVolume(volume);
                }
            }
            if (parameters[0].equals("pvlist")){
               System.out.println(control.getPhysVolList());
            }
        }
    }
}
