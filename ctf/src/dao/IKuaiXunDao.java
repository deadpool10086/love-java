package dao;

import java.util.List;

import po.KuaiXun;;

public interface IKuaiXunDao {
	public List<KuaiXun> Find();
	public KuaiXun addKuaiXun(String kxtitle,String kxurl);

}
