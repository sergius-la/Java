    public int getIntFromString(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch) || ch == '-') {
                result.append(ch);
            }
        }
        return Integer.parseInt(result.toString());
    }