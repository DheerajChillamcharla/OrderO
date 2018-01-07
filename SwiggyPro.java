package swiggypro;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

interface billing{
    double total();
    void billdisp();
}

public class SwiggyPro {

        public static void main(String[] args) throws IOException, InterruptedException  {
            Scanner in=new Scanner(System.in);
            String name;
            String address;
            long number;
            System.out.println("Enter the name");
            name=in.nextLine();
            System.out.println("Enter the Number");
            number=in.nextLong();
            variables v=new variables(name,number);
            hotels h=new hotels(name,number);
            Thread t1=new Thread( h);
            t1.start();
            t1.join(); 
        }
}
class variables{
    int choice;
    String name;
    long number;
    variables(String n,long b){
        name=n;
        number=b;    
    }
    ArrayList<String> bdish=new ArrayList<String>();
    ArrayList<Double> bprice=new ArrayList<Double>();
    ArrayList<Double> bquantity=new ArrayList<Double>();
    ArrayList<Double> btotal=new ArrayList<Double>();
}
class hotels extends variables implements Runnable{
            Scanner sc=new Scanner(System.in);
            double GrandTotal;
            int choice;
            char ch='y';
            Bt b =new Bt(name,number);

    public hotels(String n, long b) {
        super(n, b);
    }
            @Override
            public void run() {
            while(ch=='y')
            {
                try{
                    FileInputStream fin=new FileInputStream("C:\\Users\\Aditya Ramachandran\\Desktop\\SwiggyPro\\Database\\hotels.txt");

                    int i=0;
                    while((i=fin.read())!=-1){
                    System.out.print((char)i);
                    }
                    System.out.println();
                    fin.close();
                }catch(Exception e){};
                System.out.println("enter your choice");
                super.choice=sc.nextInt();
                switch(super.choice)
                {
                    case 1:
                        System.out.println("welcome to Mc Donalds");
                        String dish1[]={"Rice  Bowl","Mc  Pizza","Mc  Burger","Phirnee  Flurry","Limon  Zest","C. Maharaja","McSpicy Burger","Mc.C Burger","Mexian McAloo","Cheesy Italian"};

                        try{

                            FileInputStream fin1=new FileInputStream("C:\\Users\\Aditya Ramachandran\\Desktop\\SwiggyPro\\Database\\menu1.txt");
                            int j=0;
                            while((j=fin1.read())!=-1){
                            System.out.print((char)j);
                            }
                            System.out.println();
                            fin1.close();
                        }catch(IOException e){}
                        double price1[]={129,150,100,84,50,171,40,84,40,84};
                        b.select(price1,dish1);

                        break;
                    case 2:
                        System.out.println("welcome to Firangi Bake");
                        String dish2[]={"Chicken Keema","Smokey Beans","Bombay Masala","Tangy Chole","Pmento&Sausage","Chipotle ball","Tandoori Kukkad","Achari Fish","Sicilian velvet","Beans Lasagne"};

                        try{

                            FileInputStream fin1=new FileInputStream("C:\\Users\\Aditya Ramachandran\\Desktop\\SwiggyPro\\Database\\menu2.txt");
                            int j=0;
                            while((j=fin1.read())!=-1){
                            System.out.print((char)j);
                            }
                            System.out.println();
                            fin1.close();
                        }catch(IOException e){}
                        double price2[]={230,220,220,220,230,230,300,300,100,290};
                        b.select(price2,dish2);
                        break;
                    case 3:
                        System.out.println("welcome to Mehfil");
                        String dish3[]={"Chicken Biryani","Butter Nans","Meh Noodles","Tandoori Mutton","Tangdi Kebab","Chicken Tikka","Mutton Fry","Egg Curry","Butter Mutton","Dal chilliFry"};

                        try{

                            FileInputStream fin1=new FileInputStream("C:\\Users\\Aditya Ramachandran\\Desktop\\SwiggyPro\\Database\\menu3.txt");
                            int j=0;
                            while((j=fin1.read())!=-1){
                            System.out.print((char)j);
                            }
                            System.out.println();
                            fin1.close();
                        }catch(IOException e){}
                        double price3[]={200,100,120,120,80,100,150,70,140,70};
                        b.select(price3,dish3);
                        break;
                    case 4:
                        System.out.println("welcome to Burger King ");
                        String dish4[]={"Boss Whoper","BK Veggie","anner King","BK Girlled","Chicken Tandori","Crispy Veg","Veg Suprise","Chicken Chilli","Veg Whopper","Chicken Whopper"};

                        try{

                            FileInputStream fin1=new FileInputStream("C:\\Users\\Aditya Ramachandran\\Desktop\\SwiggyPro\\Database\\menu4.txt");
                            int j=0;
                            while((j=fin1.read())!=-1){
                            System.out.print((char)j);
                            }
                            System.out.println();
                            fin1.close();
                        }catch(IOException e){}
                        double price4[]={169,69,119,89,139,45,89,109,119,135};
                        b.select(price4,dish4);
                        break;

                    case 5:
                        System.out.println("welcome to Blue Drogon");
                        String dish5[]={"Sweetcorn Soup","Manchow Soup","Tomato Soup","Clear Soup","TomYum Soup","Lemon Soup","LungFung Soup"};

                        try{

                            FileInputStream fin1=new FileInputStream("C:\\Users\\Aditya Ramachandran\\Desktop\\SwiggyPro\\Database\\menu5.txt");
                            int j=0;
                            while((j=fin1.read())!=-1){
                            System.out.print((char)j);
                            }
                            System.out.println();
                            fin1.close();
                        }catch(IOException e){}
                        double price5[]={80,80,80,80,80,80,80};
                        b.select(price5,dish5);
                        break;
                    case 6:
                        System.out.println("welcome to Cream Stone ");
                        String dish6[]={"Willy Wonka","Oreo Shot","Choco Lava","Ferrero Rocher","Brownie Break","Nutella Brownie","Litchi Lake","Fruit Exotica","Kala Jamun","Chatpata Guava"};

                        try{

                            FileInputStream fin1=new FileInputStream("C:\\Users\\Aditya Ramachandran\\Desktop\\SwiggyPro\\Database\\menu6.txt");
                            int j=0;
                            while((j=fin1.read())!=-1){
                            System.out.print((char)j);
                            }
                            System.out.println();
                            fin1.close();
                        }catch(IOException e){}
                        double price6[]={150,125,187,195,133,162,141,141,160,135};
                        b.select(price6,dish6);
                        break;
                    case 7:
                        System.out.println("welcome to Thickshake Factory ");
                        String dish7[]={"Swiggy Shake","Belgian Choco","Creamy Snicker","Peanut Butter","Blue Apple","Lovely Litchi","Fuzzy Kiwi","Banana Havana","Chocolat Banana","Mexican Vanilla"};

                        try{

                            FileInputStream fin1=new FileInputStream("C:\\Users\\Aditya Ramachandran\\Desktop\\SwiggyPro\\Database\\menu7.txt");
                            int j=0;
                            while((j=fin1.read())!=-1){
                            System.out.print((char)j);
                            }
                            System.out.println();
                            fin1.close();
                        }catch(IOException e){}
                        double price7[]={159,139,139,139,130,130,130,139,139,129};
                        b.select(price7,dish7);
                        break;
                    case 9:
                        System.out.println("welcome to Minerva Coffee ");
                        String dish9[]={"Crispy Vegies","Veg Manchuria","Gobi Manchuria","Loose Corn","BabyCorn soup","Panner soup","Chilli Panner","Human Panner","Panner 65","Panner Tikka"};

                        try{

                            FileInputStream fin1=new FileInputStream("C:\\Users\\Aditya Ramachandran\\Desktop\\SwiggyPro\\Database\\menu9.txt");
                            int j=0;
                            while((j=fin1.read())!=-1){
                            System.out.print((char)j);
                            }
                            System.out.println();
                            fin1.close();
                        }catch(IOException e){}
                        double price9[]={240,250,250,260,260,265,265,265,270,270};
                        b.select(price9,dish9);
                        break;
                    case 8:
                        System.out.println("welcome to Ovenstory Pizza ");
                        String dish8[]={"Napoli Delight","Corn Veggie","Spanish Sunshin","Exotica Panner","Smoked Chicken","Chicken Delight","Double Chicken","Roasted Vegeie","Picnate Panner","C. Paradise"};

                        try{

                            FileInputStream fin1=new FileInputStream("C:\\Users\\Aditya Ramachandran\\Desktop\\SwiggyPro\\Database\\menu8.txt");
                            int j=0;
                            while((j=fin1.read())!=-1){
                            System.out.print((char)j);
                            }
                            System.out.println();
                            fin1.close();
                        }catch(IOException e){}
                        double price8[]={246,306,361,407,276,331,407,479,445,471};
                        b.select(price8,dish8);
                        break;
                    case 10:
                        System.out.println("welcome to Almond House ");
                        String dish10[]={"Badam Barfi","Badam Halwa","Bandar Laddu","Kaju Barfi","Mysore Pak","Madata Kaja","Ajmeri Kalakand","Badam Ashrafia","Badam jal","Ribbon Pakodi"};

                        try{

                            FileInputStream fin1=new FileInputStream("C:\\Users\\Aditya Ramachandran\\Desktop\\SwiggyPro\\Database\\menu10.txt");
                            int j=0;
                            while((j=fin1.read())!=-1){
                            System.out.print((char)j);
                            }
                            System.out.println();
                            fin1.close();
                        }catch(IOException e){}
                        double price10[]={510,435,180,420,180,180,180,540,540,120};
                        b.select(price10,dish10);
                        break;
                        

                    }
                    System.out.println("do u want to continue?(y/n)" );
                    ch=sc.next().charAt(0);

                }
            for(int p=0;p<25;p++)
                System.out.println();
            double gtotal=b.total();
            b.billdisp();
            System.out.println("SGST 9%     :\t\t\t\t\t\t"+0.09*gtotal);
            System.out.println("CGST 9%     :\t\t\t\t\t\t"+0.09*gtotal);
            System.out.println("=============================================================");
            System.out.println("Grand Total :\t\t\t\t\t\t"+(gtotal+0.18*gtotal));
            System.out.println("your order is confirmed");
            if(gtotal>=400)
            System.out.println("home delivery is available");
            else
            System.out.println("sorry home delivery is available only when you make bill >=400");
            System.out.println("Local choice"+choice);
            
            }
}
class Bt extends variables  implements billing {
    int k=0;

