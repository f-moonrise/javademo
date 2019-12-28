import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/23 16:36
 */
public class Five {
    public static void main(String[] args) {
        new Five().run();
    }

    public void run(){
        //玩家信息输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入黑棋昵称");
        String nameBlack = scanner.nextLine();
        System.out.println("输入白棋昵称");
        String nameWhite = scanner.nextLine();

        //打印棋盘
        int size = 15;
        int[][] table = new int [size][size];

        System.out.print("  ");
        for(int i=0;i<size;i++){
            int value = i + 1;
            System.out.print(value < 10 ? value + " " : value + "   ");
        }
        System.out.println();

        for(int i = 0; i < size;i++){
            char title = (char)('A' + i);
            System.out.print(title + "  ");

        }

        //玩游戏
        int win = 0;
        do{
            //下棋
            //打印棋盘
            //检测输赢
        }while (win == 0);

        //显示胜利玩家
        if(win == 1){
            System.out.println(nameBlack + " 赢了");
        }else if(win == 2){
            System.out.println(nameWhite + " 赢了");
        }else {
            System.out.println("平局");
        }
    }
}
