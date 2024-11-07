#include <jni.h>
#include "CrashNative.h" 
#include <stdlib.h>

JNIEXPORT void JNICALL Java_CrashNative_causeSegmentationFault(JNIEnv *env, jobject obj) {
    int *ptr = NULL; 
    *ptr = 1;        
}