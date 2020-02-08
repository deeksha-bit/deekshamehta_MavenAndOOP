package Gifts;

import Sweets.Sweet;

import java.util.ArrayList;
import java.util.Collections;

public class Gift {

    ArrayList<Sweet> list=new ArrayList<>();

    public void addgifts(Sweet sugarballs) {
        list.add(sugarballs);
    }

    @Override
    public String toString()
    {
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <list.size() ; i++) {
            sb.append(list.get(i).getSweetname()+" "+list.get(i).getClass()+"\n");
        }
        return sb.toString();
    }

    public double totalweight() {
        double totalbulk=0;
        for (int i = 0; i <list.size() ; i++) {
            totalbulk+=totalbulk+list.get(i).getWeight();
        }
        return totalbulk;
    }

    public void sort() {
        Collections.sort(list,new sortbyname());
    }

    public void printaftersorting() {
        for (int i = 0; i <list.size(); i++) {
            System.out.print(list.get(i).getSweetname()+" ");
        }
    }

    public void range(double lowerlimit, double upperlimit) {
        for (int i = 0; i <list.size() ; i++) {
            if((list.get(i).getWeight()>=lowerlimit)&&(list.get(i).getWeight()<=upperlimit))
            {
                System.out.print(list.get(i).getSweetname()+" ");
            }
        }
    }
}
