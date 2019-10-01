package br.com.rpms.dailycodingproblem.solution;

import java.util.*;

/**
 * This problem was asked by Google.
 *
 * You are given an M by N matrix consisting of booleans that represents a board.
 * Each True boolean represents a wall. Each False boolean represents a tile you can walk on.
 *
 * Given this matrix, a start coordinate, and an end coordinate, return the minimum number of steps required to reach the end
 * coordinate from the start. If there is no possible path, then return null. You can move up, left, down, and right.
 * You cannot move through walls. You cannot wrap around the edges of the board.
 *
 * For example, given the following board:
 *
 * [[f, f, f, f],
 * [t, t, f, t],
 * [f, f, f, f],
 * [f, f, f, f]]
 * and start = (3, 0) (bottom left) and end = (0, 0) (top left), the minimum number of steps required to reach the end is 7,
 * since we would need to go through (1, 2) because there is a wall everywhere else on the second row.
 */
public class ProblemNumber23 {

    public static int minimumNumberOfSteps(boolean[][] fields, int startX, int startY, int endX, int endY) {
        return 0;
//        Map<String, Integer> visitedPoints = new HashMap<>();
//        visitedPoints.put(String.format("%d:%d", startX, startY), 0);
//        String target = String.format("%d:%d", endX, endY);
//
//        return tryToSolve(visitedPoints, target, startX, startY) {
//
//        }
    }

}