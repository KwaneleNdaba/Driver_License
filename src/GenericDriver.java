public class GenericDriver {
    private String name;
    private int points;
    private boolean isProvisional;

    public GenericDriver(){

    }
    protected String medicalReport; //the super and subclass will have access to this instance var

    public GenericDriver(String name , boolean isProvisional){
        this.name = name ;
        this.isProvisional = isProvisional;
        points = 15;//at the beginning the driver will have 15 points

    }

    public String getName(){
        return name;
    }

    public int getPoints(){
        return points;
    }

    public boolean getIsProvisional(){
        return  isProvisional;
    }

    public String getMedicalReport(){
        return medicalReport;
    }

    public void setMedicalReport(){
        medicalReport = "Approved to drive private car";
    }

    public void deduct(int p){
        if(points >= p){
            points -= p;
        }else{
            points = 0;
        }

        if(points == 0){
            System.out.println("License Suspended");
        }
    }

}
