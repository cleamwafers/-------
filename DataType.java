class DataType{
    public static void main(String[] args){
        //文字列型のargs=arguments(引数)配列を作る
        int month = 12;
        int day =29;
        float weight = 63.0f;
        /*float型はfをつける*/ 
        double height = 168.5;
        char bloodType = 'A';

        String name = "菅原";

        System.out.println("こんにちは!" + name + "です。");
        System.out.println("身長は"+ height + "cm、体重は"+ weight + "kg、");
        System.out.println("誕生日は" + month + "月" + day +"日、");
        System.out.println("血液型は" +bloodType + "型です。");
        System.out.println("チャンネル登録や拡散よろしくお願いします！");
    }
}