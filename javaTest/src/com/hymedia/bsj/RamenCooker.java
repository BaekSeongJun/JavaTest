package com.hymedia.bsj;

import java.util.Scanner;

public class RamenCooker {
	public static void main(String[] args) {
		int MAXTIME = 300;
		int MINTIME = 180;
		int water = 0;
		int waterAmount;
		int waterTemperature = 0;
		String ramenName;
		boolean ramenNoodleAndSoop = false;
		int ramenCookingTime = 0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("끓일 라면을 입력해주세요: ");
		ramenName = sc.nextLine();

		System.out.print("표기된 필요한 물양을 입력해주세요 : ");
		waterAmount = sc.nextInt();
		
		sc.close();
		
		System.out.println("냄비에 물을 받습니다.");
		while(water < waterAmount){
			water++;
			System.out.printf("현재 냄비속 물 : %d(ml)\n",water);
		}
		System.out.println("필요한 물을 충분히 받았습니다.");
		System.out.println("가스불을 켜고 냄비를 올립니다.");

		if(water == waterAmount){
			for (int count = 0; count < MAXTIME; count++){
				if(waterTemperature < 100){
				waterTemperature = waterTemperature + 1;
				System.out.printf("현재 물온도 : %d (도)\n",waterTemperature);
				}
				if(waterTemperature >= 100){
					ramenCookingTime++;
					if(!ramenNoodleAndSoop){
						ramenNoodleAndSoop = true;
						System.out.println("물 온도가 100(도)가 되었습니다.\n면과 스프를 넣었습니다.");
					}
					System.out.printf("현재 라면 조리 시간 %d분 %d초\n", (ramenCookingTime/60),(ramenCookingTime%60));
				}
				if(ramenCookingTime >= MINTIME){
					System.out.println("라면을 넣은지 3분이 경과되었습니다.");
					System.out.printf("%s이(가) 조리가 완료되었습니다.\n",ramenName);
					break;
				}
			}
		}
		System.out.println("The end");
	}
}
