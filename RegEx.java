// Strings in Java have four built-in methods for regular expressions
matches()
split()
replaceFirst()
replaceAll()


// If you want to see if the regex matches an input text, use a Pattern, a Matcher and the .find() method of the matcher:

Pattern p = Pattern.compile("[a-z]");
Matcher m = p.matcher(inputstring);
if (m.find())
    // match
    
/*    
If what you want is indeed to see if an input only has lowercase letters, you can use .matches(), but you need to match one or more characters: append a + to your character class, as in [a-z]+. Or use ^[a-z]+$ and .find().
*/