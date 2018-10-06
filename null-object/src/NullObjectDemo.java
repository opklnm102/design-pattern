import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * Created by ethan.kim on 2018. 10. 6..
 */
public class NullObjectDemo {

    public static void main(String[] args) {
        Application app = new Application(new NullPrintStream());
        app.doSomething();
    }
}

class NullOutputStream extends OutputStream {

    @Override
    public void write(int b) throws IOException {
        // do nothing
    }
}

class NullPrintStream extends PrintStream {

    public NullPrintStream() {
        super(new NullOutputStream());
    }
}

class Application {
    private PrintStream debugOut;

    public Application(PrintStream debugOut) {
        this.debugOut = debugOut;
    }

    public void doSomething() {
        int sum = 0;
        for(int i=0; i<10; i++) {
            sum+=1;
            debugOut.println("i = " + i);
        }
        System.out.println("sum = " + sum);
    }
}