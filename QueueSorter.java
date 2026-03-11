import java.util.*;

public class QueueSorter {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan usia yang akan disortir: ");
        String input = sc.nextLine();

        String[] t = input.split(" ");


        if(t.length < 1 || t.length > 1000) { 
            System.out.println("Jumlah input harus 1 sampai 1000");
            return;
        }
        Queue<Integer> queueLolos = new LinkedList<>();

        int[] outside = new int[t.length];
        int outsideIndex  = 0;

        for(String token : t) {
            int num = Integer.parseInt(token);
    
        if(num >= 28 && num <= 118) {
            queueLolos.add(num);
        }
        else{
            outside[outsideIndex] = num;
            outsideIndex++;
        }
        }
        System.out.println("\nDaftar yang lolos:");
        while(!queueLolos.isEmpty()) {
            int umur = queueLolos.remove();
            System.out.println("dipanggil: " + umur);
        }

        System.out.println("\nDaftar yang tidak lolos:");
        for(int i = 0; i < outsideIndex; i++) {
        System.out.println("ditolak: " + outside[i]);
        }
    }
}
