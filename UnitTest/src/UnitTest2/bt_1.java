/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTest2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */ 

    /**
     * @param args the command line arguments
     */
// methods
    public class bt_1 {
	
	private String maso;
	private String hoten;
	private int namsinh;
	
	Scanner input = new Scanner(System.in);
	
	public String getMaso() {
		return maso;
	}
	public void setMaso(String maso) {
		this.maso = maso;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public int getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}
	
	public bt_1(String maso, String hoten, int namsinh) {
		this.maso = maso;
		this.hoten = hoten;
		this.namsinh = namsinh;
	}
	public bt_1()
	{
		
	}
	public void nhap()
	{
		System.out.println("nhap vao ma so sinh vien");
		maso = input.nextLine();
		System.out.println("nhap vao ho ten sinh vien");
		hoten = input.nextLine();
		System.out.println("nhap vao nam sinh sinh vien");
		namsinh = input.nextInt();
		
	}
	
	public void show()
	{
		System.out.println("Ma so la: "+maso+"; Ho va Ten: "+hoten+"; Nam sinh:"+namsinh);
	}
	

}
   

