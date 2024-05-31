package com.walking.geometric.figure;

public class CorrectFigure {
    protected static final String UNIT_SPACE = " ";
    protected static final String UNIT_NULL = "";
    protected static int width;
    protected static int height;

    public CorrectFigure(int length) {
        width = length;
        height = length;
    }

    protected void build() {
        String horizontalLine = createHorizontalLine(width);
        String verticalLines = createVerticalLines(height, width);
        System.out.println(verticalLines + horizontalLine);
    }

    protected String createVerticalLines(int height, int width) {
        return createVerticalLines(height, width, UNIT_SPACE, UNIT_SPACE);
    }

    protected String createVerticalLines(int height, int width, String sides, String line) {
        if (height > 0) {
            sides += line;
            return createVerticalLines(height - 1, width, sides, line);
        }
        return sides;
    }

    protected String createHorizontalLine(int width) {
        return createHorizontalLine(width, UNIT_SPACE);
    }

    protected String createHorizontalLine(int width, String line) {
        if (width > 0) {
            return createHorizontalLine(width - 1, line);
        }
        line += '\n';
        return line;
    }
}
