import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Double> arrSintyou = new ArrayList<>();
        double Sintyou; // ユーザから身長の入力を受け取る
        System.out.println("1人目の身長を入力してください(単位：cm)（終えるときは-1）");
        Sintyou = new Scanner(System.in).nextInt();
        int t = 1;

        while(Sintyou>=0){
            arrSintyou.add(Sintyou);
            t++;
            System.out.println(t+"人目の身長を入力してください(単位：cm)(終えるときは-1)");
            Sintyou = new Scanner(System.in).nextInt();
        }


        ArrayList<Double> arrTaiju = new ArrayList<>();
        double Taiju; // ユーザーから体重の入力を受け取る

        for(int i = 1;i<=t-1 ;i++) {
            System.out.println(i+"人目の体重を入力してください(単位：kg)");
            Taiju= new Scanner(System.in).nextInt();
            arrTaiju.add(Taiju);
        }

        //インスタンスを生成して個々の身長、体重、BMIの要素を取り出す
        for(int i=0; i<arrSintyou.size(); i++){
            Bmi a = new Bmi(arrSintyou.get(i),arrTaiju.get(i));
            System.out.println(i+1+"人目の身長は"+a.getSintyou()+"cm、体重は、"+a.getTaiju()+"kg、BMIは"+a.getBmiParsonal()+"で、" +a.getBmiJudge()+
                    "です。");
        }

        double sumSintyou = 0;
        for(int i=0; i<arrSintyou.size(); i++){
            sumSintyou += arrSintyou.get(i);
        }
        double aveSintyouPre = (double) sumSintyou / arrSintyou.size(); //身長の平均を算出
        double aveSintyou = ((double) Math.round(aveSintyouPre * 10)) / 10;

        double sumTaiju = 0;
        for(int i=0; i<arrTaiju.size(); i++){
            sumTaiju += arrTaiju.get(i);
        }
        double aveTaijuPre = (double) sumTaiju / arrTaiju.size(); //体重の平均を算出
        double aveTaiju = ((double) Math.round(aveTaijuPre * 10)) / 10;

        double sumBmi =0;
        for (int i =0; i< arrSintyou.size();i++){  //繰り返しは入力された人の数なので、身長として入力された数を使用
            Bmi a = new Bmi(arrSintyou.get(i),arrTaiju.get(i));
            sumBmi += a.getBmiParsonal();
        }
        double aveBmiPre = (double)sumBmi / arrSintyou.size(); //BMIの平均を算出。割る数は入力された人数なので、身長として入力された数を使用
        double aveBmi = ((double) Math.round(aveBmiPre * 10)) / 10;

        System.out.println("今回は"+arrSintyou.size()+"人のデータで、平均身長は"+aveSintyou+"cm、平均体重は"+aveTaiju+"kg、平均のBMIは"+aveBmi+"です");


    }
}