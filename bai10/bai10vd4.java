package bai10;

class bai10vd1 {
    private boolean powerSteer;
    /**
     * Parameterized constructor to initialize values based on user input
     *
     * @param vID a String variable storing vehicle ID
     * @param vName a String variable storing vehicle name
     * @param numWheels an integer variable storing number of wheels
     * @param pSteer a String variable storing steering information
     */

    public bai10vd1(String vID,String vName,int numWheels,boolean pSteer){
        vehicleNo=vID;
        vehicleName=vName;
        wheels=numWheels;
    }
    /**
     * Accelerates the vehicle
     *
     * @return void
     */
    public void accelerate(int speed){
        System.out.println("Accelerating at:"+speed+"kmph");
    }
}
