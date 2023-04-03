public class Main {

    public static void main(String[] args) {

        int a = 2;
        int b = 2;
        int c = 3;
        int d = 3;

        int sum1 = a+b;
        int sum2 = c+d;

        System.out.println("sum1 =" + sum1);
        System.out.println("sum2 =" + sum2);

        boolean isSum1biggerSum2 = (sum1 > sum2);
        System.out.println(isSum1biggerSum2);

        sum1+=1;
        sum2-=2;

        System.out.println("sum1 =" + sum1);
        System.out.println("sum2 =" + sum2);

        boolean isnewSum1biggernewSum2 = (sum1 > sum2);
        System.out.println(isnewSum1biggernewSum2);

        boolean result = (sum1 % 2) == 0 || (sum2 % 2)==0;
        System.out.println(result);
    }
}
