package inheritance;

public class HierarchialChildC extends HierarchialParentA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HierarchialChildC obj = new HierarchialChildC();
		obj.display();
		obj.dispaly2();
	}

	public void dispaly2()
	{
		System.out.println("Child C");
	}
}
