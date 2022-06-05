public class ArraySorter {

    /**
     * Дополнительно
     * */

    public static int[] bubbleSortAscending(int[] arr) {
        for(int j = 0; j < arr.length; j++){
            for(int i = 0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    int var;
                    var = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = var;
                }
            }
        }
        return arr;
    }



}
