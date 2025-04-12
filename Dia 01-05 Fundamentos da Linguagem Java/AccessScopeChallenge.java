import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.List;

// Crie um sistema que demonstre:
// 1. Diferentes modificadores de acesso (public, private, protected, default)
// 2. Escopo de variáveis em diferentes níveis
// 3. Uso de static e final em contextos variados


public class AccessScopeChallenge {


    public final String name;
    private final BarcodeType barcodeType;
    protected double price;
    String model;

    public enum BarcodeType implements NumberGenerator{
        EAN_13 {
            @Override
            public String numberGenerator() {
                return generateRandomNumber(13);
            }
        },

        UPC_A {
            @Override
            public String numberGenerator() {
                return generateRandomNumber(12);
            }
        },
        EAN_8{
            @Override
            public String numberGenerator(){
                return generateRandomNumber(8);

            }

        },
        CODE_128 {
            @Override
            public String numberGenerator(){
                return generateAlphaNumericCode(RandomNumber.RESULT);
            }

        };


        public String generateRandomNumber(int length) {
            int[] numbers = {0,1,2,3,4,5,6,7,8,9};
            List<String> digits = new ArrayList<>();

            while (digits.size() < length) {
                int random = numbers[ThreadLocalRandom.current().nextInt(numbers.length)];
                digits.add(String.valueOf(random));
            }

            return String.join("",digits);
        }


        public String generateAlphaNumericCode(int length) {
            String[] numbers = {"-", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F",
                    "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

            List<String> digits = new ArrayList<>();

            while (digits.size() < length) {
                String random = numbers[ThreadLocalRandom.current().nextInt(numbers.length)];
                digits.add(random);

                if (digits.size() == 7 || digits.size() == 14 || digits.size() == 21 || digits.size() == 38 || digits.size() == 48) {
                    digits.add(numbers[0]);
                }

            }

            return String.join("",digits);
        }

    }



    public interface NumberGenerator{
        String numberGenerator();
    }





    private static class RandomNumber{

        private static final int RESULT = ThreadLocalRandom.current().nextInt(30, 61);

    }


    public AccessScopeChallenge(String name, double price, String model, BarcodeType barcodeType) {
        this.name = name;
        this.barcodeType = barcodeType;
        this.price = price;
        this.model = model;
    }


    //    static variable
    public static final String WELCOME = "--------------------------------------WELCOME--------------------------------------\n\n\n";




    //    instance variable


    // Implemente classes que demonstrem os conceitos de modificadores





    protected void keyboardInfo() {
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Generating Keyboard Info.....");
        System.out.println("Name: " + this.name);
        System.out.println("Barcode Type: " + this.barcodeType);
        System.out.println("Price: $" + this.price);
        System.out.println("Model: " + this.model);
        System.out.println("Generated Barcode: " + this.barcodeType.numberGenerator());
        System.out.println("-------------------------------------------------------------------------------");
    }


    public static void main(String[] args) {
        System.out.println(WELCOME);
        AccessScopeChallenge accessScopeChallenge = new AccessScopeChallenge("AK820 Pro",480.00,"Ajazz", BarcodeType.EAN_8);
        accessScopeChallenge.keyboardInfo();
    }

}

