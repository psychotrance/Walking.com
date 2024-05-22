package com.walking.geometric.figure;

public class Square extends CorrectFigure {

    public Square(int length) {
        super(length);
    }

    @Override
    protected String printFigure(String horizontalLine, int width, String verticalLines, int height, String figure) {
        verticalLines += verticalLines(height, width * 3, verticalLines, horizontalLine);
        horizontalLine += horizontalLine(width * 3, horizontalLine + UNIT_SPACE);
        return figure = horizontalLine + verticalLines + horizontalLine;
    }

    protected String horizontalLine(int width, String horizontalLine) {
        if (width > 0) {
            horizontalLine += UNIT_WIDTH;
            return horizontalLine(width - 1, horizontalLine);
        }
        horizontalLine += '\n';
        return horizontalLine;
    }

    @Override
    protected String verticalLines(int height, int width, String y, String x) {
            for (int i = height; i > 0; i--) {
                y += verticalLine(width, x, height - 1);
        }
        return y;
    }

    private String verticalLine(int width, String x, int height) {
        x += UNIT_HEIGHT;
        for (int i = width; i > 0; i--) {
                x += UNIT_SPACE;
        }
        x += UNIT_HEIGHT + '\n';
        return x;
    }
}