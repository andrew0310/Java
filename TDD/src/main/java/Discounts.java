public class Discounts {

    public Discounts() {
    }

    public void giveDiscount(byte b) throws NumberFormatException {
        try {
            if (b >= 0 && b <= 6) {
                System.out.println("Discount for children under 6 years old.");
            } else if (b > 65) {
                System.out.println("Discount for eldest above 65 years old.");
            }
        } catch (NumberFormatException e) {
            System.out.println("ERROR, please specify propper age.");
            e.printStackTrace();
        }
    }
}
