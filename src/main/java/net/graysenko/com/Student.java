package net.graysenko.com;

public class Student {
    private String ccy;
    private String baseccy;
    private double buy;
    private double sale;

    public Student() {
    }

    public Student(String ccy, String baseccy, double buy, double sale) {
        this.ccy = ccy;
        this.baseccy = baseccy;
        this.buy = buy;
        this.sale = sale;
    }

    public double getBuy() {
        return buy;
    }

    public void setBuy(double buy) {
        this.buy = buy;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public String getBaseccy() {
        return baseccy;
    }

    public void setBaseccy(String baseccy) {
        this.baseccy = baseccy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Валюта для обмена: '" + ccy + '\'' +
                ", Перевод в: '" + baseccy + '\'' +
                ", Купить: " + buy + '\'' +
                ", Продать: " + sale +
                '}';
    }
}
