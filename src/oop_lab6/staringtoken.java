package oop_lab6;

public class staringtoken {
    public class StringToken {
        public static void main(String[] args) {
            String msg = "Hello, RMUTSV Varunya Sudjan";
            StringTokenizer myToken = new StringTokenizer(msg);
            System.out.println(myToken.countTokens());

            while (myToken.hasMoreTokens()){
                StringBuffer myBuf = new StringBuffer(
                        myToken.nextToken());
                System.out.print(myBuf.reverse()+" ");
            }//while




        }//main
    }//class
