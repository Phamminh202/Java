package ThucHanh;

public class Bank {
    private double balance,rate;

    public Bank(double balance){
        this.balance=balance;
    }
    public double calculateInternet(){
        return rate=balance*10;
    }

    public double getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "Your interest ="+balance*(rate/1200);
    }
}
