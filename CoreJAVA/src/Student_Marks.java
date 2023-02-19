abstract class Mark {
	abstract float getPercentage();
}

class A extends Mark {
	float sub1, sub2, sub3;
	float per = 0;

	A(float a, float b, float c) {
		sub1 = a;
		sub2 = b;
		sub3 = c;
	}

	@Override
	float getPercentage() {
		per = (sub1 + sub2 + sub3) / 3;
		return per;
	}
}

class B extends Mark {
	float sub1, sub2, sub3, sub4;
	float per = 0;

	B(float a, float b, float c, float d) {
		sub1 = a;
		sub2 = b;
		sub3 = c;
		sub4 = d;
	}

	@Override
	float getPercentage() {
		per = (sub1 + sub2 + sub3 + sub4) / 4;
		return per;
	}
}

public class Student_Marks {
	public static void main(String[] args) {
		A obj = new A(70f, 75f, 80f);
		System.out.println("First student Percentage : " + obj.getPercentage());

		B obj2 = new B(90f, 80f, 91f, 88f);
		System.out.println("Second Student PErcentage : " + obj2.getPercentage());
	}
}