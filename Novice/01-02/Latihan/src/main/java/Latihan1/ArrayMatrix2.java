package latihan;

import java.util.Scanner;

public class ArrayMatrix2{
    
    public static void main(String[] args) {
        int baris, kolom, i, j;

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Ordo Matrix");
        System.out.println("===============================");
        System.out.println("Masukan Jumlah baris : ");
        baris = sc.nextInt();
        System.out.print("Masukan Jumlah Kolom : ");
        kolom = sc.nextInt();

        int A[][] = new int[baris][kolom];
        int B[][] = new int[baris][kolom];
        int sum[][]= new int[baris][kolom];
    }
}

//Penjumlah Matriks
for(i = 0; i < baris; i++){
    for(j = 0; j < kolom; j++){
        sum[i][j] = A[i][[j] + B[i][j];
    }
}
System.out.println("\n Penjumlahan Matrix");
System.out.println("======================================");
for(j = 0; j < kolom; j++){
    System.out.print(sum[i][j]+"\t");

}
