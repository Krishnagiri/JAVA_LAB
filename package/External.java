package see;
import cie.Internal;
import java.util.*;
public class External extends Internal
{
	public int[] see_mark=new int[5];
	public void get_see()
	{
	System.out.println("Enter the SEE marks ");
        Scanner s=new Scanner(System.in);
	for(int i=0;i<5;i++)
		see_mark[i]=s.nextInt();
	}
}

