package com.walking.geometric.figure;

public class Square extends CorrectFigure {
    protected static final String HORIZONTAL_SIDE_UNIT = "-";
    protected static final String VERTICAL_SIDE_UNIT = "|";

    public Square(int length) {
        super(length);
    }

    @Override
    public void build() {
        String horizontalLine = createHorizontalLine(width);
        String verticalLines = createVerticalLines(height, width * 3);
        System.out.println(horizontalLine + verticalLines + horizontalLine);
    }

    @Override
    protected String createHorizontalLine(int width) {
        return createHorizontalLine(width * 3, UNIT_SPACE);
    }

    @Override
    protected String createHorizontalLine(int width, String horizontalLine) {
        if (width > 0) {
            horizontalLine += HORIZONTAL_SIDE_UNIT;
            return createHorizontalLine(width - 1, horizontalLine);
        }
        horizontalLine += '\n';
        return horizontalLine;
    }

    @Override
    protected String createVerticalLines(int height, int width) {
        return createVerticalLines(height, width, UNIT_NULL, UNIT_NULL);
    }

    @Override
    protected String createVerticalLines(int height, int width, String sides, String line) {
        for (int i = height; i > 0; i--) {
            sides += createVerticalLineUnit(width, line);
        }
        return sides;
    }

    private String createVerticalLineUnit(int width, String line) {
        line += VERTICAL_SIDE_UNIT;
        for (int i = width; i > 0; i--) {
            line += UNIT_SPACE;
        }
        line += VERTICAL_SIDE_UNIT + '\n';
        return line;
    }
}