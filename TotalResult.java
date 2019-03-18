public class TotalResult
{
    //this method describe subject and marks
    static int maths = 34;
    static int english =37;
    static int economics =37;

  //this method will perform addition
    static void addition( int maths, int eng, int eco)
    {
        System.out.println("Total Mark");
        System .out.println(maths+eng+eco);

    }
    //this method will perform percentage
    static void percentage(int maths,int eng,int eco)
    {

        System.out.println("Total Percentage");
        System.out.println((maths+eng+eco)*100/120);


    }
    //java main method
        public static void main (String[] args)

        {

           addition(34, 37 ,37);
           percentage(34, 37, 37 );

        }



}



