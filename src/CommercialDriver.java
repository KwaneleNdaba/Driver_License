public class CommercialDriver extends GenericDriver {

    //The instance var remembers the hazardousMaterialsType
    // the driver can transport
    private String hazardousMaterialsType;

    private String carType; //specific car for a driver

    public CommercialDriver(String name , boolean isPrivisional,
                            String materialType, String car){
        super(name, isPrivisional);

        hazardousMaterialsType = materialType;
        carType = car;

    }

    public String getMaterialsType(){
        return hazardousMaterialsType;
    }

    @Override
    public void setMedicalReport(){
        medicalReport = "Approved to drive " + carType ;

    }
}
