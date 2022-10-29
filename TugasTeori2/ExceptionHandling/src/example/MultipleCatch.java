package example;
public class MultipleCatch {
    public static void main(String[] args) {
        int num1 = 5, num2 = 0;
        int arrNum[] = {1,2,3,0};
        try{
            int num3 = num1/arrNum[3];
            int num4 = num1/num2;
            System.out.println("The num3 "+num3);
            System.out.println("The 3 element is "+arrNum[3]);
        }
        catch(ArithmeticException obj){
            System.out.println("Division by zero");
        }
        catch(ArrayIndexOutOfBoundsException obj){
            System.out.println("Error Out of Bounds");
        }
        catch(Exception obj){
            System.out.println("Other error");
        }
    }
}
