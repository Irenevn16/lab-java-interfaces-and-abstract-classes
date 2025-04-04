import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTask {

    //round to the nearest hundredth and return as a double
    public static double roundToHundredth(BigDecimal number) {
        return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
    //reverse the sign, round to nearest tenth, return as a BigDecimal
    public static BigDecimal reverseSign(BigDecimal number) {
        return number.negate().setScale(1, RoundingMode.HALF_UP);
    }
    //probamos
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("8.5248");
        BigDecimal num2 = new BigDecimal("2.96854");
        BigDecimal num3 = new BigDecimal("-1.62045");

        System.out.println("Number " + num1 + ", rounded to hundredth: " + roundToHundredth(num1));
        System.out.println("Number " + num2 + ", reversed and rounded: " + reverseSign(num2));
        System.out.println("Number " + num3 + ", " + reverseSign(num3));
    }
}
