public class Bmi {
    private double Sintyou;  //メンバ変数を定義
    private double Taiju;

    double getSintyou(){
        return Sintyou;
    }

    double getTaiju(){
        return Taiju;
    }

    Bmi(double Sintyou, double Taiju){
        this.Sintyou=Sintyou;
        this.Taiju=Taiju;
    }

    //ユーザーに入力された人のBMIを算出する
    double getBmiParsonal(){
        double bmiPre = Taiju/((Sintyou/100)*(Sintyou/100));
        double bmi =((double) Math.round(bmiPre*10))/10;
        return bmi;
    }

    //算出されたBMIによって体型の評価をする
    String getBmiJudge() {
        double bmiPre = Taiju / ((Sintyou / 100) * (Sintyou / 100));
        double bmi = ((double) Math.round(bmiPre * 10)) / 10;
        if (bmi < 18.5) {
            return "やせ型";
        }
        if (bmi >= 18.5 && bmi < 25) {
            return "標準体型";
        } else {
            return "肥満";
        }

    }
}