package com.tony666.demo.et.police;

import com.tony666.demo.et.person.info.IdCard;

public class Police {

    public static void main(String[] args) {
        IdCard idCard = new IdCard();
        com.tony666.demo.et.car.Car carInfo = idCard.getCarInfo();
        carInfo.run("Police");
    }

}
