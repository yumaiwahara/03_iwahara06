package colLesson04;

import java.util.ArrayList;
import java.util.Scanner;

public class ColLesson04 {
	public static void main(String[] args) {
		// Wordクラスのインスタンス配列
		ArrayList<Word> array = new ArrayList<Word>();

		// コマンドラインから入力
		System.out.println("英単語と日本語をスペースで区切って入力して下さい。");
		Scanner sc  = new Scanner(System.in);
		String input = sc.nextLine();

		// ここから記述してください
		// 例えば、「apple  りんご」と入力されたときはtmp[0]に"apple"、tmp[1]に"りんご"が入る
		String[] tmp = new String[2];


		int index = 0;
		try{
			while(!input.equals("e")){
				tmp = input.split(" ");
				array.add(new Word(tmp[0],tmp[1]));
				index++;
				System.out.println("次の英単語と日本語を入力してください。\"e\"で終了します。");
				input = sc.nextLine();
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("登録制限を越えました。登録済みのデータは以下になります。");

		}


		for(int i= 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		System.out.println(index + "件登録しました。");
		}
	}

