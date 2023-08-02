public class Demo20 {
    public static void main(String[] args) {
        //(Simple|Complex)Data type -->String
        int x=10;
        String myStr = x + "";

        boolean myBoolean=false;
        String myStr2 = myBoolean + "";

        //String --> primitive data type

        
        
        /*Wrwappers

         * Byte.valueOf(String)->byte
         * short.valueOf(String)->short
         * String.charAt(index)->char
         * Integer.valueOf(String)->int
         * Long.valueOf(String)->long
         * Float.valueOf(String)->float
         * Double.valueOf(String)->double
         */

        String myStr3 ="10";
        byte myByte= Byte.valueOf(myStr3);
        System.out.println(myByte);
    }
}
