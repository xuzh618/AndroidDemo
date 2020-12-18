# if cmake version < 3.6 , may occurred "Ninja" error
# you should modify the version >= 3.6
cmake_minimum_required(VERSION 3.6)

# generate libhello.so
add_library(hello SHARED HelloNative.cpp)

# link libhello.so and liblog.so
target_link_libraries(hello log)
