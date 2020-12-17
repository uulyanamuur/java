import java.util.StringTokenizer;

public class Address {
    String country, region, city, street, house, corps, apartment;
    Address(String adress)
    {
        StringTokenizer tokenZ=new StringTokenizer(adress, ",.;- ");
        if (tokenZ.hasMoreElements()==true)
        {
            country=tokenZ.nextToken();
            region=tokenZ.nextToken();
            city=tokenZ.nextToken();
            street=tokenZ.nextToken();
            house=tokenZ.nextToken();
            corps=tokenZ.nextToken();
            apartment=tokenZ.nextToken();
        }

        System.out.println(country+" "+region+" "+city+" "+street+" "+house+" "+corps+" "+apartment);
    }
}