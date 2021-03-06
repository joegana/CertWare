/**
 */
package ftp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ftp.OrGate#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see ftp.FtpPackage#getOrGate()
 * @model
 * @generated
 */
public interface OrGate extends FTNode {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link ftp.FTNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see ftp.FtpPackage#getOrGate_Inputs()
	 * @model lower="2"
	 * @generated
	 */
	EList<FTNode> getInputs();

} // OrGate
