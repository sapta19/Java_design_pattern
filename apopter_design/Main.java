public class Main {
    public static void main(String args[]){
        System.out.println("Program Started");
        Iphone app = new Iphone(new AppleChargerImpl());
        app.chargePhone();
    }
}
