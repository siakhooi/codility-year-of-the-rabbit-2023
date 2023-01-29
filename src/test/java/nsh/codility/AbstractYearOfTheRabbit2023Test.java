package nsh.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public abstract class AbstractYearOfTheRabbit2023Test {
	abstract YearOfTheRabbit2023Interface getTestObject();

	YearOfTheRabbit2023Interface testObject;

	@BeforeEach
	void setup() {
		testObject = getTestObject();
	}

	@ParameterizedTest
	@MethodSource
	void test_samples(int E, int[] A, int[] B) {
		assertEquals(E, testObject.solution(A, B));
	}

	static Stream<Arguments> test_samples() {
		return Stream.of( //
				Arguments.of(2, new int[] {1, 3, 5, 2, 8, 7}, new int[] {7, 1, 9, 8, 5, 7}), //
				Arguments.of(-1, new int[] {1, 1, 1, 1}, new int[] {1, 2, 3, 4}), //
				Arguments.of(0, new int[] {3, 5, 0, 2, 4}, new int[] {1, 3, 10, 6, 7}));
	}

	@ParameterizedTest
	@MethodSource
	void short_sample(int E, int[] A, int[] B) {
		assertEquals(E, testObject.solution(A, B));
	}

	static Stream<Arguments> short_sample() {
		return Stream.of( //
				Arguments.of(0, new int[] {1}, new int[] {7}), //
				Arguments.of(-1, new int[] {1}, new int[] {1}));
	}
}
