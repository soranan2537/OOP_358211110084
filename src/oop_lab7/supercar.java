package oop_lab7;
//1.car brand
//2.car color
//3.car engine size
//4.max speed
//5. country of origin
public class supercar {
    private String carBrand;
    private String carColor;
    private String engSize;

    public SuperCer (){}
    public SuperCer(String b,String c,String e){
        this.carBrand = b;
        this.carColor = c;
        this.engSize = e;
    }

    public String getSuperCarInfo() {
        return "SuperCar{" +
                "carBrand='" + carBrand + '\'' +
                ", carColor='" + carColor + '\'' +
                ", engSize='" + engSize + '\'' +
                '}';
    }


    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getEngSize() {
        return engSize;
    }

    public void setEngSize(String engSize) {
        this.engSize = engSize;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
}
