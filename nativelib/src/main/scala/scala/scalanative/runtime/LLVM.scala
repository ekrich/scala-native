package scala.scalanative
package runtime

import scalanative.unsafe._

/** Useful LLVM utilities
 *
 *  @see
 *    [[https://llvm.org/doxygen/group__LLVMCTarget.html LLVM C Target]]
 */
@link("LLVM-C")
@extern
object LLVM {
  type LLVMBool = CInt
  type LLVMTargetRef = Ptr[CStruct0]

  def LLVMGetDefaultTargetTriple(): CString = extern
  def LLVMNormalizeTargetTriple(targetTriple: CString): CString = extern
  def LLVMGetFirstTarget(): LLVMTargetRef = extern
  def LLVMGetHostCPUName(): CString = extern
  def LLVMGetHostCPUFeatures(): CString = extern
  // def LLVMInitializeNativeTarget(): LLVMBool = extern
  // def LLVMInitializeAllTargets(): Unit = extern

}
