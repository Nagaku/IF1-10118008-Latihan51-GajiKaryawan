/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118008.latihan51.gajikaryawan;

/**
 *
 * @author ASUS
 */
public class Manager extends Karyawan {
	private int kehadiran;
	private float tunjanganGolongan, tunjanganJabatan, tunjanganKehadiran;

	public int getKehadiran() {
		return kehadiran;
	}

	public void setKehadiran(int kehadiran) {
		this.kehadiran = kehadiran;
	}

	public void setTunjanganGolongan(float tunjanganGolongan) {
		this.tunjanganGolongan = tunjanganGolongan;
	}

	public void setTunjanganJabatan(float tunjanganJabatan) {
		this.tunjanganJabatan = tunjanganJabatan;
	}

	public void setTunjanganKehadiran(float tunjanganKehadiran) {
		this.tunjanganKehadiran = tunjanganKehadiran;
	}

	public float getTunjanganGolongan() {
		return tunjanganGolongan;
	}

	public float getTunjanganJabatan() {
		return tunjanganJabatan;
	}

	public float getTunjanganKehadiran() {
		return tunjanganKehadiran;
	}

	public float tunjanganKehadiran(int hadir){
		return 10000*hadir;
	}

	public float tunjanganJabatan(String jabatan){
		if( jabatan.equalsIgnoreCase("manager") )
			return 2000000;
		else if( jabatan.equalsIgnoreCase("kabag"))
			return 1000000;
		return 0;
	}

	public float tunjanganGolongan(int golongan){
		switch(golongan){
			case 1:
				return 500000;
			case 2:
				return 1000000;
			case 3: 
				return 1500000;
		}	
		return 0;
	}

	public float gajiTotal(){
		return this.tunjanganJabatan + this.tunjanganGolongan + this.tunjanganKehadiran;	
	}

}
