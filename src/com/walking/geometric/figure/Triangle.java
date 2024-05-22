package com.walking.geometric.figure;

public class Triangle extends CorrectFigure {

    public Triangle(int length) {
        super(length);
    }

    @Override
    public String printFigure(String horizontalLine, int width, String verticalLines, int height, String figure) {
        verticalLines = verticalLines(height, verticalLines);
        horizontalLine = horizontalLine(width * 2, horizontalLine);
        return figure = verticalLines + horizontalLine;
    }

    private String verticalLines(int height, String xy) {
        int beforeSym = height;
        int afterSym = 0;
        return verticalLines(height, beforeSym - 1, afterSym, xy);
    }

    private String verticalLines(int height, int beforeSym, int afterSym, String xy) {
        if (height > 0) {
            xy = spaceBeforeSym(beforeSym, xy);
            xy = spaceBetweenSym(afterSym, xy);
            return verticalLines(height - 1, beforeSym - 1, afterSym + 2, xy);
        }
        return xy;
    }

    private static String spaceBeforeSym(int enterSym, String xy) {
        for (int i = enterSym; i > 0; i--) {
            xy += UNIT_SPACE;
        }
        xy += UNIT_SLASH;
        return xy;
    }

    private static String spaceBetweenSym(int enterSpace, String xy) {
        for (int j = 0; j < enterSpace; j++) {
            xy += UNIT_SPACE;
        }
        xy += UNIT_BACKSLASH + '\n';
        return xy;
    }

    @Override
    public String horizontalLine(int width, String line) {
        if (width > 0) {
            return horizontalLine(width - 1, line + UNIT_WIDTH);
        }
        return line;
    }
}
