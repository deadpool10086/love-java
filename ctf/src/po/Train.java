package po;

public class Train {
	public int trainid;
	public String traintitle;
	public String traintype;
	public String traindate;
	public String traincontent;
	public Train() {
		super();
	}
	public Train(int trainid, String traintitle, String traintype,
			String traindate, String traincontent) {
		super();
		this.trainid = trainid;
		this.traintitle = traintitle;
		this.traintype = traintype;
		this.traindate = traindate;
		this.traincontent = traincontent;
	}
	public int getTrainid() {
		return trainid;
	}
	public void setTrainid(int trainid) {
		this.trainid = trainid;
	}
	public String getTraintitle() {
		return traintitle;
	}
	public void setTraintitle(String traintitle) {
		this.traintitle = traintitle;
	}
	public String getTraintype() {
		return traintype;
	}
	public void setTraintype(String traintype) {
		this.traintype = traintype;
	}
	public String getTraindate() {
		return traindate;
	}
	public void setTraindate(String traindate) {
		this.traindate = traindate;
	}
	public String getTraincontent() {
		return traincontent;
	}
	public void setTraincontent(String traincontent) {
		this.traincontent = traincontent;
	}
	
	

}
