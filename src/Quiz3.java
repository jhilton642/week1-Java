public class Quiz3 {
    public static void main(String[] args) {
        float price1;
        float price2;
        float price3;
        float price4;
        float price5;
       price1 = priceOfShipping("Canada", true,200);
       price2 = priceOfShipping("Mexico",false,100);
       price3 = priceOfShipping("US", true, 50);
       price4 = priceOfShipping("US",false,600);
       price5 = priceOfShipping("Canada",false, 100);
       System.out.println(price1);
       System.out.println(price2);
       System.out.println(price3);
       System.out.println(price4);
       System.out.println(price5);

    }

    public static float priceOfShipping(String destination, boolean saturdayDelivery, float orderValue) {
        float deliveryCost;
        int discount;
        int additionalCharge;
        switch (destination) {
            case "US":
                deliveryCost = 20.0f;
                break;
            case "Mexico":
                deliveryCost = 32.0f;
                break;
            default:      // Assume that the country is Canada
                deliveryCost = 25.0f;
                break;
        }
        if (orderValue > 100) {
            switch (destination) {
                case "US":
                    discount = -5;
                    break;
                case "Mexico":
                    discount = -7;
                    break;
                default:
                    discount = -7;
                    break;
            }
        } else {
            discount = 0;
        }
        if (saturdayDelivery = true) {
            switch (destination) {
                case "US":
                    additionalCharge = 10;
                    break;
                case "Mexico":
                    additionalCharge = 20;
                    break;
                default:
                    additionalCharge = 12;
                }
            }
else{
                additionalCharge = 0;
            }
float ans;
ans = deliveryCost + discount + additionalCharge + orderValue;
return ans;
        }
    }
