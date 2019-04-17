public class Test3 {
    public static void main(String[] args) {

       System.out.printf("Площадь треугольика", geroneSquare(10, 5, 5));
    }

    public static double geroneSquare(double a,double b, double c){
        double p = (a + b + c)/2;
    return Math.sqrt(p*(p-a)*p-b)*(p-c);

    }}



