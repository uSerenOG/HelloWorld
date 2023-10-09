import java.util.ArrayList;

public class Polynomier {
    public void main(String[] args) {
        Polynomium p1 = new ForsteggradsPolynomium(3, 2);
        Polynomium p2 = new AndengradsPolynomium(2, 4, 6);

        ArrayList<Polynomium> list = new ArrayList<Polynomium>();
        list.add(p1);
        list.add(p2);

        for (Polynomium p : list) {
            System.out.println(p);
        }
    }

    abstract class Polynomium {
        abstract double f(double x);
    }

    class ForsteggradsPolynomium extends Polynomium {
        int a, b;


        ForsteggradsPolynomium(int a, int b) {
            this.a = a;
            this.b = b;
        }

        double f(double x) {
            return a * x + b;

        }

    }

    class AndengradsPolynomium extends Polynomium {
        int a, b, c;


        AndengradsPolynomium(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        double f(double x) {
            return a * x * x + b * x + c;
        }

        @Override
        public String toString() {
            return "Andengradspolynomiets a=" + a + " b=" + this.b + " c=" + this.c;
        }
        }
    }

