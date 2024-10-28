//public class BubbleSort {
//
//    public static void bubbleSort(int[] list){
//        boolean needNextPass = true;
//
//        for (int i = 0; i < list.length - 1; i++) {
//            needNextPass = false;
//            for(int j = list.length-1; j>i; j--){
//                if(list[j] < list[j-1]){
//                    int temp = list[j];
//                    list[j] = list[j-1];
//                    list[j-1] = temp;
//                    needNextPass =true;
//                }
//            }
//        }
//        for (int i : list)
//            System.out.print(list[i] + " ");
//    }
//}
