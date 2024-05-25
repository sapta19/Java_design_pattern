package adapter_design;
public class Main {
    public static void main(String args[]){
        System.out.println("Program Started");
        
       // AndroidPhone androidPhone = new AndroidPhone(new AndroidChargerImpl());
       // androidPhone.chargePhone();
        Iphone app = new Iphone(new Adapter(new AndroidChargerImpl()));
        app.chargePhone();
    }
}
