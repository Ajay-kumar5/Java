package Test;

public class Result implements Test2{
	
	public void T()
	{
		System.out.println("Pass");
	}
	
	public void T1()
	{
		System.out.println("Fail");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Result obj = new Result();
		obj.T();
		obj.T1();
	}

}
