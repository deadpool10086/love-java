package po;

public class Vote {
	public int id;
	public String voteforname;
	public String membername;
	public String ip;
	public String time;
	
	public Vote()
	{}

	public Vote(int id, String voteforname, String membername, String ip,
			String time) {
		super();
		this.id = id;
		this.voteforname = voteforname;
		this.membername = membername;
		this.ip = ip;
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVoteforname() {
		return voteforname;
	}

	public void setVoteforname(String voteforname) {
		this.voteforname = voteforname;
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	

}
