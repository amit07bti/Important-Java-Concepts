package string_concept;

import java.io.*;

public class Demo_String {
    public static void main(String[] args) {
        // String pool demonstration using intern()
        String s1 = new String("java"); // Creates a String object in the heap (not the pool)
        String s2 = s1.intern();        // Checks the pool; if "java" is not there, it's added. If it is, s2 points to the pool version.
        String s3 = "java";             // Creates "java" directly in the String pool.

        // Comparison 1: s2 (pool reference) == s3 (pool reference)
        // This prints true because both s2 and s3 reference the same "java" object in the String pool.
        System.out.println("s2 == s3: " + (s2 == s3));

        // Comparison 2: s1 (heap object) equals s2 (pool object)
        // This prints true because String's equals() method checks for content equality, not reference equality.
        System.out.println("s1.equals(s2): " + s1.equals(s2));

        // Note: The CustomClassLoader below is unused in this main method, but it is provided for demonstration
        // and is corrected for best practices (static nested class and buffered file reading).
    }

    /**
     * Corrected Custom ClassLoader implementation.
     * It is defined as static to be independent of Demo_String instances.
     */
    public static class CustomClassLoader extends ClassLoader {
        private final String classPath;

        public CustomClassLoader(String classPath, ClassLoader parent) {
            super(parent);
            this.classPath = classPath;
        }

        @Override
        protected Class<?> findClass(String name) throws ClassNotFoundException {
            // Step 1: Get the bytecode for the class
            byte[] classBytes;
            try {
                classBytes = loadClassData(name);
            } catch (IOException e) {
                // Wrap any IO errors (like file not found) into a ClassNotFoundException
                throw new ClassNotFoundException("Failed to load class data for: " + name, e);
            }

            // Step 2: Convert the byte array into a Class object
            return defineClass(name, classBytes, 0, classBytes.length);
        }

        /**
         * Loads the class bytecode from the file system using a buffered approach for efficiency.
         */
        private byte[] loadClassData(String className) throws IOException {
            // Construct the platform-independent file path: e.g., "com.example.MyClass" -> "com/example/MyClass.class"
            String fileName = className.replace('.', File.separatorChar) + ".class";
            File file = new File(classPath, fileName);

            if (!file.exists()) {
                // Throwing a dedicated exception if the file doesn't exist
                throw new FileNotFoundException("Class file not found: " + file.getAbsolutePath());
            }

            // Use try-with-resources to ensure streams are closed automatically
            try (FileInputStream fis = new FileInputStream(file);
                 ByteArrayOutputStream bos = new ByteArrayOutputStream()) {

                byte[] buffer = new byte[4096]; // Use a buffer for efficient reading
                int bytesRead;

                // Read chunks of data until the end of the stream is reached (-1)
                while ((bytesRead = fis.read(buffer)) != -1) {
                    bos.write(buffer, 0, bytesRead);
                }

                return bos.toByteArray();
            }
        }
    }
}
