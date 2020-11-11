package Office_Hours.Practice_11_11_2020;

public class ArraysPractice1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        for (int j = 0; j <= arr2.length - 1; j++) {
            int element = arr1[0];
            for (int i = 0; i <= arr2.length - 1; i++) {
                if (element == arr2[i]) {
                    System.out.println(element);
                    break;
                }
            }
        }
        System.out.println("=======================================");

        for (int element : arr1) {
            for (int each : arr2) {
                if (each == element) {
                    System.out.println(element);
                }
            }
        }
    }
}
/*
Write a program that can print out the common elements from two integer array
		Ex:
			arr1: {1,2,3,4,5}
			arr2: {4,5,6,7,8}
			output:
				4 5
	solution 1:
			DO NOT use any for each loop
	solution 2:
			MUST use for each loops
 */