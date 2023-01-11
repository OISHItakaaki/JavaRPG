package RPG;

import java.util.Random;
import java.util.Scanner;

public class StartUp1 {
	
	public static void main(String[] args) {
		Hero1 h = new Hero1("勇者",20,100);
		Satan1 s = new Satan1("魔王",10,200);
		Item1 i = new item1("回復薬",3);
		
		
		
		do {
			System.out.println("------------------------------");
			System.out.println(h.gethroname() + "の行動を決めろ！");
			System.out.println("1: 攻撃");
			System.out.println("2: 回復薬を使う");
			System.out.println("3: 必殺技");
			System.out.println("あなたの選択は:");
//			勇者行動選択
			Scanner scan = new Scanner(System.in);
			int hand = scan.nextInt();
//			勇者必殺技用のランダムクラス
			Random heroRandom = new Random();
			int satanRandom = random.nextInt(10) + 1;
			
			switch(hand) {
			
			}
		} while();
		
		if() {
			
		}
	}
	

}
