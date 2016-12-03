package dao;

import po.Member;



public interface IMemberDao {
	
	public Member UserLoginCheck(String usn,String pwd); 
	//��ʾ�û�������ϸ��Ϣ--��ѯ
	public Member FindByuid(int uid);
	//ע���û�--���
	public Member RegisterUser(String membername,String memberpassword,String qq,String phone,String address);
	
	public Member EditUser(String memberpassword,String qq,String phone,String address,String membername); 
	//�����û���Ϣ--����
	public int UpdateUser(Member member); 

}
