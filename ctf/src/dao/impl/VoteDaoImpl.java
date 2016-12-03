package dao.impl;



import po.Vote;
import dao.IVoteDao;
import dbutil.DBConn;

public class VoteDaoImpl implements IVoteDao {
	 DBConn db=null;
	    public VoteDaoImpl(){
	    	db=new DBConn();
	    }
	
	public Vote  Update(String voteforname, String membername, String ip,
			String time) {
          Vote vote =new Vote();
		String sql="insert into vote(voteforname,membername,ip,time)values(?,?,?,?)";
        db.executeUpdate(sql, new Object[]{voteforname,membername,ip,time});
	
		return vote;
		
		
	   
}
	
	public String Query()
	{
		return null;}
	
	

}
