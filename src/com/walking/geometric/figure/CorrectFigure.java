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
        String horizontalLine = horizontalLine(width);
        String verticalLines = verticalLines(height, width);
        System.out.println(verticalLines + horizontalLine);
    }

    protected String verticalLines(int height, int width) {
        return verticalLines(height, width, UNIT_SPACE, UNIT_SPACE);
    }

    protected String verticalLines(int height, int width, String sides, String line) {
        if (height > 0) {
            sides += line;
            return verticalLines(height - 1, width, sides, line);
        }
        return sides;
    }

    protected String horizontalLine(int width) {
        return horizontalLine(width, UNIT_SPACE);
    }

    protected String horizontalLine(int width, String line) {
        if (width > 0) {
            return horizontalLine(width - 1, line);
        }
        line += '\n';
        return line;
    }
}
