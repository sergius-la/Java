// http://www.sqlitetutorial.net/sqlite-java/insert/

public void insertUser(String instaID, String name, String bio,
                           int following, int followers, int posts, boolean isPravate) throws SQLException {

        String query = "" +
                "INSERT INTO users(instagram_ID, name, bio, following, followers, posts, isPrivate)\n" +
                "VALUES(?,?,?,?,?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, instaID);
        preparedStatement.setString(2, name);
        preparedStatement.setString(3, bio);
        preparedStatement.setInt(4, following);
        preparedStatement.setInt(5, followers);
        preparedStatement.setInt(6, posts);
        preparedStatement.setBoolean(7, isPravate);
        preparedStatement.execute();
}