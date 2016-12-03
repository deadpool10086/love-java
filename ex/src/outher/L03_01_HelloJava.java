package outher;

public class L03_01_HelloJava {

	public static void main(String[] args) {
		int[][]Array={{85,76,77},{64,89,32},{92,62,2}};
        int[][]Brray={{4,12,12},{3,32,41},{23,15,9,}};
        int[][]Crray=new int[Array.length][Array[0].length];
        System.out.println("Array数组元素如下：");
        for(int i=0;i<Array.length;i++){
       	 for(int j=0;j<Array[i].length;j++){
       		 System.out.print(Array[i][j]+"\t");
       	 }
       	 System.out.println();
        }
        System.out.println("Brray数组元素如下：");
        for(int i=0;i<Brray.length;i++){
       	 for(int j=0;j<Brray[i].length;j++){
       		 System.out.print(Brray[i][j]+"\t");
       	 }
       	 System.out.println();
        }
        System.out.println("Crray数组元素如下：");
        for(int i=0;i<Crray.length;i++){
       	 for(int j=0;j<Crray[i].length;j++){
       		Crray[i][j]=Array[i][j]*Brray[i][j];
       		 System.out.print(Crray[i][j]+"\t");
       	 }
       	 System.out.println();
        }	
	}

}
