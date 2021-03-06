/**
 */
package net.certware.evidence.hugin.netDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.netDSL.List2#getList <em>List</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getList2()
 * @model
 * @generated
 */
public interface List2 extends MatrixRow
{
  /**
   * Returns the value of the '<em><b>List</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.evidence.hugin.netDSL.MatrixRow}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' containment reference list.
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getList2_List()
   * @model containment="true"
   * @generated
   */
  EList<MatrixRow> getList();

} // List2
