//多次元配列.htmlのクイズ
class MultiArray{
    public static void main(String[] args){
        //文字列型のargs=arguments(引数)配列を作る
        int[][] allScore =new int[2][3];
        allScore[0][0] =80;
        allScore[0][1] =100;
        allScore[0][2] =75;
        allScore[1][0] =85;
        allScore[1][1] =95;
        allScore[1][2] =80;

        //　多次元配列の初期化
        // int[][] allScore = { {10, 20, 30}, {40, 50, 60} };

        System.out.println(allScore[0][0] +"点");
        System.out.println(allScore[0][1] +"点");
        System.out.println(allScore[0][2] +"点");
        System.out.println(allScore[1][0] +"点");
        System.out.println(allScore[1][1] +"点");
        System.out.println(allScore[1][2] +"点");

        System.out.println("allScore.length :"+ allScore.length);
        System.out.println("allScore[0].length :"+ allScore[0].length);
    }
}
