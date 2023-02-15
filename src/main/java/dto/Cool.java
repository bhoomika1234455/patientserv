package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cool {

@Id
private int pid;
private String PBG;
private Long phno;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPBG() {
	return PBG;
}
public void setPBG(String pBG) {
	PBG = pBG;
}
public Long getPhno() {
	return phno;
}
public void setPhno(Long phno) {
	this.phno = phno;
}
@Override
public String toString() {
	return "Cool [pid=" + pid + ", PBG=" + PBG + ", phno=" + phno + "]";
}



	
}
