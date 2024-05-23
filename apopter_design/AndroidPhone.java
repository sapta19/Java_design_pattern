public class AndroidPhone {
    private AndroidCharger androidCharger;
    public AndroidPhone(AndroidCharger androidCharger){
        this.androidCharger=androidCharger;
    }
    void chargePhone(){
        androidCharger.charge();
    }
}
