package project;



class Worker
{
	private char num[] = new char[16];
	private String name = "";
	private char sex = 'N';
	private int age = 0;
	private int time = 0;
	private double gongzi = 0;
	private double jiangjin = 0;
	private double jiabanfei = 0;
	private double dianhuafei = 0;
	private double shenghuofei = 0;
	private double jiaotongfei = 0;
	private double fangzu = 0;
	
	
	
	public Worker(char[] num) {
		super();
		this.num = num;
	}



	public Worker(char[] num, String name) {
		super();
		this.num = num;
		this.name = name;
	}



	public Worker(char[] num, String name, char sex) {
		super();
		this.num = num;
		this.name = name;
		this.sex = sex;
	}



	public Worker(char[] num, String name, char sex, int age) {
		super();
		this.num = num;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}



	public Worker(char[] num, String name, char sex, int age, int time) {
		super();
		this.num = num;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.time = time;
	}



	public Worker(char[] num, String name, char sex, int age, int time,
			double gongzi) {
		super();
		this.num = num;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.time = time;
		this.gongzi = gongzi;
	}



	public Worker(char[] num, String name, char sex, int age, int time,
			double gongzi, double jiangjin) {
		super();
		this.num = num;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.time = time;
		this.gongzi = gongzi;
		this.jiangjin = jiangjin;
	}



	public Worker(char[] num, String name, char sex, int age, int time,
			double gongzi, double jiangjin, double jiabanfei) {
		super();
		this.num = num;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.time = time;
		this.gongzi = gongzi;
		this.jiangjin = jiangjin;
		this.jiabanfei = jiabanfei;
	}



	public Worker(char[] num, String name, char sex, int age, int time,
			double gongzi, double jiangjin, double jiabanfei, double dianhuafei) {
		super();
		this.num = num;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.time = time;
		this.gongzi = gongzi;
		this.jiangjin = jiangjin;
		this.jiabanfei = jiabanfei;
		this.dianhuafei = dianhuafei;
	}



	public Worker(char[] num, String name, char sex, int age, int time,
			double gongzi, double jiangjin, double jiabanfei,
			double dianhuafei, double shenghuofei) {
		super();
		this.num = num;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.time = time;
		this.gongzi = gongzi;
		this.jiangjin = jiangjin;
		this.jiabanfei = jiabanfei;
		this.dianhuafei = dianhuafei;
		this.shenghuofei = shenghuofei;
	}



	public Worker(char[] num, String name, char sex, int age, int time,
			double gongzi, double jiangjin, double jiabanfei,
			double dianhuafei, double shenghuofei, double jiaotongfei) {
		super();
		this.num = num;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.time = time;
		this.gongzi = gongzi;
		this.jiangjin = jiangjin;
		this.jiabanfei = jiabanfei;
		this.dianhuafei = dianhuafei;
		this.shenghuofei = shenghuofei;
		this.jiaotongfei = jiaotongfei;
	}



	public Worker(char[] num, String name, char sex, int age, int time,
			double gongzi, double jiangjin, double jiabanfei,
			double dianhuafei, double shenghuofei, double jiaotongfei,
			double fangzu) {
		super();
		this.num = num;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.time = time;
		this.gongzi = gongzi;
		this.jiangjin = jiangjin;
		this.jiabanfei = jiabanfei;
		this.dianhuafei = dianhuafei;
		this.shenghuofei = shenghuofei;
		this.jiaotongfei = jiaotongfei;
		this.fangzu = fangzu;
	}



	@Override
	public String toString() {
		StringBuffer ret = new StringBuffer();
		ret.append(" 身份证号: ");
		ret.append(num);
		
		ret.append(" 姓名：");
		if (name.equals(""))
			ret.append("未知");
		else {
			ret.append(name);
		}
		ret.append(" 性别：");
		if(sex == 'N')
			ret.append("未知");
		else {
			ret.append(sex);
		}
		ret.append(" 年龄：");
		if(age == 'N')
			ret.append("未知");
		else {
			ret.append(sex);
		}
		ret.append(" 入职时间：");
		if(time == 0)
			ret.append("未知");
		else {
			ret.append(time);
		}
		ret.append(" 工资：");
		if(gongzi == 0)
			ret.append("未知");
		else {
			ret.append(gongzi);
		}
		
		ret.append(" 奖金：");
		if(jiangjin == 0)
			ret.append("未知");
		else {
			ret.append(jiangjin);
		}
		ret.append(" 加班费：");
		if(jiabanfei == 0)
			ret.append("未知");
		else {
			ret.append(jiabanfei);
		}
		
		ret.append(" 电话费：");
		if(dianhuafei == 0)
			ret.append("未知");
		else {
			ret.append(dianhuafei);
		} 
		ret.append(" 生活费：");
		if(shenghuofei == 0)
			ret.append("未知");
		else {
			ret.append(shenghuofei);
		}
		ret.append(" 交通费：");
		if(jiaotongfei == 0)
			ret.append("未知");
		else {
			ret.append(jiaotongfei);
		}
		ret.append(" 房租：");
		if(fangzu == 0)
			ret.append("未知");
		else {
			ret.append(fangzu);
		}
		return ret.toString();
	}
	
	
	
}


public class L04_03_Hellojava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Worker w1 = new Worker("12312".toCharArray());
		Worker w2 = new Worker("326347".toCharArray(),"刘德华");
		Worker w3 = new Worker("252353".toCharArray(),"周星驰",'男');
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w3);
	}

}
