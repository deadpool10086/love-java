package dbutil;

import java.sql.*;

public class DBConn {
   //������ԣ��Ĵ󷽷�
	//�����Ľӿ�(����)
	private Connection conn=null;
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;
	//4����	
	//method1:������ݿ�����
	public void getConnection(){		
		try {
			//step1:����������java����ԭ��
			Class.forName(Config.CLASS_NAME);
			//step2:����connection�ӿڶ������ڻ�ȡmysql��ݿ����Ӷ���������� url���ӵ��ַ�username�˺ţ�password����
			String url=Config.DATABASE_URL+"://"+Config.SERVER_IP+":"+Config.SERVER_PORT+"/"+Config.DATABASE_SID;
			//step3:������ݿ�����
			conn=DriverManager.getConnection("jdbc:mysql://localhost/ctf?user=ctf&password=ctf123&useUnicode=true&characterEncoding=utf-8");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//method2:�ر���ݿⷽ��
    public void closeConn(){
    	//�ر�˳��ResultSet PreparedStatement Connection    	
    	//�رգ�ResultSet
    	if(rs!=null){
    		try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	//�رգ�PreparedStatement
    	if(pstmt!=null){
    		try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}    	
    	//�رգ�Connection
    	if(conn!=null){
    		try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	System.out.println("��ݿ������ѹر�");
    }	
    //method3:���ڷ��� ����ɾ���� �ķ���
    public int executeUpdate(final String sql,final Object[] params){
    	//step1:��ȡ��ݿ�����
    	this.getConnection();	
    	try {
    		//step3:����Statement�ӿڶ���
			pstmt=conn.prepareStatement(sql);
			//step4:��̬Ϊpstmt����ֵ����
			for(int i=0;i<params.length;i++){
				pstmt.setObject(i+1, params[i]);
			}
			//step5:ʹ��Statement������sql���
			int affectedRows=pstmt.executeUpdate();
			 //step6:���ؽ��
			return affectedRows;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}    	
    }
    //method4:���ڷ��� ��ѯ��� �ķ���
    public ResultSet execQuery(final String sql,final Object[] params){
    	//step1:��ȡ��ݿ�����
    	this.getConnection();   	
    	try {
    		//step3:����PreparedStatement�ӿڶ���
		 pstmt=conn.prepareStatement(sql);
			//step4:��̬Ϊpstmt����ֵ����
			for(int i=0;i<params.length;i++){
				pstmt.setObject(i+1, params[i]);
			}
			//step5:ʹ��Statement������sql���
			rs=pstmt.executeQuery();
			//step6:���ؽ��
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}		        	
    }
    
    
    public ResultSet execQuery1(final String sql){
    	//step1:��ȡ��ݿ�����
    	this.getConnection();   	
    	try {
    		//step3:����PreparedStatement�ӿڶ���
		 pstmt=conn.prepareStatement(sql);
			
			//step5:ʹ��Statement������sql���
			rs=pstmt.executeQuery();
			//step6:���ؽ��
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}		        	
    }
     
}
