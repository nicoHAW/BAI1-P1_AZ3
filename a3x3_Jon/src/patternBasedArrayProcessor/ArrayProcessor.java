// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package patternBasedArrayProcessor;

/**
 * ArrayProcessor - see task
 * 
 * @author (your name(s))
 * @version (a version number or a date)
 *
 */
public class ArrayProcessor {

	public long process(long[][] theArray) {
		// boundaries to guarantee valid indexes for regular 2 dimensional arrays
		int horizontalBoundary = theArray.length - 4;
		int verticalBoundary = theArray.length - 4;

		// specific pattern
		int[][] pairs = { { 0, 1 }, { 0, 2 }, { 3, 1 }, { 3, 2 }, { 1, 0 }, { 2, 0 }, { 1, 3 }, { 2, 3 } };

		long result = 0;

		for (int i = 0; i <= horizontalBoundary; i++) {
			for (int j = 0; j <= verticalBoundary; j++) {
				// additional boundary check for irregular 2 dimensional arrays

				if (validIndexes(theArray, i, j, pairs)) {
					// add sum of the integers of the pattern
					for (int[] arr : pairs) {
						result += theArray[i + arr[0]][j + arr[1]];

					}
				}
			}
		}

		return result;
	}// method()

	// checks if column exists in a specific row
	public boolean validIndexes(long[][] theArray, int i, int j, int[][] pairs) {

		for (int[] pair : pairs) {
			if (j + pair[1] >= theArray[i + pair[0]].length) {
				return false;
			}
		}

		return true;

	}

}// class
