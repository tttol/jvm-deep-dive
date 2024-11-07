# Step
```bash
$ javac CrashDemo.java

$ javac -h . CrashDemo.java

# libcrash.soではなくlibcrash.dylibでoutする
$ gcc -shared -fpic -o libcrash.dylib -I${JAVA_HOME}/include -I${JAVA_HOME}/include/darwin CrashDemo.c

$ java -Djava.library.path=. CrashDemo
```