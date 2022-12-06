import java.util.ArrayList;
import java.util.Scanner;

public class TugasKelompok1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Menu> arrayList = new ArrayList<Menu>();
        arrayList.add(new Menu("Nasi Goreng Spesial  ", 9999.99));
        arrayList.add(new Menu("Ayam Bakar Spesial   ", 12345.67));
        arrayList.add(new Menu("Stick Sirloin Spesial", 21108.40));
        arrayList.add(new Menu("Kwetiaw Siram Spesial", 13579.13));
        arrayList.add(new Menu("Kambing Guling Spesial", 98765.43));

        System.out.println("Selamat Siang");
        System.out.print("Pesan untuk berapa orang\t: ");
        int jumlahPembeli = scanner.nextInt();
        System.out.print("Pesanan atas nama"+"\t\t\t"+": ");
        String pemesan = scanner.next();
        System.out.println("Menu Spesial Hari Ini");
        System.out.println("=====================");
        for(int i =0;i< arrayList.size();i++){
            System.out.format((i+1)+". "+arrayList.get(i).getMenu()+" \t @ Rp. %10.2f",arrayList.get(i).getHarga());
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Pesanan Anda [batas pesanan 0-10 porsi]");
        scanner.nextLine();

        for(int i =0;i< arrayList.size();i++){

            System.out.print((i+1)+". "+arrayList.get(i).getMenu()+"      \t = ");
            int porsi = scanner.nextInt();
            arrayList.get(i).setPesanan(porsi);
        }
        System.out.println("Selamat menikmati makanan anda...");
        System.out.println("Pembelian : ");
        Double totalPesanan = 0.0;
        for(int i =0;i< arrayList.size();i++){
            System.out.format((i+1)+". "+arrayList.get(i).getMenu()+"\t "+
                    arrayList.get(i).getPesanan()+" porsi * Rp. %10.2f = Rp.  %10.2f",arrayList.get(i).getHarga(),arrayList.get(i).getHarga()*arrayList.get(i).getPesanan());
            if(i==4) System.out.print(" +");
            System.out.print("\n");
            totalPesanan += (arrayList.get(i).getHarga()*arrayList.get(i).getPesanan());
        }
        System.out.println("=========================================================================");
        System.out.format("Total Pembelian \t\t\t\t\t\t\t\t\t  = Rp.  %10.2f",totalPesanan);
        System.out.println();
        Double diskon =(totalPesanan/10);
        System.out.print("Disc. 10 % (Masa Promosi) \t\t\t\t\t\t\t  = Rp. ");
        System.out.printf(" %10.2f",diskon);
        System.out.println();
        System.out.println("=========================================================================");
        System.out.print("Total Pembelian setelah disc 10 % \t\t\t\t\t  = Rp. ");
        System.out.format(" %10.2f - ",(totalPesanan - (totalPesanan/10)));
        System.out.println();
        System.out.format("Total Pembelian per orang (untuk "+jumlahPembeli+" orang) \t\t\t  = Rp.  %10.2f \n\n",(totalPesanan - (totalPesanan/10))/jumlahPembeli);
        System.out.println("\t\t\t\tTerima kasih atas kunjungan Anda...");
        System.out.println("\t\t\t\t\t..Tekan Enter untuk keluar...");
    }
}
