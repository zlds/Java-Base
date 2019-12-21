public class AutoConvert {
    public static void main(String[] args) {
        int intVal = 99;
        long longVal = intVal;
        long longVal2 = intVal + 1;
        System.out.println(longVal2);

        float floatVal = 11.32f;
        double doubleVal = floatVal;
        double doubleVar1 = floatVal * 2;
        System.out.println(doubleVar1);

        // 双精度
        int a = 99;
      // int b = 5;
        double b = 5;
        System.out.println(a / b);


        // 类型转换
        char ch = 'A';
        int chnum = ch;
        int chcalc = ch + 10;
        System.out.println(ch);
        System.out.println(chnum);
        System.out.println(chcalc);
    }
}
