class Echo {
    public static void main(String[] args){
        int i;
        //コマンドラインの入力文字列を表示(for文)
        for (i = 0; i< args.length; i++){ //変数は宣言したブロックの中でないと使えない
            System.out.println(args[i]);
        }
        System.out.println(i);
    }    
}
