public class ForceConvert {
    public static void main(String[] args) {
        // int 转换成long
        int intVal = 99;
        long longVal = 19999;
        intVal = (int) longVal;
        System.out.println(intVal);

        // float 转换成double
        float floatVal = 11.3f;
        double doubleVal = 333334.12;
        floatVal = (float) doubleVal;
        System.out.println(floatVal);

        // int传话成char
        int a = 65;
        char b = (char) a;
        System.out.println(b);

    }
}
