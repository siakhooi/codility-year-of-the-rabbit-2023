package nsh.codility;

public class YearOfTheRabbit2023A implements YearOfTheRabbit2023Interface {

	public int solution(int[] A, int[] B) {
		int R = -1;
		int N = A.length;

		for (int i = 0; i < N; i++) {
			boolean hasDislike = false;
			for (int j = 0; j < N; j++) {
				int n = (j - i + N) % N;

				if (A[j] == B[n]) {
					hasDislike = true;
					break;
				}
			}
			if (!hasDislike) {
				R = i;
				break;
			}
		}
		return R;
	}
}
