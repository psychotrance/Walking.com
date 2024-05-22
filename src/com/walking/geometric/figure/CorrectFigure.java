package com.walking.geometric.figure;

public class CorrectFigure {
    protected static final String UNIT_SPACE = " ";
    protected static final String UNIT_WIDTH = "-";
    protected static final String UNIT_HEIGHT = "|";
    protected static final String UNIT_SLASH = "/";
    protected static final String UNIT_BACKSLASH = "\\";

    public CorrectFigure(int length) {
        int height;
        int width;
        width = height = length;
        String horizontalLine = "";
        String verticalLines = "";
        String figure = "";
        System.out.println(createFigure(horizontalLine, width, verticalLines, height, figure));
    }

    protected String createFigure(String horizontalLine, int width, String verticalLines, int height, String figure) {
        horizontalLine += horizontalLine(width, horizontalLine);
        verticalLines += verticalLines(height, width, verticalLines, horizontalLine);
        return figure = verticalLines + horizontalLine;
    }



    protected String verticalLines(int height, int width, String y, String x) {
        if (height > 0) {
            y += x;
            return verticalLines(height - 1, width, y, x);
        }

        return y;
    }
    protected String horizontalLine(int width, String line) {
        if (width > 0) {
            return horizontalLine(width - 1, line );
        }
        line += '\n';
        return line;
    }
}
