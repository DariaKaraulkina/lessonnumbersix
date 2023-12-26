import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] result = catsHangry();
        String strResult = Arrays.toString(result);
        System.out.println(strResult);
    }

    public static int[] catsHangry() {
        int[] myArray = new int[3];
        Scanner in = new Scanner(System.in);
        System.out.print("Введите процент сытости 1го котика:");
        myArray[0] = in.nextInt();
        System.out.print("Введите процент сытости 2го котика:");
        myArray[1] = in.nextInt();
        System.out.print("Введите процент сытости 3го котика:");
        myArray[2] = in.nextInt();
        in.close();

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 100) {
                myArray[i] = i + (100 - i);
            } else if (myArray[i] > 100) {  //ошибка входных данных, котик полностью сыт
                myArray[i] = 100;
            } else
                myArray[i] = 100;
        }
        return myArray;
    }
}