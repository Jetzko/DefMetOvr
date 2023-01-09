public class Start {
    public static void main(String[] args) {
        SmartphonePrice producer1 = new SmartphonePrice("Producer 1", 69.99);
        SmartphonePrice producer2 = new SmartphonePrice("Producer 2", 99.99);

        SmartphonePrice retail1 = new SmartphonePrice("Retail 1", 319.99);
        SmartphonePrice retail2 = new SmartphonePrice("Retail 2", 199.99);

        Smartphone smartphone1 = new Smartphone("Samsung", "A40", 5000, producer1, retail1);
        Smartphone smartphone2 = new Smartphone("iPhone", "8", 4500, producer2, retail2);

        System.out.println(smartphone1);
        System.out.println(smartphone2);

        System.out.println(smartphone1.equals(smartphone2));

        try {
            Smartphone smartphoneCloned = smartphone2.clone();
            System.out.println(smartphoneCloned);
            System.out.println(smartphone2.equals(smartphoneCloned));
        } catch (Exception exeption) {
            exeption.printStackTrace();
        }
    }
}
