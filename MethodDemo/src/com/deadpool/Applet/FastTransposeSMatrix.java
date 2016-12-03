package com.deadpool.Applet;



public class FastTransposeSMatrix {
	public static void main(String[] args) {
		TSMatrix tsmatrix = new TSMatrix();
		TSMatrix newMatrix = new TSMatrix();
		tsmatrix.addData(1, 2, 5);
		tsmatrix.addData(1, 3, 9);
		tsmatrix.addData(3, 1, -3);
		tsmatrix.addData(3, 6, 14);
		tsmatrix.addData(4, 3, 24);
		tsmatrix.addData(5, 2, 18);
		tsmatrix.addData(6, 1, 15);
		tsmatrix.addData(6, 4, -7);
		tsmatrix.outPrint();
		tsmatrix.fastTransposeSMatrix(newMatrix);
		newMatrix.outPrint();
		
	}

}
class Triple{
	public int i;  //在哪一行
	public int j;  //在哪一列
	public int e;  //数据值
	
	
	public Triple() {
		i = 0;
		j = 0;
	}
}
class TSMatrix{
	private static final int MAXSIZE = 1024;
	public Triple[] data;
	public int mu;  //总行数
	public int nu;	//总列数
	public int tu;	//总元素数
	
	public TSMatrix() {
		mu = 0;
		nu = 0;
		tu = 0;
		data = new Triple[MAXSIZE];
		for (int i=0; i<MAXSIZE; i++)
		{
			data[i] = new Triple();
		}
	}
	public boolean addData(int i, int j, int e)  /*插入函数，i是第几行 j是第几列， e是数据内容*/
	{
		if (tu >= MAXSIZE)
		{
			System.out.println("超出范围");
			return false;
		}
		data[tu].e = e;
		data[tu].i = i;
		data[tu].j = j;
		if (i > mu)  //检查最大的行数与列数
			mu = i;
		if (j > nu)
			nu = j;
		tu++;		//数据总数+1
		return true;
	}
	public  void outPrint()
	{
		System.out.println("i\tj\tk\t");
		for (int i=0; i<tu; i++)
		{
			System.out.printf("%d\t%d\t%d\t\n",data[i].i,data[i].j,data[i].e);
		}
		return;
	}
	public boolean TransposeSMatrix(TSMatrix newMatrix)
	{
		for(int col=1; col<=nu; col++) //从第一列到最后一列一次插入另一个矩阵
		{
			for(int p=0; p<tu; p++)
			{
				if(data[p].j == col)
					newMatrix.addData(data[p].j, data[p].i, data[p].e);
			}
		}
		
		return true;
	}
	public boolean fastTransposeSMatrix(TSMatrix newMatrix)  //稀疏矩阵三元组的快速转制
	{
		newMatrix.mu = nu;
		newMatrix.nu = mu;
		newMatrix.tu = tu;
		int num[] = new int[MAXSIZE];     //建立一个数组每一列的非零数据有多少个
		int cpot[] = new int[MAXSIZE];    //该数组保存每列数据第一个应该在另一个矩阵的哪一个位置
		for (int i=0; i<tu; i++)   //计算出每列非零数据有多少个
			num[data[i].j]++;
		
		for(int i=2; i<=nu; i++)   // 推算出每列数据第一个应该在另一个矩阵的哪一个位置
			cpot[i] = cpot[i-1] + num[i-1];
		
		cpot[1] = 0; //从第0号开始 这点和书里不太一样，书里是从一号开始
		
		for (int i=0; i<tu; i++)
		{
			newMatrix.data[cpot[data[i].j]].i = data[i].j;
			newMatrix.data[cpot[data[i].j]].j = data[i].i;
			newMatrix.data[cpot[data[i].j]].e = data[i].e;
			cpot[data[i].j]++;        //进行+1即现在里面表示列下一个数据应该在另一个矩阵位置；
		}
		return true;
	}
}
