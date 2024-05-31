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
        String verticalLines = verticalLines(height);
        String horizontalLine = horizontalLine(width * 2);
        System.out.println(verticalLines + horizontalLine);
    }

    @Override
    public String horizontalLine(int width) {
        return horizontalLine(width, UNIT_NULL);
    }
    @Override
    public String horizontalLine(int width, String line) {
        if (width > 0) {
            return horizontalLine(width - 1, line + HORIZONTAL_SIDE_UNIT);
        }
        return line;
    }

    protected String verticalLines(int height) {
        return verticalLines(height, UNIT_NULL);
    }
    protected String verticalLines(int height, String xy) {
        int beforeSym = height;
        int afterSym = 0;
        return verticalLines(height, beforeSym - 1, afterSym, xy);
    }


    protected String verticalLines(int height, int beforeSym, int afterSym, String xy) {
        if (height > 0) {
            xy = spaceBeforeSym(beforeSym, xy);
            xy = spaceBetweenSym(afterSym, xy);
            return verticalLines(height - 1, beforeSym - 1, afterSym + 2, xy);
        }
        return xy;
    }

    protected static String spaceBeforeSym(int enterSym, String xy) {
        for (int i = enterSym; i > 0; i--) {
            xy += UNIT_SPACE;
        }
        xy += TRIANGLE_LEFT_SIDE_UNIT;
        return xy;
    }

    protected static String spaceBetweenSym(int enterSpace, String xy) {
        for (int j = 0; j < enterSpace; j++) {
            xy += UNIT_SPACE;
        }
        xy += TRIANGLE_RIGHT_SIDE_UNIT + '\n';
        return xy;
    }
}
