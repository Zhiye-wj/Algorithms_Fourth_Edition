import edu.princeton.cs.algs4.StdOut;
public class Ex_1_1_05
{
    public static void main(String[] algs)
    {
        double x = Double.parseDouble(algs[0]);
        double y = Double.parseDouble(algs[1]);
        if (0<x&&x<1&&0<y&&y<1) StdOut.println("true");
        else                  StdOut.println("false");
    }
}