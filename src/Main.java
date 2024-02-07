public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 4");
        int deliveryDistance = 102;
        int minDelivery = 1;
        if (deliveryDistance > 100) {
            System.out.println("Нет доставки");
        } else {
            if (deliveryDistance > 20) {
                minDelivery++;
            }
            if (deliveryDistance > 60) {
                minDelivery++;
            }
            System.out.println("Доставка займет " + minDelivery + " суток");
        }
    }
}