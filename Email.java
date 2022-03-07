import java.util.*;


public class Email {
    public static void main(String args[]){
        String ename ;
        int id;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your email:-> ");
        String email = sc.next();
        int sl= email.length();
        if(email.indexOf('@')<=0){
            System.out.println("invalid");
        }
        else if (email.indexOf('@') == (sl-1))
        {
            System.out.println("invalid");
        }
        else
        {
            String afterat;
            afterat=email.substring(email.indexOf('@')+1,sl-1);
            if(afterat.indexOf('.')<=0){
                System.out.println("invalid");
            }
            else if (afterat.indexOf('.') == (sl-1))
            {
                System.out.println("invalid");
            }
            else
            {
                System.out.println("Valid");
            }

        }



    }


}