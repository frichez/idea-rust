// This is a generated file. Not intended for manual editing.
package vektah.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustFunctionDeclaration extends PsiElement {

  @Nullable
  RustFunctionType getFunctionType();

  @Nullable
  RustGenericParams getGenericParams();

  @NotNull
  List<RustSelfArg> getSelfArgList();

  @NotNull
  List<RustStandardArg> getStandardArgList();

  @NotNull
  List<RustTupleArg> getTupleArgList();

  @Nullable
  RustTypeBasic getTypeBasic();

  @Nullable
  RustTypeClosure getTypeClosure();

  @Nullable
  RustTypeNone getTypeNone();

  @Nullable
  RustTypeProc getTypeProc();

  @Nullable
  RustTypeTuple getTypeTuple();

}
