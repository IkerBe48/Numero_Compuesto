import org.example.NumeroCompuesto;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;


public class MainTest {

    @Test
    public void main() throws IOException {

        //int i = new Scanner(System.in);
        int i = 28;
        //Scanner i = new Scanner(int)

        NumeroCompuesto.esCompuesto(i);

        if (NumeroCompuesto.esCompuesto(i))
            Assert.assertTrue("El numero " + i + " es compuesto ",NumeroCompuesto.esCompuesto(i));
        else
            Assert.assertTrue("El numero " + i + " es primo",NumeroCompuesto.esCompuesto(i));

    }

}