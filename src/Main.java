import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập 1 số từ 0 - 999 ");
        int n = scanner.nextInt();
        if (n < 1 || n > 999)
            System.out.println("sai giá trị, nhập lại ");
        else {
            int last = n % 10; // lấy số cuối
            int second = (n / 10) % 10; // lấy số thứ 2
            int secondAndLast = n % 100; // lấy 2 số cuối
            int first = n / 100; // lấy số đầu tiên
            String[] arrA = {" ", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                    "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
            String[] arrB = {" ", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
            String h = " Hundred ";
            if (n < 20) {
                System.out.println(arrA[n]);
            } else if (n < 100) {
                System.out.println(arrB[second] + " " + arrA[last]);
            } else if (n < 120) {
                System.out.println(arrA[first] + h + arrA[secondAndLast]);
            } else if (n < 200) {
                System.out.println(arrA[first] + h + arrB[second] + " " + arrA[last]);
            } else if (n < 220) {
                System.out.println(arrA[first] + h + arrA[secondAndLast]);
            } else if (n < 300) {
                System.out.println(arrA[first] + h + arrB[second] + " " + arrA[last]);
            } else if (n < 320) {
                System.out.println(arrA[first] + h + arrA[secondAndLast]);
            } else if (n < 400) {
                System.out.println(arrA[first] + h + arrB[second] + " " + arrA[last]);
            } else if (n < 420) {
                System.out.println(arrA[first] + h + arrA[secondAndLast]);
            } else if (n < 500) {
                System.out.println(arrA[first] + h + arrB[second] + " " + arrA[last]);
            } else if (n < 520) {
                System.out.println(arrA[first] + h + arrA[secondAndLast]);
            } else if (n < 600) {
                System.out.println(arrA[first] + h + arrB[second] + " " + arrA[last]);
            } else if (n < 620) {
                System.out.println(arrA[first] + h + arrA[secondAndLast]);
            } else if (n < 700) {
                System.out.println(arrA[first] + h + arrB[second] + " " + arrA[last]);
            } else if (n < 720) {
                System.out.println(arrA[first] + h + arrA[secondAndLast]);
            } else if (n < 800) {
                System.out.println(arrA[first] + h + arrB[second] + " " + arrA[last]);
            } else if (n < 820) {
                System.out.println(arrA[first] + h + arrA[secondAndLast]);
            } else if (n < 900) {
                System.out.println(arrA[first] + h + arrB[second] + " " + arrA[last]);
            } else if (n < 920) {
                System.out.println(arrA[first] + h + arrA[secondAndLast]);
            } else {
                System.out.println(arrA[first] + h + arrB[second] + " " + arrA[last]);
            }
        }

    }
}