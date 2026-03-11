import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueSorter {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan usia yang akan disortir: ");
        String input = sc.nextLine();

        String[] t = input.split(" ");
        int[] arr = new int[t.length];
        for(int i = 0; i < t.length; i++) {
            arr[i] = Integer.parseInt(t[i]);
        }

        if(t.length < 1 || t.length > 1000) { 
            System.out.println("Jumlah input harus 1 sampai 1000");
            return;
        }
        Queue<Integer> queueLolos = new LinkedList<>();
        Queue<Integer> queueGakLolos = new LinkedList<>();

        for(int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if(num >= 28 && num <= 118) {
                queueLolos.add(num);
            } else{
                queueGakLolos.add(num);
            }
        }

        System.out.println("\nDaftar yang lolos:");
        while(!queueLolos.isEmpty()) {
            int umur = queueLolos.remove();
            System.out.println(umur);
        }
        System.out.println("\nDaftar yang tidak lolos:");
        while(!queueGakLolos.isEmpty()) {
            int umur = queueGakLolos.remove();
            System.out.println(umur);
        }
    }
}
