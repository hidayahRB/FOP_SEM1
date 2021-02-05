public class Q2 {

    public static void main(String[] args) {
        // Write a program that consists of a method that can display three numbers in decreasing order
        int num[] = {2,10,6,11,100};
        int temp;
        // sort numbers in descending orders in array 
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i]<num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.print("Decsending order : ");
        for (int i = 0; i < num.length - 1; i++) {
            System.out.print(num[i]+",");
        }System.out.println(num[num.length-1]);
    }
    
}
