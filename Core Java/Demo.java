//21-JAN-2026 Updated Switch Statement!!
public class Demo
{
    public static void main(String a[])
    {
        int n = 1;
        //OLD 
        // switch(n)
        // {
        //     case 1: System.out.println("Monday"); break;
        //     case 2: System.out.println("Tuesday"); break;
        //     case 3: System.out.println("Wednesday"); break;
        //     case 4: System.out.println("Thursday"); break;
        //     case 5: System.out.println("Friday"); break;
        //     case 6: System.out.println("Saturday"); break;
        //     case 7: System.out.println("Sunday"); break;
        //     default: System.out.println("invalid day"); 
        // }

            // Break can be replaced by doing (: to ->)
            //switch now can also return values
            // case 2 -> System.out.println("Tuesday"); 
            // case 3 -> System.out.println("Wednesday"); 
            // case 4 -> System.out.println("Thursday");

        switch(n)
        {
            case 1: yield System.out.println("Monday"); 
            case 2: yield System.out.println("Tuesday");  
        }

        String result = switch(n)
        {
            case 1 -> "Monday"; 
            case 2 -> "Tuesday"; 
            case 3 -> "Wednesday"; 
            case 4 -> "Thursday"; 
            case 5 -> "Friday"; 
            case 6 -> "Saturday"; 
            case 7 -> "Sunday"; 
            default ->  "invalid";
        };   // now semi colon is must.

        System.out.println(result);

    }
}