import org.apache.commons.lang3.math.NumberUtils;

import java.math.BigDecimal;

public class test {
    public static void main(String[] args) {
        double GOODS_CUSTOM_INSURACNE_AMOUNT_MAX = 999999;
        double DEFAULT_CUSTOM_INSURACNE_AMOUNT = -1;

        String propertyValue = "59.9919";
        double customInsuranceAmount =  NumberUtils.toDouble(propertyValue, DEFAULT_CUSTOM_INSURACNE_AMOUNT);
        if (customInsuranceAmount < 0 || customInsuranceAmount > GOODS_CUSTOM_INSURACNE_AMOUNT_MAX) {
            customInsuranceAmount = DEFAULT_CUSTOM_INSURACNE_AMOUNT;
        }
        customInsuranceAmount = round(customInsuranceAmount, 2);
        System.out.println("---------:" + customInsuranceAmount);
    }
    /**
     * 提供精确的小数位四舍五入处理。
     *
     * @param v     需要四舍五入的数字
     * @param scale 小数点后保留几位
     * @return 四舍五入后的结果
     */
    public static double round(double v, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException(
                    "The scale must be a positive integer or zero");
        }
        BigDecimal b = new BigDecimal(Double.toString(v));
        BigDecimal one = new BigDecimal("1");
        return b.divide(one, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
