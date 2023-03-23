public class main {
    public static void main(String[] args) {
        LVM control = new LVM("control");
        hardDrive sda = new hardDrive("sda", 100);
        control.addHardDrive(sda);
        hardDrive sdb = new hardDrive("sdb", 200);
        control.addHardDrive(sdb);
        System.out.println(control.listDrives());

    }
}
