package utils;

/**
 * Class containing helpful methods.
 * @author Pavel_Verkhovtsov
 */
public class Utils {

	/**
	 * Combines matrix and array.
	 * @param firstMatrix Matrix
	 * @param secondMatrix Array
	 * @return Result matrix
	 */
	public static double[][] concatenationMatrix(final double[][] firstMatrix, final double[] secondMatrix){
		double [][] resultMatrix = new double[firstMatrix.length][firstMatrix[0].length+1];
		for (int i = 0; i<firstMatrix.length; i++){
			for (int j = 0; j<firstMatrix[0].length; j++){
				resultMatrix[i][j] = firstMatrix[i][j];
			}
		}

		for (int i = 0; i<firstMatrix.length; i++){
			resultMatrix[i][firstMatrix[0].length] = secondMatrix[i];
		}
		return resultMatrix;
	}

	/**
	 * Verify matrix range.
	 * @param matrix matrix for inspection
	 * @param range Expected matrix range
	 * @return result (true/false)
	 */
	private static boolean verifyMatrixRange(final double[][] matrix, final int range){
		return (matrix.length==range && matrix[0].length==range);
	}

	/**
	 * Verify matrix range.
	 * @param array array for inspection
	 * @param range Expected matrix range
	 * @return result (true/false)
	 */
	private static boolean verifyMatrixRange(final double[] array, final int range){
		return (array.length==range);
	}

	/**
	 * Verify range of matrix and array.
	 * @param matrix matrix for inspection
	 * @param array array for inspection
	 * @param range Expected range
	 */
	public static void verifyMatrixRange(final double[][] matrix, final double[] array, final int range){
		if (!(verifyMatrixRange(matrix, range) && Utils.verifyMatrixRange(array, range))){
			System.out.println("Error in matrix range");
			System.exit(1);
		}
	}
}