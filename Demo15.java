public class Demo15 {
    public static void main(String[] args) {
        byte myByte =10;
        int myInt =myByte;
        int myInt2 =Integer.valueOf(Integer.toBinaryString(myInt));
        System.out.printf("%032d \n",myInt2);

        byte myByte2 =-25;
        System.out.println(Integer.toBinaryString(myByte2));

        byte myByte3 =10; //--> is get in to final keyword into the front, automatically it is doing it's role like as a Compile time constant
        
        final int MY_INT3=myByte; //Runtime constant
        
        //byte myByte4=MY_INT3;

        final int MY_INT4 =15; //Compile time constant

        final int MY_INT5= 15* (int)Math.random(); //Runtime constant
    }
}
