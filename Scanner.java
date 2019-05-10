// Get Only int from console
private static int getNumber() {
        final Scanner in = new Scanner(System.in);
        while (true) {
            try {
                int number = in.nextInt();
                if (number > 0) {
                    return number;
                } else {
                    System.out.println("Please enter only positive numbers");
                    in.nextLine();
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Please enter only positive numbers");
                in.nextLine();
            }
        }
}