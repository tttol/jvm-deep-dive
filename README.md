# Step
```bash
$ javac CrashNative.java

$ javac -h . CrashNative.java

# libcrash.soではなくlibcrash.dylibでoutする
$ gcc -shared -fpic -o libcrash.dylib -I${JAVA_HOME}/include -I${JAVA_HOME}/include/darwin CrashNative.c

$ java -Djava.library.path=. CrashNative
```