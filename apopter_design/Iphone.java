public class Iphone {
    AppleCharger applecharger;
    public Iphone(AppleCharger applecharger){
        this.applecharger=applecharger;
    }
    void chargePhone(){
        applecharger.charge();
    }
}