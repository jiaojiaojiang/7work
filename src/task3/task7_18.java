package task3;
import java.util.Arrays;
import java.util.Scanner;
public class task7_18 {
    public static void main(String[] args) {

        double[] list = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.print("请输入10个double型值：");
        for (int i = 0; i < 10 ; i++){
            list[i] = input.nextDouble();
        }
        list = bubble(list);
        System.out.print(Arrays.toString(list));
    }
    public static double[] bubble(double[] list){
        int length = list.length;
        double temp = 0;
        for (int a = 0 ; a < length - 1 ; a++){
            for (int i = 0 ; i < length - 1 ; i++){
                if (list[i] > list[i+1]){
                    temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                }
            }
        }
        return list;
    }
}
