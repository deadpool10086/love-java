package po;

public class Member {
	public int id;
	public String membername;
	public String memberpassword;
	private String qq;
	private String phone;
	private String address;
	private String teamname;
	
	public Member()
	{}


	
	

	public Member(int id, String membername, String memberpassword, String qq,
			String phone, String address, String teamname) {
		super();
		this.id = id;
		this.membername = membername;
		this.memberpassword = memberpassword;
		this.qq = qq;
		this.phone = phone;
		this.address = address;
		this.teamname = teamname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public String getMemberpassword() {
		return memberpassword;
	}

	public void setMemberpassword(String memberpassword) {
		this.memberpassword = memberpassword;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	
	

}
