package dao; 
 


import po.Admin;;

public interface IUserDao {
    //�û���¼��֤--��ѯ
	public Admin UserLoginCheck(String usn,String pwd); 
	//��ʾ�û�������ϸ��Ϣ--��ѯ
	public Admin FindByuid(int uid);
	//ע���û�--���
	public int RegisterUser(Admin admin); 
	//�����û���Ϣ--����
	public int UpdateUser(Admin admin); 
}
