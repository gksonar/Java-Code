package InterviewQuestion;

import java.io.Closeable;
import java.io.IOException;

public class ReverseWord {
    class B implements Closeable {
        public void close() {
            throw new RuntimeException("a");

        }
    }

    public static void main(String[] args) {
        new ReverseWord().run();
    }

    public void run() {
        try (B l = new B();) {
            throw new IOException();
        } catch (Exception e) {
            throw new RuntimeException("c");
        }
    }
}
