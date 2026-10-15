package com.hikinggame.event;

public class Event implements IStatus {

    /* 선택지를 고른 뒤 벌어지는 기능 */

    @Override
    public void hp() {
        // 안전한 길을 만나 체력이 깎이지 않거나, 함정을 만나 체력이 -1 깎인다.
    }

    @Override
    public void speed() {
        // 안전한 길을 만나 1칸 전진 or 함정을 만나 -1칸
    }

    @Override
    public void dodges() {
        // 안전한길과 함정을 제외한, 4번 선택지 회피를 선택하면 회피 횟수 -1, 선택하지 않으면 회피 횟수 변동 없다.
    }

    @Override
    public void MaxTurns() {
        // 안전한 길을 골라도, 함정을 골라도, 회피를 선택해도 -1턴.
    }
}
