package dao;

import po.Vote;



public interface IVoteDao {
	
	public Vote Update(String voteforname,String membername,String ip,String time);
	
	public String Query();

}
