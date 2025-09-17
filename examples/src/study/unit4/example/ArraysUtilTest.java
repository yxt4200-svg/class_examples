/*
 *定义数组工具类
 */
package study.unit4.example;

public class ArraysUtilTest{
    public static void main(String[] args) {
        ArraysUtil util = new ArraysUtil();
        int[] arr = new int[]{32,34,32,5,3,54,654,-98,0,-53,5};

        int max = util.getMax(arr);
        System.out.println("最大值：" + max);

        int min = util.getMin(arr);
        System.out.println("最小值：" + min);

        int sum = util.getSum(arr);
        System.out.println("总和：" + sum);

        System.out.println("排序前：");
        util.print(arr);

        System.out.println();

        System.out.println("排序后：");
        util.sort(arr);
        util.print(arr);

        System.out.println();

        System.out.println("查找：");
        int index = util.getIndex(arr,5);
        if(index >= 0){
            System.out.println("找到了，索引地址为：" + index);
        }else {
            System.out.println("没找到");
        }

    }
}


class ArraysUtil {
    // 求最大值
    public int getMax(int[] arr){
        int maxValue = arr[0];
        for(int i = 1;i < arr.length;i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    // 求最小值
    public int getMin(int[] arr){
        int minValue = arr[0];
        for(int i = 1;i < arr.length;i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }
        return minValue;
    }

    // 求总和
    public int getSum(int[] arr){
        int sum = 0;
        for(int i = 0;i< arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }

    // 求平均值
    public int getAvg(int[] arr){
        return getSum(arr) / arr.length;
    }

    // 反转数组
    public void reverse(int[] arr){
        for(int i = 0,j = arr.length - 1;i < j;i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    // 复制数组
    // 引用类型，只能装地址值或null
    public int[] copy(int[] arr){
        int[] arr1 = new int[arr.length];
        for(int i = 0;i < arr1.length;i++){
            arr1[i] = arr[i];
        }
        return arr1;
    }

    // 数组排序
    public void sort(int[] arr){
        for(int i = 0;i < arr.length - 1;i++){
            for(int j = 0;j < arr.length - 1 - i;j++){
                if(arr[j+1] < arr[j]){
//                    int temp = arr[j+1];
//                    arr[j+1] = arr[j];
//                    arr[j] = temp;
                    // 正确
                    swap(arr,j,j+1);
                    // 错误
                    // swap(arr[j],arr[j+1])
                }
            }
        }
    }

    // 交换数组元素
    public void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 遍历数组
    public void print(int[] arr){
        System.out.print("[");
        for(int i = 0;i < arr.length;i++){
            if(i < arr.length - 1){
                System.out.print(arr[i] + ",");
            }
            if(i == arr.length - 1){
                System.out.print(arr[i]);
            }
            // System.out.println(arr[i] + "\t");
        }
        System.out.println("]");
    }

    // 查找指定元素
    public int getIndex(int[] arr,int dest){
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == dest){
                return i;
            }
        }
        return -1;
    }

}
