import java.math.*;

;public class PasswordGenerator
{
    public static int randomInt()
    {
        int answer = (int)((Math.random()* (126-32)+32));
        return answer;
    }
    public static String generator(int len)
    {
        if(len <=0)
        {
            System.out.println("Invalid Length! Please enter a valid length");
        }
        String pass = "";
        while(pass.length()<len)
        {
            pass+= (char)randomInt();           
        }
        return pass;
    }

    public static void main(String args[])
    {
        System.out.println(generator(7));
    }

    @Test 
    public void testLength()
    {
        assertEquals(7,generator(7));
    }
}
