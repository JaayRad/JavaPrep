package tablice;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {222,312,115,991,524,613,74};
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for(int i : array){
            System.out.println(i);
        }
    }
}
