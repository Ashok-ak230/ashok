public class Looping{
	public static void main(String[] args) {
		String[][] data= {{"Apple","Mango","Banana"},
				{"Cat","Dog"},{"Java","Python","c","c++"}};
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				System.out.println(data[i][j]+"");
			}
			System.out.println();
		}

		}
}