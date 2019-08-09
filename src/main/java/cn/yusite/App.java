package cn.yusite;

import java.io.IOException;
import java.io.InputStream;

/**
 * Hello world!
 */
public class App {

    public String read() throws IOException {
        InputStream resourceAsStream = this.getClass().getResourceAsStream("/META-INF/application.properties");
        byte[] data = new byte[1024];
        resourceAsStream.read(data);
        String s = new String(data);
        return s;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        App app = new App();
        System.out.println(app.read());


    }
}
