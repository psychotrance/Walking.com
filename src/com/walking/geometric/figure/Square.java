package com.walking.geometric.figure;

public class Square extends CorrectFigure {
    protected static final String HORIZONTAL_SIDE_UNIT = "-";
    protected static final String VERTICAL_SIDE_UNIT = "|";

    public Square(int length) {
        super(length);
    }

    @Override
    public void build() {
        String horizontalLine = horizontalLine(width);
        String verticalLines = verticalLines(height, width * 3);
        System.out.println(horizontalLine + verticalLines + horizontalLine);
    }

    @Override
    protected String horizontalLine(int width) {
        return horizontalLine(width * 3, UNIT_SPACE);
    }

    @Override
    protected String horizontalLine(int width, String horizontalLine) {
        if (width > 0) {
            horizontalLine += HORIZONTAL_SIDE_UNIT;
            return horizontalLine(width - 1, horizontalLine);
        }
        horizontalLine += '\n';
        return horizontalLine;
    }

    @Override
    protected String verticalLines(int height, int width) {
        return verticalLines(height, width, UNIT_NULL, UNIT_NULL);
    }

    @Override
    protected String verticalLines(int height, int width, String sides, String line) {
        for (int i = height; i > 0; i--) {
            sides += verticalLineUnit(width, line);
        }
        return sides;
    }

    private String verticalLineUnit(int width, String line) {
        line += VERTICAL_SIDE_UNIT;
        for (int i = width; i > 0; i--) {
            line += UNIT_SPACE;
        }
        line += VERTICAL_SIDE_UNIT + '\n';
        return line;
    }
}