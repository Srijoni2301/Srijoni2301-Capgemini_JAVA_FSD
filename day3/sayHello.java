package day3;



class Hello{
	int val_a,val_b;
	public Hello(){
		this.val_a=10;
		this.val_b=20;
	}
	Hello get() {
		return this;
	}
	void display()
    {
         System.out.println("val_a = " + val_a + "  val_b = " + val_b);
    }
}

public class sayHello{
	public static void main(String[] args) {
		Hello object = new Hello();
        System.out.println(object.get().val_b);
        
    }

}