#include <llvm-c/TargetMachine.h>

char *scalanative_default_target_triple() {
    // if(LLVMInitializeNativeTarget()) {
    //     printf("Initialized");
    // }
    // LLVMTargetRef ref = LLVMGetFirstTarget();
    return LLVMGetDefaultTargetTriple();
}