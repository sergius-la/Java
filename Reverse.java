    // Reverse int[] - 0(n)
    private static int[] reverse(int[] array) {

        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            result[i] = array[ (array.length-1) - i];
        }
        return result;
    }
    
    
    // Reverse Tim - 0(n/2)
     private static int[] reverseTim(int[] array) {

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];

            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        return array;
    }