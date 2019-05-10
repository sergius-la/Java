    // Get ArrayList of Ints from String
    private ArrayList<Integer> getIntSubsequence(String str) {
        ArrayList<Integer> result = new ArrayList<>();
        StringBuilder subsequence = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                for (int j = i; j < str.length(); j++) {
                    char currect = str.charAt(j);
                    int numJ = j;

                    if (Character.isDigit(str.charAt(j))) {
                        subsequence.append( str.charAt(j));
                        if (j == str.length()-1) {
                            i = j + 1;
                            if (!subsequence.toString().isEmpty()) {
                                result.add(Integer.parseInt(subsequence.toString()));
                            }
                        }
                    } else {
                        result.add(Integer.parseInt(subsequence.toString()));
                        subsequence = new StringBuilder();
                        i = j-1;
                        break;
                    }
                }
            }
        }
        return result;
    }