package pl.ravis96.restcalculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pl.ravis96.restcalculator.operator.Operator;
import pl.ravis96.restcalculator.operator.OperatorType;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RestCalculatorApplicationTests {

	@Test
	void testAdd() {
		final OperatorType addOperator = OperatorType.ADD;
		final Operator operator = addOperator.getOperator();

		assertEquals(20, operator.result(10, 10));
	}

	@Test
	void testSubtract() {
		final OperatorType addOperator = OperatorType.SUBTRACT;
		final Operator operator = addOperator.getOperator();

		assertEquals(30, operator.result(40, 10));
	}

	@Test
	void testMultiply() {
		final OperatorType addOperator = OperatorType.MULTIPLY;
		final Operator operator = addOperator.getOperator();

		assertEquals(25, operator.result(5, 5));
	}

	@Test
	void testDivide() {
		final OperatorType addOperator = OperatorType.DIVIDE;
		final Operator operator = addOperator.getOperator();

		assertEquals(5, operator.result(10, 2));
	}

	@Test
	void testReset() {
		final OperatorType addOperator = OperatorType.MULTIPLY;
		final Operator operator = addOperator.getOperator();

		assertEquals(0, operator.result(-999999, 0));
	}

}
