package colLesson03;

import java.util.Scanner;

public class ColLesson03 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Wordクラスのインスタンス配列
		Word[] words = new Word[5];

		// コマンドラインから入力
		System.out.println("英単語と日本語をスペースで区切って入力して下さい。");
		Scanner sc  = new Scanner(System.in);
		String input = sc.nextLine();

		// ここから記述してください
		// 例えば、「apple  りんご」と入力されたときはtmp[0]に"apple"、tmp[1]に"りんご"が入る
		String[] tmp = new String[2];

//

		int index = 0;

		try{
			while(!input.equals("e")){
				tmp = input.split(" ");
				Word word1 = new Word();
				word1.setEnglish(tmp[0]);
				word1.setJapanese(tmp[1]);
				words[index] = word1;
//				words[index] = input;
				index++;
				System.out.println("次の英単語と日本語を入力してください。\"e\"で終了します。");
				input = sc.nextLine();

			}

		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("登録制限を越えました。登録済みのデータは以下になります。");


		}


		for(int i = 0; i< index; i++) {
			Word word2;
			word2 = words[i];
			System.out.println(word2);
		}
		System.out.println(index + "件登録しました。");

	}
}
