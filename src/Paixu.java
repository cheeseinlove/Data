import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 讯 on 2017/1/16.
 */
public class Paixu {
    public static void main(String[] args) {
        int a[] = {1, 3, 2, 7, 2, 4, 5, 7, 2};
        int b[]={48,15,24,59,64,79,97,40};
        Paixu p1 = new Paixu();

        p1.straightInsertionSort(a);//直接选择排序
        p1.ShellSort(a);//希尔排序
p1.QuickSort(b,0,7);//一趟快速排序
    }

    public void bubbleSort() {
        int temp = 0;
        List<Integer> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; ; i++) {
            int b = sc.nextInt();
            if (b == 0)
                break;
            a.add(b);
        }
        System.out.print(a.toString());

        for (int i = 0; i < (a.size() - 1); i++) {
            for (int j = 0; j < (a.size() - 1); j++) {
                if (a.get(j) > a.get(j + 1)) {
                    temp = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, temp);
                }
            }
        }
        System.out.print(a.toString());
    }

    public void straightInsertionSort(int array[]) {//直接选择排序
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (array[j] < array[j - 1] && j >= 0) {
                int t = array[j - 1];
                array[j - 1] = array[j];
                array[j] = t;
                j--;
            }
            /*int temp = array[i];
            for (int j = i - 1; j >= 0 && temp < array[j]; j--) {
                array[j + 1] = array[j];
                array[j] = temp;
            }*/
        }
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i]);
    }

    public void ShellSort(int array[]) {//希尔排序是直接选择排序的优化

        for (int d = array.length / 2; d > 0; d /= 2) {
            for (int i = 0; i < array.length; i++) {
                int j = i;

                while (j + d < array.length) {
                    if (array[j] > array[j + d]) {
                        int t = array[j];
                        array[j] = array[j + d];
                        array[j + d] = t;

                    }
                    j = j + d;
                }
            }
        }
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i]);
    }

    public void QuickSort(int array[], int start, int end) {
        int i = start;
        int j = end;
        int key = array[0];

while (i<j){
    for(;;j--){
        if (array[j]<=key){
            int t=array[j];
            array[j]=array[i];
            array[i]=t;
            break;
        }}

        for (;;i++){
            if (array[i]>=key){
                int t=array[i];
                array[i]=array[j];
                array[j]=t;
                break;
            }
        }

    }

        for (int k = 0; k < array.length; k++)
            System.out.print(array[k]+" ");

    }
}


