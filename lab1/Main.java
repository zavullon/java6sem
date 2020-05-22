public class Main {
	public static void main(String[] args) {
			byte v_byte = 120;
			short v_short = 129;
			char v_char = 'a';
			int v_int = 65999;
			long v_long = 429496729;
			double v_double = 0.3333333333333333;
			float v_float = 1 / 3;
			boolean v_boolean = true;
			System.out.println("This is a byte: " + v_byte);
			System.out.println("This is a short: " + v_short);
			System.out.println("This is a char: " + v_char);
			System.out.println("This is a int: " + v_int);
			System.out.println("This is a long: " + v_long);
			System.out.println("This is a double: " + v_double);
			System.out.println("This is a float: " + v_float);
			System.out.println("This is a boolean: " + v_boolean);
			while(v_char - 1 != 'z') {
				System.out.println(v_char++);
			}
			long begin = new java.util.Date().getTime();
			for(int i = 0 ; i <= 100000000 ; i++){}
			long end = new java.util.Date().getTime();
			System.out.println(end - begin);
			begin = new java.util.Date().getTime();
			for(long i = 0 ; i <= 100000000 ; i++){}
			end = new java.util.Date().getTime();
			System.out.println(end - begin);
			int[] mas = {12, 43, 12, -65, 778, 123, 32, 76};	
			int max = mas[0];
			for(int i = 0 ; i < 8 ; i++) {
				if(mas[i] > max) {
					max = mas[i];
				}
			}
			System.out.println(max);
			int matrix[][] = new int[3][3];
			for(int i = 0 ; i < 3 ; i++) {
				for(int j = 0 ; j < 3 ; j++) {
					matrix[i][j] = (int)Math.round(Math.random() * 10);
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
			}
			int tmp;
			for(int i = 0 ; i < 3 ; i++) {
				for(int j = i ; j < 3 ; j++) {
					tmp = matrix[i][j];
					matrix[i][j] = matrix[j][i];
					matrix[j][i] = tmp;
					
				}
			}
			for(int i = 0 ; i < 3 ; i++) {
				for(int j = 0 ; j < 3 ; j++) {
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
			}
	}
}