    Bt(String n, long b) {
        super(n, b);
    }
    void select(double price1[],String dish[])
    {
                System.out.println("enter the number of items you want: ");
                Scanner sc=new Scanner(System.in);
                int noI=sc.nextInt();
                for(int p=0;p<noI;p++)
                {
                        System.out.println("Enter the item number");
                        int item=sc.nextInt();
                        bdish.add(dish[item-1]);
                        System.out.println("Enter the Quantity of the given item");
                        double quantity=sc.nextInt();
                        bquantity.add(quantity);
                        bprice.add(price1[item-1]);
                        btotal.add(bprice.get(k)*bquantity.get(k)) ;
                        k++;
                }
    }
    @Override
    public void billdisp()
    {
        System.out.println("Name: "+super.name+"\t"+"Number: "+number);
        System.out.println("=============================================================");
        System.out.println("ITEM\t\t\tPRICE\t\tQUANTITY\tTOTAL");
        int t=0;
        for(int i=0;i<k;i++)
        {
            System.out.println(bdish.get(i)+"\t\t"+bprice.get(t)+"\t\t"+bquantity.get(t)+"\t\t"+btotal.get(t));
            t++;
        }
        System.out.println("working");
        
    }
    @Override
    public double total()
    {
        double gtotal=0;
        for(int w=0;w<k;w++)
        {
            gtotal=gtotal+btotal.get(w);
            
        }
        return gtotal;
    }
}




