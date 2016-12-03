package dao.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import po.Forum;
import po.Learn;
import po.Train;
import sun.security.timestamp.TSRequest;
import dao.IForumDao;
import dao.ITrainDao;
import dbutil.DBConn;

public class TrainDaoImpl implements ITrainDao {
	private static final Integer pageSize =10;
	private Integer countRecord;// 共有多少条记录
	private Integer countPage;// 共有多少页
	DBConn db = null;

	public TrainDaoImpl() {
		db = new DBConn();
	}

	public List<Train> Find(int trainid) {
		List<Train> entities = new ArrayList<Train>();
		String sql = "select * from train where trainid=?";
		try {

			ResultSet rs = db.execQuery(sql, new Object[] { trainid });
			while (rs.next()) {
				Train t = new Train();
				t.setTrainid(rs.getInt("trainid"));
				t.setTraintitle(rs.getString("traintitle"));
				t.setTraintype(rs.getString("traintype"));
				t.setTraindate(rs.getString("traindate"));
				t.setTraincontent(rs.getString("traincontent"));
				entities.add(t);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return entities;
	}

	public Integer getCountRecord() {
		Integer count = 0;
		// 获取连接
		// 定义sql语句 查询出一共的记录条数
		String sql = "select count(*) as con from train";
		ResultSet rs = db.execQuery1(sql);
		try {
			if (rs.next()) {
				count = rs.getInt("con");
			}
			this.countPage = ((count % pageSize) != 0 ? (count / pageSize + 1)
					: (count / pageSize));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return countPage;
	}

	public List<Train> findIimitPage(Integer newPage) {
		List<Train> entities = new ArrayList<Train>();
		String sql = "select * from train limit ?,?";
		try {

			ResultSet rs = db.execQuery(sql, new Object[] {
					(newPage - 1) * pageSize, pageSize });
			while (rs.next()) {
				Train t = new Train();
				t.setTrainid(rs.getInt("trainid"));
				t.setTraintitle(rs.getString("traintitle"));
				t.setTraintype(rs.getString("traintype"));
				t.setTraindate(rs.getString("traindate"));
				t.setTraincontent(rs.getString("traincontent"));
				entities.add(t);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return entities;
	}

	public Integer getCountPage() {
		return countPage;
	}

	public Train Add(String traintitle, String traintype, String traindate,
			String traincontent) {
		String sql = "insert into train(traintitle,traintype,traindate,traincontent) values(?,?,?,?) ";
		db.executeUpdate(sql, new Object[] {traintitle,traintype,traindate,traincontent  });
		return null;
	}

}
