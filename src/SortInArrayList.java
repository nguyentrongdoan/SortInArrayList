import java.util.ArrayList;

public class SortInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0, 100);
        arr.add(1, 50);
        arr.add(2, 80);
        arr.add(3, 10);
        arr.add(4, 200);
        arr.add(5, -90);
        System.out.println("mang ban dau:" + arr.toString());
//        bubbleSort(arr);
//        selectionSort(arr);
        insertionSort(arr);
        System.out.println("mang sau khi sap xep:" + arr.toString());
    }
    public static void bubbleSort(ArrayList<Integer> list){
        for (int k = 1; k < list.size(); k++){
            for (int i = 0; i < list.size() - k; i++){
                if (list.get(i) > list.get(i + 1)){
                    int tmp = list.get(i);
                    list.set(i,list.get(i+1));
                    list.set(i+1, tmp);
                }
            }
        }
    }
    public static void selectionSort(ArrayList<Integer> list){
        for (int i = 0; i < list.size() - 1; i++ ){
            int CurrentMin = list.get(i);
            int CurrentMinIndex = list.indexOf(list.get(i));
            for (int j = i + 1; j < list.size(); j++){
                if (CurrentMin > list.get(j)){
                    CurrentMin = list.get(j);
                    CurrentMinIndex = list.indexOf(list.get(j));
                }
            }
            if (CurrentMinIndex != i){
                list.set(CurrentMinIndex, list.get(i));
                list.set(i, CurrentMin);
            }
        }
    }
    public static void insertionSort(ArrayList<Integer> list){
        for (int i = 1; i < list.size(); i++){
            int tmp = list.get(i);
            int k;
            for (k = i - 1; k >= 0 && list.get(k) > tmp; k--){
                list.set(k+1, list.get(k));
            }
            list.set(k+1, tmp);
        }
    }
}
