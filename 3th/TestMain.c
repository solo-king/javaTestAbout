#include "TestMain.h"
#include<stdio.h>

JNIEXPORT jint JNICALL Java_TestMain_native_1call
  (JNIEnv *env, jobject obj, jint a){
	
	
	printf("%s,%d:a=%d\n",__func__,__LINE__, a);
	return -1;


}
