
  // class difference of squares calculator
final class DifferenceOfSquaresCalculator {
// inorder to compute square of sum
    int computeSquareOfSumTo(final int input) {
        int x = input * (input + 1) / 2;
        return x * x;
    }
// inorder to compute sum of squares
    int computeSumOfSquaresTo(final int input) {
        return input * (input + 1) * (input + input + 1) / 6;
    }
// inorder to compute difference of squares
    int computeDifferenceOfSquares(final int input) {
      return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }
}
