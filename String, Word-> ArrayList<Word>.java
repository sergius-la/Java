    // Find words in a String with no spaces, case sensetive
    private ArrayList<String> findWord(String in, String word) {
        ArrayList<String> result = new ArrayList<>();
        int wordLength = word.length();

        for (int i = 0; i < in.length(); i++) {
            if (i + wordLength <= in.length()) {
                if (in.substring(i, wordLength + i).equals(word)) {
                    result.add(word);
                }
            }
        }
        return result;
    }