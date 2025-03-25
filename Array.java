public class Array {
    public static void main(String[] args) {
        double[] arr;

        arr = new double[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        prt_arr(arr);
        
        System.out.println("Arr 2 -> ");
        prt_arr(10, 11, 12, 13, 14, 15);

        double[] retArr = ret_arr();

        System.out.println("Returned arr -> ");
        prt_arr(retArr);

        Oblong ob = new Oblong(10.0, 20.0);

        System.out.println("Oblong Length is " + ob.getLength());
        System.out.println("Oblong Height is " + ob.getHeight());
        System.out.println("Oblong Area is " + ob.calculateArea());
        System.out.println("Oblong Perimeter is " + ob.calculatePerimeter());

    }

    // Java varargs
    static void prt_arr(double... arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static double[] ret_arr()
    {
        double[] arr = {1, 2, 3, 4, 5};
        return arr;
    }
}
