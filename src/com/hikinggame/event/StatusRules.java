package com.hikinggame.event;

public class StatusRules implements IStatus {

    /* Status 규칙 설정 */

    @Override
    public void hp() {
        // 체력은 1~7까지 설정.
        int maxHp = 0;
        for (int i = 7; i <= 0; i--) {

        }
    }

    @Override
    public void speed() {
        // 진행 범위는 1~3회까지 설정.
    }

    @Override
    public void dodges() {
        // 회피 횟수는 0~6회까지 설정.
    }

    @Override
    public void MaxTurns() {
        // 턴 개수는 8~16회까지 설정.
    }
}
