public class logicalVolume extends LVM{
private volumeGroup associatedVolumeGroup;
public logicalVolume(volumeGroup volGroup, String n){
    super(n);
    associatedVolumeGroup = volGroup;
}
public volumeGroup getAssociatedVolumeGroup(){
    return associatedVolumeGroup;
}

}
