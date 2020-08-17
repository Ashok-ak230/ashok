
public class TypesofVars {

	static int x=50; //class var
	int p=60; // instance var

	public static void main(String[] args) {
	TypesofVars t=new TypesofVars();
	TypesofVars t1=new TypesofVars();

	t.x=10;
	t1.x=20;

	t.p=100;
	t1.p=200;

	System.out.println(t.p);
	System.out.println(t1.p);

	System.out.println(t.x);
	System.out.println(t1.x);


	}
	}




