package com.hikinggame;

import com.hikinggame.character.Character;
import com.hikinggame.character.MadongSeok;
import com.hikinggame.character.NoHongChul;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===게임 시작===");
        System.out.print("캐릭터를 고르세요: ");


        Character myCharacter = null;

        while(myCharacter == null){
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    myCharacter = new MadongSeok(20, 3);
                    System.out.println("마동석을 선택했습니다.");
                }
                case 2 -> {
                    myCharacter = new NoHongChul(10, 10);
                    System.out.println("노홍철을 선택했습니다.");
                }
                default -> System.out.print("없는 캐릭터입니다. 캐릭터를 다시 선택해주세요: ");
            }
        }
        //여기까지 캐릭터 생성완료.

    }
}
