package com.walking.geometric.figure;

public class Triangle extends CorrectFigure {
    protected static final String TRIANGLE_LEFT_SIDE_UNIT = "/";
    protected static final String TRIANGLE_RIGHT_SIDE_UNIT = "\\";
    protected static final String HORIZONTAL_SIDE_UNIT = "-";

    public Triangle(int length) {
        super(length);
    }

    @Override
    public void build() {
        String verticalLines = createVerticalLines(height);
        String horizontalLine = createHorizontalLine(width * 2);
        System.out.println(verticalLines + horizontalLine);
    }

    @Override
    public String createHorizontalLine(int width) {
        return createHorizontalLine(width, UNIT_NULL);
    }
    @Override
    public String createHorizontalLine(int width, String line) {
        if (width > 0) {
            return createHorizontalLine(width - 1, line + HORIZONTAL_SIDE_UNIT);
        }
        return line;
    }

    protected String createVerticalLines(int height) {
        return createVerticalLines(height, UNIT_NULL);
    }
    protected String createVerticalLines(int height, String xy) {
        int beforeSym = height;
        int afterSym = 0;
        return createVerticalLines(height, beforeSym - 1, afterSym, xy);
    }


    protected String createVerticalLines(int height, int beforeSym, int afterSym, String xy) {
        if (height > 0) {
            xy = createLeftSide(beforeSym, xy);
            xy = createRightSide(afterSym, xy);
            return createVerticalLines(height - 1, beforeSym - 1, afterSym + 2, xy);
        }
        return xy;
    }

    protected static String createLeftSide(int enterSym, String xy) {
        for (int i = enterSym; i > 0; i--) {
            xy += UNIT_SPACE;
        }
        xy += TRIANGLE_LEFT_SIDE_UNIT;
        return xy;
    }

    protected static String createRightSide(int enterSpace, String xy) {
        for (int j = 0; j < enterSpace; j++) {
            xy += UNIT_SPACE;
        }
        xy += TRIANGLE_RIGHT_SIDE_UNIT + '\n';
        return xy;
    }
}
