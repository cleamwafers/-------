class Loop3 {
        public static void main(String[] args){
            //文字列型のargs=arguments(引数)配列を作る
            int[] score = new int[3];
            score[0] = 80;
            score[1] = 100;
            score[2] = 75;
    
            String[] name = {"菅原","村山","寺島"};
    
           for(int i = 0; i < score.length; i++){
            System.out.println(name[i] +"さん:" + score[i] + "点" );
           }
            System.out.println("受験者数" + score. length  + "名" );
            /*length=要素数 */
        }
    }