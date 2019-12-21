public class ForceConvertValueLoss {
    public static void main(String[] args) {
        // long 转换成int、超出int范围、精度丢失
        int intVal = 99;
        long longVal = 55555555555L;
        intVal = (int) longVal;
        System.out.println(intVal);

        // double 转换成float、超出float范围、精度丢失。
        float floatVal = 11.32f;
        double doubleVal = 123456789.12345;
        floatVal = (float) doubleVal;
        System.out.println(floatVal);



    }
}
