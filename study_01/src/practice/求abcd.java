package practice;

public class 求abcd {
    public static void main(String[] args) {
        //int a,b,c,d;
        //int result = (a*10+b+c*10+d)*(a*10+b+c*10+d)=a*1000+b*1000+c*100+d;
        for (int a = 1; a < 10 ; a++) {
            for (int b = 0; b < 10 ; b++) {
                for (int c = 0; c < 10; c++) {
                    for (int d = 0; d < 10; d++) {
                        if ( ( (a*b+c*d)*(a*b+c*d) )== a*b*c*d){
                            System.out.println("a  "+a);
                            System.out.println("b  "+b);
                            System.out.println("c  "+c);
                            System.out.println("d  "+d);
                        }
                    }
                }
            }
        }
    }
}
