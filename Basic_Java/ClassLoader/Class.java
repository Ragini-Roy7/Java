package ClassLoader;
import java.io.*;
public class Class {


    public class MyClassLoader extends ClassLoader {
        @Override
        protected java.lang.Class<?> findClass(String name) throws ClassNotFoundException {
            try {
                String fileName = name.replace('.', '/') + ".class";
                byte[] bytes = loadClassData(fileName);
                return defineClass(name, bytes, 0, bytes.length);
            } catch (IOException e) {
                throw new ClassNotFoundException(name, e);
            }
        }

        private byte[] loadClassData(String fileName) throws IOException {
            try (InputStream is = new FileInputStream(fileName);
                 ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = is.read(buffer)) != -1) {
                    baos.write(buffer, 0, bytesRead);
                }
                return baos.toByteArray();
            }
        }
    }

}
