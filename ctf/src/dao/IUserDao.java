package dao; 
 


import po.Admin;;

public interface IUserDao {
    //用户登录验证--查询
	public Admin UserLoginCheck(String usn,String pwd); 
	//显示用户个人详细信息--查询
	public Admin FindByuid(int uid);
	//注册用户--添加
	public int RegisterUser(Admin admin); 
	//更新用户信息--更新
	public int UpdateUser(Admin admin); 
}
