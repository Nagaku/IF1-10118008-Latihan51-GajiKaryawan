/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118008.latihan51.gajikaryawan;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class IF110118008Latihan51GajiKaryawan {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Manager kr = new Manager();
		System.out.println("====Program Perhitungan Gaji Karyawan====");
		System.out.print("Masukkan NIK : ");
		kr.setNik(sc.nextLine());
		System.out.print("Masukkan Nama : ");
		kr.setNama(sc.nextLine());
		System.out.print("Masukkan GOlongan (1/2/3) : ");
		kr.setGolongan(sc.nextInt());
		System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
		kr.setJabatan(sc.next());
		System.out.print("Masukkan Jumlah Kehadiran : ");
		kr.setKehadiran(sc.nextInt());
		System.out.println("\n====Hasil Perhitungan====");
		System.out.println("NIK\t: "+ kr.getNik());
		System.out.println("NAMA\t: "+ kr.getNama());
		System.out.println("GOLONGAN: "+ kr.getGolongan());
		System.out.println("JABATAN\t: "+ kr.getJabatan());
		kr.setTunjanganKehadiran(kr.tunjanganKehadiran(kr.getKehadiran()));	
		kr.setTunjanganJabatan(kr.tunjanganJabatan(kr.getJabatan()));
		kr.setTunjanganGolongan(kr.tunjanganGolongan(kr.getGolongan()));
		System.out.println("\nTUNJANGAN GOLONGAN\t: "+ kr.getTunjanganGolongan());
		System.out.println("TUNJANGAN JABATAN\t: "+ kr.getTunjanganJabatan());
		System.out.println("TUNJANGAN KEHADIRAN\t: "+ kr.getTunjanganKehadiran());
		System.out.println("\nGAJI TOTAL\t: "+ kr.gajiTotal());
	}
	
}
