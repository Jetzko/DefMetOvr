import java.util.Objects;

public class SmartphonePrice {
    public String priceType;
    public double priceInEuros;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        SmartphonePrice clonedSmartphonePrice = (SmartphonePrice) super.clone();
        return super.clone();
    }

    @Override
    public String toString() {
        return "SmartphonePrice{" +
                "priceType='" + priceType + '\'' +
                ", priceInEuros='" + priceInEuros + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphonePrice that = (SmartphonePrice) o;
        return Objects.equals(priceType, that.priceType) && Objects.equals(priceInEuros, that.priceInEuros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }
    public SmartphonePrice(String type, double price){
       this.priceType = type;
        this.priceInEuros = price;
    }
}
