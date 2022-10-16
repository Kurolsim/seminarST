/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTest2;

/**
 *
 * @author Admin
 */
public class KIEMTHU {

    /**
     * @param args the command line arguments
     */

	
	public double Tong(int soLuong, double tongTienPhaiTra) {
		if(soLuong==1) {
			tongTienPhaiTra = tongTienPhaiTra;
			return tongTienPhaiTra;
		}
		if(soLuong ==2) {
			tongTienPhaiTra = tongTienPhaiTra;
			return tongTienPhaiTra;
		}
		if(soLuong ==3) {
			tongTienPhaiTra = tongTienPhaiTra;
			return tongTienPhaiTra;
		}
		if(soLuong%4==0) {
			tongTienPhaiTra = tongTienPhaiTra;
			return tongTienPhaiTra;
		}
		if(soLuong%4==1) {
			tongTienPhaiTra -= tongTienPhaiTra*0.1;
			return tongTienPhaiTra;
		}
		if(soLuong%4==2) {
			tongTienPhaiTra -= tongTienPhaiTra*0.15;
			return tongTienPhaiTra;
		}
		if(soLuong%4==3) {
			tongTienPhaiTra -= tongTienPhaiTra*0.2 ;
			return tongTienPhaiTra;
		}
		return tongTienPhaiTra;
		
	}

}

    

