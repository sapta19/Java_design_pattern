public class Adapter implements AppleCharger{
    AndroidCharger androidCharger;

    public Adapter(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }
    @Override
    public void charge(){
        androidCharger.charge();
        System.out.println("Charging with adapter..");
    }

}
