import java.util.Scanner;

public class CountTheNumberOfMoney {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        int res = 0 ;

    
    while(num!=0){
        res = 0 ;
        
        if(num>=2000 ){
            res = num/2000;
            System.out.println("2000 " + res);
            num -= (2000*res);
        }
        else if(num>= 500 && num<=2000  ){
            res = num/500;
            System.out.println("500 " + res);
            num -= (500*res);
        }
        else if(num>=200 && num<=500  ){
            res = num/200;
            System.out.println("200 " + res);
            num -= (200*res);
        }
        else if(num>=100 && num<=200  ){
            res = num/100;
            System.out.println("100 " + res);
            num -= (100*res);
        }
        else if(num>= 50 && num<=100  ){
            res = num/50;
            System.out.println("50 " + res);
            num -= (50*res);
        }
        else if(num>= 20&& num<=50  ){
            res = num/20;
            System.out.println("20 " + res);
            num -= (20*res);
        }
        else if(num>=10 && num<= 20 ){
            res = num/10;
            System.out.println("10 " + res);
            num -= (10*res);
        }
        else if(num>=5 && num<= 10 ){
            res = num/5;
            System.out.println("5 " + res);
            num -= (5*res);
        }
        else if(num>=2 && num<=5  ){
            res = num/2;
            System.out.println("2 " + res);
            num -= (2*res);
        }
        else if(num>=1 && num<= 2 ){
            res = num/1;
            System.out.println("1 " + res);
            num -= (1*res);
        }

    }
}
    
}
