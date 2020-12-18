//
// Created by Tiger on 2020/12/2.
//
#include <jni.h>
#include <android/log.h>


#ifdef __cplusplus
extern "C" {
#endif

JNIEXPORT void JNICALL
Java_com_tiger_myapplication_MainActivity_methodFromNative(JNIEnv
* env,
jobject thiz
){
// TODO: implement methodFromNative()

__android_log_print(ANDROID_LOG_INFO,
"TIGER","hello");

}

#ifdef __cplusplus
}
#endif







