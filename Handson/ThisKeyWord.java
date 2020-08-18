
public class ThisKeyWord {
	int x;
	void init() {
		int x=20;
		System.out.println(this.x);
	}
	/*static void init() {
		int x=20;
		System.out.println(this.x);
		*/
	
	public static void main(String[] args) {
    ThisKeyWord t1=new ThisKeyWord();
    ThisKeyWord t2=new ThisKeyWord();
    t1.x=50;
    t2.x=60;
    t2.init();

	}

}
