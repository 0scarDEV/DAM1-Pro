package expresiones;

public class E700 {
    public static void main(String[] args) {
        int i = 8;
        float x = 0.005F, y = -0.01F;
        char c = 'c', d = 'd';

        int j = (-i + 13);

        System.out.println(i <= j);
        System.out.println(c > d);
        System.out.println(x >= 0);
        System.out.println(x < y--);
        System.out.println(j != 6);
        System.out.println(c == 99);
        System.out.println(!(i <= j));
        System.out.println(!(c == 99));
        System.out.println(!(x > 0));
        System.out.println(-j == i - 13);
        System.out.println(++x > 0);
        System.out.println(y-- < 1);
        System.out.println(c > d || c > 0);
        System.out.println(5 * (i + j) > 'c');
        System.out.println(2 * x + y == 0);
        System.out.println(2 * x (y == 0));
        System.out.println(x + y  >= 0);
        System.out.println(x < ++y);
        System.out.println(- (i + j) != -i + j);
        System.out.println(i <= j && i >= c);
        System.out.println(i > 0 && j < 5);
        System.out.println(i > 0 || j < 5);
        System.out.println(x > y && i > 0 || j < 5);
        System.out.println((3 * i - 2 * j) % (2 * d - c) > 3 * d);
        System.out.println(2 * ((i / 5) + (4 * (j - 3)) % (i + j - 2)) >= 10);
        System.out.println((i - 3 * j) % (c + 2 * d) / (x - y) >= 0);
    }

    private static int x(boolean b) {
        return 0;
    }
}