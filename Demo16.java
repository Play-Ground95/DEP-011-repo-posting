public class Demo16 {
    public static void main(String[] args) {
        byte myByte=10; //Implicitely narrowing primitive conversions -> the reason is 10 is in the byte range.

        final int myInt =10; //complile time constant
        byte myByte2=myInt; //Implicitely narrowing primitive conversions ->myInt is a compile time constant thats the reason

        int myInt2=10; //that is variable
        byte myByte3=(byte)myInt2; //CASTING //Explicitly narrowing primitive conversion

        byte myByte4=(byte)256; //can do it but havent a accuracy //sign can be change //risk have
        System.out.println(myByte4);

        //byte myByte5 =(byte) (5>2);
        byte myByte6 =(byte) (10+250);
        
        //byte myByte7 =(byte) "abc";
        
        // Object a= "abc";
        // byte myByte8 =(byte) a;

        // Object b= "abc"; --> that is object but dont mentioned the data type thats the reason 
                               //it will give a run time error in runtime. but not get a error in compile time
        // byte myByte9 =(byte) a;

        // Calendar c = Calendar.getInstance();
        // byte myByte10 =(byte) c;

    }
}
