import java.util.Scanner;

/**
 * Created by NBPCG on 2016/4/14.
 */
public class E19 {


    public static void main(String[] args) {

        int n = 7;

        System.out.println("Please input an odd integer : ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();


        int split = n/2;

        // 前 n/2 + 1行
        // 输出正三角
        //i 为行，j为列，根据行i，确定每个列j的元素输出值
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                if(i<split){
                    if (j < split - i) {
                        System.out.print(" ");
                    } else if (j > split - i && j < split + i + 1) {
                        System.out.print("x");
                    } else if (j == split + i + 1) {
                        System.out.println("x");
                        break;
                    }
                }
                else if(i==split)
                {
                    if(j==n-1){
                        System.out.println("x");
                        break;
                    }
                    else {
                        System.out.print("x");
                    }
                }
                else {

//                    if(j<i-split){
//                        System.out.print(" ");
//                    }
//                    else if(j>i-split && j<=n-i+2 ) {
//                        System.out.print("x");
//                    }
//                    else if(j>n-i+2){
//                        System.out.println("x");
//                        break;
//                    }

                }

            }

        }

        // 后n/2 行
        // 输出倒三角,总行数为split=n/2;
        for (int i = split; i >=1 ; i--)
        {
            // 确定每行空格的个数，确定每行x个数，最后一个为带回车的x
            for (int j = 0; j<=split-i ; j++) // 1 2 3
            {
                System.out.print(" ");
            }
            for (int k = 0; k <2*i-2 ; k++) // 4 2 0
            {
                System.out.print("x");
            }
            System.out.println("x");
        }



//        for (int i = 0; i < n ; i++) {
//
//            for (int j = 0; j < n; j++) {
//
//                if(i<split){
//                    if (j < split - i) {
//                        System.out.print(" ");
//                    } else if (j > split - i && j < split + i + 1) {
//                        System.out.print("x");
//                    } else if (j == split + i + 1) {
//                        System.out.println("x");
//                        break;
//                    }
//
//                }
//                else {
//                    if(j<i-split){
//                        System.out.print(" ");
//                    }
//                    else if(j>=i-split && j<n-i+2) {
//                        System.out.print("x");
//                    }
//                    else if(j==n-i+2){
//                        System.out.println("x");
//                        break;
//                    }
//
//                }
//
//            }
//
//        }

    }

}
