package po;

public class Admin {
	public int id;
	public String adminname;
	public String adminpassword;
	public Admin()
	{}
	public Admin(int id, String adminname, String adminpassword) {
		super();
		this.id = id;
		this.adminname = adminname;
		this.adminpassword = adminpassword;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getAdminpassword() {
		return adminpassword;
	}
	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}
	

}
