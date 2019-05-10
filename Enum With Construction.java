// Урок: https://youtu.be/ll14SKsQScE  
    
    enum CoffeeSize { SMALL(100), MEDIUM(200),

        BIG(300) {
        String getCup() {
            return "Paper";
        }
    };

        String cup = "Plastic";
        int milliliters;
        CoffeeSize(int milliliters) {
            this.milliliters = milliliters;
        }

        int getMilliliters() {
            return milliliters;
        }

        String getCup() {
            return cup;
        }
    }

    public static void main(String[] args) {
        CoffeeSize smallCoffee = CoffeeSize.SMALL;
        System.out.println(smallCoffee);
        System.out.println(smallCoffee.getMilliliters());
        System.out.println(smallCoffee.getCup());

        CoffeeSize bigCoffee = CoffeeSize.BIG;
        System.out.println(bigCoffee);
        System.out.println(bigCoffee.getMilliliters());
        System.out.println(bigCoffee.getCup());
    }