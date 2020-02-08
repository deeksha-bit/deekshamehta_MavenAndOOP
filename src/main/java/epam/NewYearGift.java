package epam;
import Gifts.Gift;
import Sweets.Cake;
import Sweets.Candies;
import Sweets.Chocolates;
import Sweets.Sweet;
import java.util.Scanner;

public class NewYearGift
{
    public static void main(String[] args )
    {
        Gift gift=new Gift();
        Scanner sc=new Scanner(System.in);
        Sweet dairymilk=new Chocolates("dairymilk","creamy","0.6",2.345,"dairy");
        Sweet cake=new Cake("butter skoch","sugary","0.9",2500,"spongy");
        Sweet candies=new Candies("nestle","chocolate","0.3",1.2,"oval");
        Sweet munch=new Chocolates("munch","crunchy","0.26",4.345,"munch");
        Sweet cake2=new Cake("black forest","chocolate","0.99",6700,"flumming");
        Sweet candy2=new Candies("exclairs","chocolate","0.22",1.62,"oval");
        gift.addgifts(dairymilk);
        gift.addgifts(cake);
        gift.addgifts(candies);
        gift.addgifts(munch);
        gift.addgifts(cake2);
        gift.addgifts(candy2);
        System.out.println("Gifts are");
        System.out.println(gift.toString());
        System.out.println("Total weight ");
        System.out.println(gift.totalweight());
        System.out.println("Enter the lowerlimit of gift weight");
        double lowerlimit=sc.nextDouble();
        System.out.println("Enter the upperlimit of gift weight");
        double upperlimit=sc.nextDouble();
        gift.range(lowerlimit,upperlimit);
        System.out.println();
        System.out.println("Sorted gifts by name are:");
        gift.sort();
        gift.printaftersorting();
    }
}
