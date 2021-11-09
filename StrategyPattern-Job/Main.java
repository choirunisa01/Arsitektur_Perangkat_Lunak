import java.util.Scanner;

public class Main {
    private static int pilihan; 
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Silahkan Pilih jenis pekerjaan yang ingin dilamar : ");
        System.out.println("1. Editor\n2. Content Marketing\n3. Distribution "); 
        System.out.print("Masukkan Pilihan : ");
        pilihan = input.nextInt();

        Employee employee = new Employee();
        
        if(pilihan == 1){
            System.out.print("Posisi yang dilamar : ");
            employee.cariJabatan();
            System.out.print("Job Desc : Posisi ini bertanggung jawab terhadap keseluruhan proses editing suatu naskah ");
        }else if(pilihan == 2){
            employee.setJobType(new ContentMarketing()); 
            System.out.print("Posisi yang dilamar : ");
            employee.cariJabatan();
            System.out.print("Job Desc : Posisi ini bertanggung jawab terhadap strategi pemasaran dari naskah");
        }else{
            employee.setJobType(new Distribution()); 
            System.out.print("Posisi yang dilamar : ");
            employee.cariJabatan();
            System.out.print("Job Desc : Posisi ini bertanggung jawab terhadap distribusi produk kepada pembeli");
        }

    }
}
