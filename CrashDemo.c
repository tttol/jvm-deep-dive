#include <jni.h>
#include "CrashDemo.h" 
#include <stdlib.h>

JNIEXPORT void JNICALL Java_CrashDemo_causeSegmentationFault(JNIEnv *env, jobject obj) {
    int *ptr = NULL; 
    *ptr = 1;        
}