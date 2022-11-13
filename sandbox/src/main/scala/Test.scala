import scalanative.runtime.LLVM._
import scalanative.unsafe._
import scalanative.libc._

object Test {
  def main(args: Array[String]): Unit = {
    println("Hello, World!")
    val tt = LLVMGetDefaultTargetTriple()
    stdio.printf(c"Default: %s\n", tt)
    val nt = LLVMNormalizeTargetTriple(tt)
    stdio.printf(c"Normalized: %s\n", nt)
    val ft = LLVMGetFirstTarget()
    println(ft)
    val cpu = LLVMGetHostCPUName()
    stdio.printf(c"CPU: %s\n", cpu)
    val f = LLVMGetHostCPUFeatures()
    stdio.printf(c"Features: %s\n", f)
  }
}
