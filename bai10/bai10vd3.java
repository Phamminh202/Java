package bai10;
class bai10vd3 extends bai10vd1{
    private boolean powerSteer;
    /**
     * Parameterized constructor to initialize values based on user input
     *
     * @param vID a String variable storing vehicle ID
     * @param vName a String variable storing vehicle name
     * @param numWheels an integer variable storing number of wheels
     * @param pSteer a String variable storing steering information
     */

    public bai10vd3(String vID,String vName,int numWheels,boolean pSteer){
        vehicleNo=vID;
        vehicleName=vName;
        wheels=numWheels;
        powerSteer=pSteer;
    }

    /**
     * Display vehicle details
     *
     * @return void
     */

    public void showDetails() {
        System.out.println("Vehicle no:" + vehicleNo);
        System.out.println("Vehicle name:" + vehicleName);
        System.out.println("Number of Wheels:" + wheels);

        if (powerSteer == true) {
            System.out.println("Power Streering: Yes");
        } else {
            System.out.println("Power Streering: No");
        }
        /**
         * Overridden method
         * Accelerates the vehicle
         *
         * @return void
         */
        @Override
         public void accelerate(int speed){
            System.out.println("Maximum acceleration:"+speed+"kmph");
        }
    }

    /**
     * Define the TestVehicle.java class
     */
    public class TestVehicle{
        /**
         * @param args the v=command line arguments
         */
        public static void main(String[] args){
            bai10vd2 objFour=new bai10vd2("LA-09 CS-1406","Volkswagen",4,true);
            objFour.showDetails();
            objFour.accelerate(200);
        }
    }
}
