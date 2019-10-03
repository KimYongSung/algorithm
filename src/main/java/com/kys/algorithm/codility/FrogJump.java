package com.kys.algorithm.codility;

/**
 * 작은 개구리가 길 반대편에 가고 싶어합니다. 개구리는 현재 X 위치에 있으며 Y 이상의 위치에 도달하려고합니다. 작은 개구리는 항상 고정 거리 D를 뛰어 넘습니다.
 *
 * 작은 개구리가 목표에 도달하기 위해 수행해야하는 최소 점프 횟수를 세십시오.
 *
 * 함수를 작성하십시오.
 *
 * 클래스 솔루션 {public int solution (int X, int Y, int D); }
 *
 * 즉, 3 개의 정수 X, Y 및 D가 주어지면 X 위치에서 Y 이상의 위치로 최소 점프 횟수를 반환합니다.
 *
 * 예를 들면 다음과 같습니다.
 *
 *   X = 10
 *   Y = 85
 *   D = 30
 * 개구리가 다음과 같이 배치되므로 함수는 3을 반환해야합니다.
 *
 * 첫 번째 점프 후 위치 10 + 30 = 40
 * 두 번째 점프 후 위치 10 + 30 + 30 = 70
 * 세 번째 점프 후 위치 10 + 30 + 30 + 30 = 100
 * 다음 가정을위한 효율적인 알고리즘을 작성하십시오 .
 *
 * X, Y 및 D는 [ 1 .. 1,000,000,000 ] 범위 내의 정수 이며;
 * X ≤ Y
 * Codility Limited의 저작권 2009–2019. 판권 소유. 무단 복사, 출판 또는 공개는 금지됩니다.
 */
public class FrogJump {

    public int solution (int X, int Y, int D){

        int distance = Y - X;

        if(distance % D == 0)
            return distance / D;

        return distance / D + 1 ;
    }
}
