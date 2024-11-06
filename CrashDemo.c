#include <jni.h>
#include "CrashDemo.h" // 生成されたヘッダファイルをインクルード
#include <stdlib.h>

JNIEXPORT void JNICALL Java_CrashDemo_causeSegmentationFault(JNIEnv *env, jobject obj) {
    int *ptr = NULL; // NULLポインタ
    *ptr = 1;        // NULL参照でセグメンテーション違反を発生させる
}