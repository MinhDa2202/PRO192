package bai6;

public class person 
{
private String ten ;
private int tuoi;
private String gioitinh;
private int namsinh;
private String diachi;
private String email;
private String sodienthoai;
public person(String ten, int tuoi, String gioitinh, int namsinh, String diachi, String email, String sodienthoai) 
{
	this.ten = ten;
	this.tuoi = tuoi;
	this.gioitinh = gioitinh;
	this.namsinh = namsinh;
	this.diachi = diachi;
	this.email = email;
	this.sodienthoai = sodienthoai;
}
public String getTen() {
	return ten;
}
public void setTen(String ten) {
	this.ten = ten;
}
public int getTuoi() {
	return tuoi;
}
public void setTuoi(int tuoi) {
	this.tuoi = tuoi;
}
public String getGioitinh() {
	return gioitinh;
}
public void setGioitinh(String gioitinh) {
	this.gioitinh = gioitinh;
}
public int getNamsinh() {
	return namsinh;
}
public void setNamsinh(int namsinh) {
	this.namsinh = namsinh;
}
public String getDiachi() {
	return diachi;
}
public void setDiachi(String diachi) {
	this.diachi = diachi;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getSodienthoai() {
	return sodienthoai;
}
public void setSodienthoai(String sodienthoai) {
	this.sodienthoai = sodienthoai;
}
@Override
public String toString() {
	return "person [ten=" + ten + ", tuoi=" + tuoi + ", gioitinh=" + gioitinh + ", namsinh=" + namsinh + ", diachi="
			+ diachi + ", email=" + email + ", sodienthoai=" + sodienthoai + "]";
}


}
