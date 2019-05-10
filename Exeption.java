public void makeMove() {
        final int x = 0;
        final int y = 0;
        final Board board = getBoard();
        try {
            move(x,y,Figure.O);
        } catch (final FieldNotEmptyExeption | InvalidCoordinateExeption e) {
            e.printStackTrace();
        }
    }

    public void move(final int x, final  int y, final Figure figure) throws FieldNotEmptyExeption, InvalidCoordinateExeption {

            if (!checkCoordinate(x) || !checkCoordinate(y)) {
                throw new FieldNotEmptyExeption();
            }
            if (board.getFigure(x, y) == null) {
                throw new InvalidCoordinateExeption();
            }
            board.setFigure(x, y, figure);
    }