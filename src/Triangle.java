public class Triangle {
    int a;
    int b;
    int c;

    public void tro(){
       int  are = (a+b+c)/2;
        System.out.println((Math.sqrt(are * (are - a) * (are - b) * (are - c))));
    }
}
